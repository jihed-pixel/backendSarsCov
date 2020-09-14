package com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags;

import com.yobitrust.HachCovid19Back.Models.PatientParts.ConfDiag;

import java.util.Date;

public class Serologie  extends ConfDiag {
    private Date datePr;
    private String result;

    public Serologie() {
    }

    public Serologie(Date datePr, String result) {
        this.datePr = datePr;
        this.result = result;
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
}