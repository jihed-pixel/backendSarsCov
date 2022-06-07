package com.yobitrust.HachCovid19Back.Models.PatientParts;

import com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio.*;

public class ExamBio {
    private Nfs nfs;
    private BilanRenal bilanrenal;
    private BilanHepa bilanhepa;
    private GDSA gdsa;
    private Ionogra ionogra;
    private AutreBilan autrebilan;
    public ExamBio() {
        // this.generalInformation=new GeneralInformation();
        this.nfs= new Nfs();
        this.bilanrenal=new BilanRenal();
        this.bilanhepa=new BilanHepa();
        this.gdsa= new GDSA();
        this.ionogra=new Ionogra();
        this.autrebilan=new AutreBilan();
    }
    public ExamBio(Nfs nfs, BilanRenal bilanrenal, BilanHepa bilanhepa, GDSA gdsa, Ionogra ionogra, AutreBilan autrebilan) {
        this.nfs = nfs;
        this.bilanrenal = bilanrenal;
        this.bilanhepa = bilanhepa;
        this.gdsa = gdsa;
        this.ionogra = ionogra;
        this.autrebilan = autrebilan;
    }

    public Nfs getNfs() {
        return nfs;
    }

    public void setNfs(Nfs nfs) {
        this.nfs = nfs;
    }

    public BilanRenal getBilanrenal() {
        return bilanrenal;
    }

    public void setBilanrenal(BilanRenal bilanrenal) {
        this.bilanrenal = bilanrenal;
    }

    public BilanHepa getBilanhepa() {
        return bilanhepa;
    }

    public void setBilanhepa(BilanHepa bilanhepa) {
        this.bilanhepa = bilanhepa;
    }

    public GDSA getGdsa() {
        return gdsa;
    }

    public void setGdsa(GDSA gdsa) {
        this.gdsa = gdsa;
    }

    public Ionogra getIonogra() {
        return ionogra;
    }

    public void setIonogra(Ionogra ionogra) {
        this.ionogra = ionogra;
    }

    public AutreBilan getAutrebilan() {
        return autrebilan;
    }

    public void setAutrebilan(AutreBilan autrebilan) {
        this.autrebilan = autrebilan;
    }
}
