package com.yobitrust.HachCovid19Back.Models.PatientParts.ExamRadioParaCli;

import java.util.Date;

public class TdmTho {
    private Date datePr;
    private String result;
    private Double aspect;

    public TdmTho(Date datePr, String result, Double aspect) {
        this.datePr = datePr;
        this.result = result;
        this.aspect = aspect;
    }

    public TdmTho() {
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Double getAspect() {
        return aspect;
    }

    public void setAspect(Double aspect) {
        this.aspect = aspect;
    }
}
