package com.yobitrust.HachCovid19Back.Models.RequestModels;

import java.util.Date;

public class TraitementModel {
    private Double dosage;//dosage ou debit
    private Date dateD;
    private Date dateF;
    private String trai;
    private Date dateDiag;
    private String pactt;

    public TraitementModel() {
    }

    public TraitementModel(Double dosage, Date dateD, Date dateF, String trai, Date dateDiag,String pactt) {
        this.dosage = dosage;
        this.dateD = dateD;
        this.dateF = dateF;
        this.trai = trai;
        this.dateDiag = dateDiag;
        this.pactt=pactt;
    }

    public Double getDosage() {
        return dosage;
    }

    public void setDosage(Double dossge) {
        this.dosage = dossge;
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

    public void setDateF(Date dateF) {
        this.dateF = dateF;
    }

    public String getTrai() {
        return trai;
    }

    public void setTrai(String trai) {
        this.trai = trai;
    }

    public Date getDateDiag() {
        return dateDiag;
    }

    public void setDateDiag(Date dateDiag) {
        this.dateDiag = dateDiag;
    }

    public String getPactt() {
        return pactt;
    }

    public void setPactt(String pactt) {
        this.pactt = pactt;
    }
}
