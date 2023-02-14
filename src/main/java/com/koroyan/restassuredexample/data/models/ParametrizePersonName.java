package com.koroyan.restassuredexample.data.models;

public class ParametrizePersonName {

    private String name;

    public ParametrizePersonName(String name) {
        this.name =name;
    }
    public String name() {return name;}
}
