package com.koroyan.restassuredexample.pojos.response;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "GetListByNameResult")
public class GetListByNameResult {

    private PersonIdentification personIdentification[];

    public GetListByNameResult() {
    }

    public GetListByNameResult(PersonIdentification personIdentification[]) {
        this.personIdentification = personIdentification;

    }

    public void setPersonIdentification(PersonIdentification personIdentification[]) {
        this.personIdentification = personIdentification;
    }

    @XmlElement(name = "PersonIdentification")
    public PersonIdentification[] getPersonIdentification() {
        return personIdentification;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}

