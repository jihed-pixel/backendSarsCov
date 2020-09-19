package com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio;

import java.util.Date;

public class GDSA {
    private Date datePr;
    private Double ph;
    private Double pao2;
    private Double paco2;
    private Double hco3_;
    private Double sao2;

    public GDSA(Date datePr, Double ph, Double pao2, Double paco2, Double hco3_, Double sao2) {
        this.datePr = datePr;
        this.ph = ph;
        this.pao2 = pao2;
        this.paco2 = paco2;
        this.hco3_ = hco3_;
        this.sao2 = sao2;
    }

    public GDSA() {
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getPh() {
        return ph;
    }

    public void setPh(Double ph) {
        this.ph = ph;
    }

    public Double getPao2() {
        return pao2;
    }

    public void setPao2(Double pao2) {
        this.pao2 = pao2;
    }

    public Double getPaco2() {
        return paco2;
    }

    public void setPaco2(Double paco2) {
        this.paco2 = paco2;
    }

    public Double getHco3_() {
        return hco3_;
    }

    public void setHco3_(Double hco3_) {
        this.hco3_ = hco3_;
    }

    public Double getSao2() {
        return sao2;
    }

    public void setSao2(Double sao2) {
        this.sao2 = sao2;
    }
}
