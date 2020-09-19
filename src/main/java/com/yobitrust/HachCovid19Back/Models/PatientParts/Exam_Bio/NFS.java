package com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio;

import java.util.Date;

public class NFS {
    private Date datePr;
    private  Double gb;
    private Double lym;
    private Double pla;
    private Double hb;
    private Double ht;

    public NFS() {
    }

    public NFS(Date datePr, Double gb, Double lym, Double pla, Double hb, Double ht) {
        this.datePr = datePr;
        this.gb = gb;
        this.lym = lym;
        this.pla = pla;
        this.hb = hb;
        this.ht = ht;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getGb() {
        return gb;
    }

    public void setGb(Double gb) {
        this.gb = gb;
    }

    public Double getLym() {
        return lym;
    }

    public void setLym(Double lym) {
        this.lym = lym;
    }

    public Double getPla() {
        return pla;
    }

    public void setPla(Double pla) {
        this.pla = pla;
    }

    public Double getHb() {
        return hb;
    }

    public void setHb(Double hb) {
        this.hb = hb;
    }

    public Double getHt() {
        return ht;
    }

    public void setHt(Double ht) {
        this.ht = ht;
    }
}
