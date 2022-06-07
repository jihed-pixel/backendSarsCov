package com.yobitrust.HachCovid19Back.Models.RequestModels;

import java.util.Date;

public class ExamBioModel {
    private Date datePr;
    private String type;
    private Double biliru;
    private Double biliru1;
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
    private Double creat;
    private Double clairCreat;
    private Double uree;
    private Double ph;
    private Double pao2;
    private Double paco2;
    private Double hco3_;
    private Double sao2;
    private Double nak;
    private Double nak1;
    private Double nakur;
    private Double nakur1;
    private  Double gb;
    private Double lym;
    private Double pla;
    private Double hb;
    private Double ht;

    public ExamBioModel() {
    }

    public ExamBioModel(Date datePr, String type, Double biliru, Double biliru1, Double alat, Double asat, Double tp, Double facteurV, Double fibrinogene, Double cpk_mb, Double troponine, Double pro_bnp, Double albumi, Double d_dimère, Double ldh, Double crp, Double procal, Double ferri, Double creat, Double clairCreat, Double uree, Double ph, Double pao2, Double paco2, Double hco3_, Double sao2, Double nak, Double nak1, Double nakur, Double nakur1, Double gb, Double lym, Double pla, Double hb, Double ht) {
        this.datePr = datePr;
        this.type = type;
        this.biliru = biliru;
        this.biliru1 = biliru1;
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
        this.creat = creat;
        this.clairCreat = clairCreat;
        this.uree = uree;
        this.ph = ph;
        this.pao2 = pao2;
        this.paco2 = paco2;
        this.hco3_ = hco3_;
        this.sao2 = sao2;
        this.nak = nak;
        this.nak1 = nak1;
        this.nakur = nakur;
        this.nakur1 = nakur1;
        this.gb = gb;
        this.lym = lym;
        this.pla = pla;
        this.hb = hb;
        this.ht = ht;
    }

    public Double getNakur() {
        return nakur;
    }

    public void setNakur(Double nakur) {
        this.nakur = nakur;
    }

    public Double getNakur1() {
        return nakur1;
    }

    public void setNakur1(Double nakur1) {
        this.nakur1 = nakur1;
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

    public Double getBiliru() {
        return biliru;
    }

    public void setBiliru(Double biliru) {
        this.biliru = biliru;
    }

    public Double getBiliru1() {
        return biliru1;
    }

    public void setBiliru1(Double biliru1) {
        this.biliru1 = biliru1;
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

    public Double getNak() {
        return nak;
    }

    public void setNak(Double nak) {
        this.nak = nak;
    }

    public Double getNak1() {
        return nak1;
    }

    public void setNak1(Double nak1) {
        this.nak1 = nak1;
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
