package com.koroyan.restassuredexample.pojos.response;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "PersonIdentification")
public class PersonIdentification {
    private String id;
    private String name;
    private String ssn;
    private String dob;

    public PersonIdentification() {
    }

    public PersonIdentification(String id, String name, String ssn, String dob) {

        this.id = id;
        this.name = name;
        this.ssn = ssn;
        this.dob = dob;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    @XmlElement(name = "ID")
    public String getId() {
        return id;
    }

    @XmlElement(name = "SSN")
    public String getSSN() {
        return ssn;
    }

    @XmlElement(name = "DOB")
    public String getDOB() {
        return dob;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

}
