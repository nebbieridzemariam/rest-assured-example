package com.koroyan.restassuredexample.repository;

import com.koroyan.restassuredexample.pojos.response.FavoriteColors;
import com.koroyan.restassuredexample.pojos.response.FindPersonResult;
import com.koroyan.restassuredexample.pojos.response.Home;
import com.koroyan.restassuredexample.pojos.response.Office;
import com.koroyan.restassuredexample.utils.DateUtils;

import java.text.ParseException;
import java.util.*;

public class PersonResultData {
    private final HashMap<String, FindPersonResult> personResults = new HashMap<String, FindPersonResult>() {
        {
            Date date = null;
            try {
                date = DateUtils.stringToDate("2000-03-20");
            } catch (ParseException e) {
                e.printStackTrace();
            }
            FindPersonResult findPersonResult = new FindPersonResult(
                    "Newton,Dave R.",
                    "384-10-6538",
                    date,
                    new Home(
                            "6977 First Street",
                            "Pueblo",
                            "AK",
                            63163
                    ),
                    new Office(
                            "9984 Second Blvd",
                            "Washington",
                            "MN",
                            42829
                    ),
                    new FavoriteColors("Red"),
                    22);
            put("1", findPersonResult);
        }
    };

    public FindPersonResult getPersonByID(String id) {
        return personResults.get(id);
    }
}
