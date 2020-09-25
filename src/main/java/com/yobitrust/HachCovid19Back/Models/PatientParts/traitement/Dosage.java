package com.yobitrust.HachCovid19Back.Models.PatientParts.traitement;

import java.util.Date;

public class Dosage {
    private Double dosage;//dosage ou debit
    private Date dateD;
    private Date dateF;

    public Double getDosage() {
        return dosage;
    }

    public void setDosage(Double dosage) {
        this.dosage = dosage;
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

    public Dosage() {
    }

    public Dosage(Double dosage, Date dateD, Date dateF) {
        this.dosage = dosage;
        this.dateD = dateD;
        this.dateF = dateF;
    }
}
