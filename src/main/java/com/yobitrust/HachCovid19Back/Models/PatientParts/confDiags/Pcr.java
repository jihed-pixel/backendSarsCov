package com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags;

import com.yobitrust.HachCovid19Back.Models.PatientParts.ConfDiag;

import java.util.Date;

public class Pcr extends ConfDiag {
    private Date datePr;
    private String type;
    private String result;

    public Pcr(Date datePr, String type, String result) {
        this.datePr = datePr;
        this.type = type;
        this.result = result;
    }

    public Pcr() {
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
