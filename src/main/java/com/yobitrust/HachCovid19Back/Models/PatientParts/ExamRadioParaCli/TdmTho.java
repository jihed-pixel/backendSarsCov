package com.yobitrust.HachCovid19Back.Models.PatientParts.ExamRadioParaCli;

import java.util.Date;

public class TdmTho {
    private Date datepr;
    private String result;
    private String aspect;

    public TdmTho(Date datepr, String result, String aspect) {
        this.datepr = datepr;
        this.result = result;
        this.aspect = aspect;
    }

    public TdmTho() {
    }

    public Date getDatepr() {
        return datepr;
    }

    public void setDatepr(Date datepr) {
        this.datepr = datepr;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getAspect() {
        return aspect;
    }

    public void setAspect(String aspect) {
        this.aspect = aspect;
    }
}
