package com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio;

import java.util.Date;

public class BilanRenal {
    private Date datePr;
    private Double creat;
    private Double clairCreat;
    private Double uree;

    public BilanRenal() {
    }

    public BilanRenal(Date datePr, Double creat, Double clairCreat, Double uree) {
        this.datePr = datePr;
        this.creat = creat;
        this.clairCreat = clairCreat;
        this.uree = uree;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getCreat() {
        return creat;
    }

    public void setCreat(Double creat) {
        this.creat = creat;
    }

    public Double getClairCreat() {
        return clairCreat;
    }

    public void setClairCreat(Double clairCreat) {
        this.clairCreat = clairCreat;
    }

    public Double getUree() {
        return uree;
    }

    public void setUree(Double uree) {
        this.uree = uree;
    }
}
