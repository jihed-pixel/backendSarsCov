package com.yobitrust.HachCovid19Back.Models.RequestModels;

import java.util.Date;

public class EvolutionModel {

    private Date dateD;
    private Date dateF;
    private Integer saps2;
    private Integer apache2;
    private Integer sofa;
    private Date dateS;
    private String typeS;
    private Date dateH;
    private String hopital;
    private String service;
    private String ville;
    private String lieu;
    private Date time;
    private Double value;
    private String type;
    private Date dateDiag;
    private String category;


    public EvolutionModel() {
    }

    public EvolutionModel(Date dateD, Date dataF, Integer saps2, Integer apache2, Integer sofa, Date dateS, String typeS, Date dateH, String hopital, String service, String ville, String lieu, Date time, Double value,String type,Date dateDiag,String category) {
        this.dateD = dateD;
        this.dateF = dataF;
        this.saps2 = saps2;
        this.apache2 = apache2;
        this.sofa = sofa;
        this.dateS = dateS;
        this.typeS = typeS;
        this.dateH = dateH;
        this.hopital = hopital;
        this.service = service;
        this.ville = ville;
        this.lieu = lieu;
        this.time = time;
        this.value = value;
        this.type=type;
        this.dateDiag=dateDiag;
        this.category=category;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public Date getDateF() {
        return dateF;
    }

    public void setDateF(Date dataF) {
        this.dateF = dataF;
    }

    public Integer getSaps2() {
        return saps2;
    }

    public void setSaps2(Integer saps2) {
        this.saps2 = saps2;
    }

    public Integer getApache2() {
        return apache2;
    }

    public void setApache2(Integer apache2) {
        this.apache2 = apache2;
    }

    public Integer getSofa() {
        return sofa;
    }

    public void setSofa(Integer sofa) {
        this.sofa = sofa;
    }

    public Date getDateS() {
        return dateS;
    }

    public void setDateS(Date dateS) {
        this.dateS = dateS;
    }

    public String getTypeS() {
        return typeS;
    }

    public void setTypeS(String typeS) {
        this.typeS = typeS;
    }

    public Date getDateH() {
        return dateH;
    }

    public void setDateH(Date dateH) {
        this.dateH = dateH;
    }

    public String getHopital() {
        return hopital;
    }

    public void setHopital(String hopital) {
        this.hopital = hopital;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
