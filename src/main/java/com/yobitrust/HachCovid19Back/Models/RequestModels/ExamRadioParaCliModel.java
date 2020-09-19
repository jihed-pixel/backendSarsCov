package com.yobitrust.HachCovid19Back.Models.RequestModels;

import java.util.Date;

public class ExamRadioParaCliModel {
    private Date datepr;
    private String result;
    private String espaceQT;
    private Double aspect;
    private Integer nbQua;
    private String type;
    private Date dateDiag;

    public ExamRadioParaCliModel() {
    }

    public ExamRadioParaCliModel(Date datepr, String result, String espaceQT, Double aspect, Integer nbQua, String type, Date dateDiag) {
        this.datepr = datepr;
        this.result = result;
        this.espaceQT = espaceQT;
        this.aspect = aspect;
        this.nbQua = nbQua;
        this.type = type;
        this.dateDiag = dateDiag;
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

    public String getEspaceQT() {
        return espaceQT;
    }

    public void setEspaceQT(String espaceQT) {
        this.espaceQT = espaceQT;
    }

    public Double getAspect() {
        return aspect;
    }

    public void setAspect(Double aspect) {
        this.aspect = aspect;
    }

    public Integer getNbQua() {
        return nbQua;
    }

    public void setNbQua(Integer nbQua) {
        this.nbQua = nbQua;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateDiag() {
        return dateDiag;
    }

    public void setDateDiag(Date dateDiag) {
        this.dateDiag = dateDiag;
    }
}
