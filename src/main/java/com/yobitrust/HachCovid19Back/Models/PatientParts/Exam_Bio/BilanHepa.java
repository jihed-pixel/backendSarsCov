package com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio;

import java.util.Date;

public class BilanHepa {
    private Date datePr;
    private Double biliru;
    private Double alat;
    private Double asat;
    private Double tp;
    private Double facteurV;
    private Double fibrinogene;
    private Double cpk_mb;
    private Double troponine ;
    private Double pro_bnp;
    private Double albumi;
    private Double d_dimère;
    private Double ldh;
    private Double crp;
    private Double procal;
    private Double ferri;

    public BilanHepa() {
    }

    public BilanHepa(Date datePr, Double biliru, Double alat, Double asat, Double tp, Double facteurV, Double fibrinogene, Double cpk_mb, Double troponine, Double pro_bnp, Double albumi, Double d_dimère, Double ldh, Double crp, Double procal, Double ferri) {
        this.datePr = datePr;
        this.biliru = biliru;
        this.alat = alat;
        this.asat = asat;
        this.tp = tp;
        this.facteurV = facteurV;
        this.fibrinogene = fibrinogene;
        this.cpk_mb = cpk_mb;
        this.troponine = troponine;
        this.pro_bnp = pro_bnp;
        this.albumi = albumi;
        this.d_dimère = d_dimère;
        this.ldh = ldh;
        this.crp = crp;
        this.procal = procal;
        this.ferri = ferri;
    }


    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getBiliru() {
        return biliru;
    }

    public void setBiliru(Double biliru) {
        this.biliru = biliru;
    }

    public Double getAlat() {
        return alat;
    }

    public void setAlat(Double alat) {
        this.alat = alat;
    }

    public Double getAsat() {
        return asat;
    }

    public void setAsat(Double asat) {
        this.asat = asat;
    }

    public Double getTp() {
        return tp;
    }

    public void setTp(Double tp) {
        this.tp = tp;
    }

    public Double getFacteurV() {
        return facteurV;
    }

    public void setFacteurV(Double facteurV) {
        this.facteurV = facteurV;
    }

    public Double getFibrinogene() {
        return fibrinogene;
    }

    public void setFibrinogene(Double fibrinogene) {
        this.fibrinogene = fibrinogene;
    }

    public Double getCpk_mb() {
        return cpk_mb;
    }

    public void setCpk_mb(Double cpk_mb) {
        this.cpk_mb = cpk_mb;
    }

    public Double getTroponine() {
        return troponine;
    }

    public void setTroponine(Double troponine) {
        this.troponine = troponine;
    }

    public Double getPro_bnp() {
        return pro_bnp;
    }

    public void setPro_bnp(Double pro_bnp) {
        this.pro_bnp = pro_bnp;
    }

    public Double getAlbumi() {
        return albumi;
    }

    public void setAlbumi(Double albumi) {
        this.albumi = albumi;
    }

    public Double getD_dimère() {
        return d_dimère;
    }

    public void setD_dimère(Double d_dimère) {
        this.d_dimère = d_dimère;
    }

    public Double getLdh() {
        return ldh;
    }

    public void setLdh(Double ldh) {
        this.ldh = ldh;
    }

    public Double getCrp() {
        return crp;
    }

    public void setCrp(Double crp) {
        this.crp = crp;
    }

    public Double getProcal() {
        return procal;
    }

    public void setProcal(Double procal) {
        this.procal = procal;
    }

    public Double getFerri() {
        return ferri;
    }

    public void setFerri(Double ferri) {
        this.ferri = ferri;
    }
}
