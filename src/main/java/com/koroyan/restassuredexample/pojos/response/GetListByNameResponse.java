package com.koroyan.restassuredexample.pojos.response;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "GetListByNameResponse")
@XmlType(namespace = "http://tempuri.org")
public class GetListByNameResponse {
    private GetListByNameResult getListByNameResult;

    public GetListByNameResponse(){}

    public GetListByNameResponse(GetListByNameResult getListByNameResult) {
        this.getListByNameResult = getListByNameResult;
    }

    @XmlElement(name = "GetListByNameResult")
    public GetListByNameResult getGetListByNameResult() {
        return getListByNameResult;
    }

    public void setGetListByNameResult(GetListByNameResult getListByNameResult) {
        this.getListByNameResult = getListByNameResult;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
