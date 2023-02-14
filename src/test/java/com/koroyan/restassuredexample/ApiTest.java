package com.koroyan.restassuredexample;

import com.koroyan.restassuredexample.data.dataproviders.DataProviders;
import com.koroyan.restassuredexample.data.models.MathOperation;
import com.koroyan.restassuredexample.pojos.response.FindPersonResult;
import com.koroyan.restassuredexample.pojos.response.GetListByNameResult;
import com.koroyan.restassuredexample.pojos.response.PersonIdentification;
import com.koroyan.restassuredexample.repository.PersonRepository;
import com.koroyan.restassuredexample.repository.PersonRepositoryImpl;
import com.koroyan.restassuredexample.steps.Step;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class ApiTest {

    Step step = new Step();
    PersonRepository personRepository = new PersonRepositoryImpl();

    @Test(dataProvider = "mathOperations", dataProviderClass = DataProviders.class)
    public void addIntegerTest(MathOperation mathOperation) {
        int apiResult = step.addInteger(mathOperation.getArg1(), mathOperation.getArg2());
        Assert.assertEquals(apiResult + 1, mathOperation.addResult());
    }

    @Test(dataProvider = "mathOperations", dataProviderClass = DataProviders.class)
    public void addIntegerXmlTest(MathOperation mathOperation) throws IOException {
        int apiResult = step.addIntegerXml(mathOperation.getArg1(), mathOperation.getArg2());
        Assert.assertEquals(apiResult, mathOperation.addResult());
    }

    @Test(dataProvider = "mathOperations", dataProviderClass = DataProviders.class)
    public void addIntegerStringTest(MathOperation mathOperation) throws IOException {
        int apiResult = step.addIntegerString(mathOperation.getArg1(), mathOperation.getArg2());
        Assert.assertEquals(apiResult, mathOperation.addResult());
    }

    @Test
    public void findPersonTest() throws JSONException {
        String personId = "1";
        FindPersonResult apiPerson = step.findPerson(personId);

        FindPersonResult databasePerson = personRepository.getPersonById(personId);

        JSONAssert.assertEquals(apiPerson.toString(), databasePerson.toString(), false);
    }

    @Test
    public void getListByNameTest() throws JSONException, JAXBException {
        String name = "Xavier";

        GetListByNameResult getListByNameResult = step.getListByName(name);
        PersonIdentification[] personIdentificationList = getListByNameResult.getPersonIdentification();

        for (int i = 0; i < personIdentificationList.length; i++) {
            Assert.assertTrue(personIdentificationList[i].getName().contains(name));
        }

    }


}
