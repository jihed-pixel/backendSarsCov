package com.yobitrust.HachCovid19Back.Models.PatientParts.ExamRadioParaCli;

import java.util.Date;

public class Thorax {
    private Date datepr;
    private String result;
    private Integer nbQua;

    public Thorax() {
    }

    public Thorax(Date datepr, String result, Integer nbQua) {
        this.datepr = datepr;
        this.result = result;
        this.nbQua = nbQua;
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

    public Integer getNbQua() {
        return nbQua;
    }

    public void setNbQua(Integer nbQua) {
        this.nbQua = nbQua;
    }
}
