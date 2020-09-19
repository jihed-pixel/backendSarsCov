package com.yobitrust.HachCovid19Back.Models.PatientParts;

import com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio.*;

import java.util.ArrayList;
import java.util.List;

public class ExamBio {
    private List<NFS> nfs;
    private List<BilanRenal> bilanRenal;
    private List<BilanHepa> bilanHepa;
    private List<GDSA> gdsas;
    private List<Ionogra> ionogras;
    private List<AutreBilan> autreBilans;


    public ExamBio(List<NFS> nfs, List<BilanRenal> bilanRenal, List<BilanHepa> bilanHepa, List<GDSA> gdsas, List<Ionogra> ionogras,List<AutreBilan> autreBilans) {
        this.nfs = nfs;
        this.bilanRenal = bilanRenal;
        this.bilanHepa = bilanHepa;
        this.gdsas = gdsas;
        this.ionogras = ionogras;
        this.autreBilans=autreBilans;
    }

    public ExamBio() {
        this.nfs=new ArrayList<>();
        this.bilanHepa=new ArrayList<>();
        this.gdsas=new ArrayList<>();
        this.ionogras=new ArrayList<>();
        this.bilanRenal=new ArrayList<>();
        this.autreBilans=new ArrayList<>();
    }

    public List<AutreBilan> getAutreBilans() {
        return autreBilans;
    }

    public void setAutreBilans(List<AutreBilan> autreBilans) {
        this.autreBilans = autreBilans;
    }

    public List<NFS> getNfs() {
        return nfs;
    }

    public void setNfs(List<NFS> nfs) {
        this.nfs = nfs;
    }

    public List<BilanRenal> getBilanRenal() {
        return bilanRenal;
    }

    public void setBilanRenal(List<BilanRenal> bilanRenal) {
        this.bilanRenal = bilanRenal;
    }

    public List<BilanHepa> getBilanHepa() {
        return bilanHepa;
    }

    public void setBilanHepa(List<BilanHepa> bilanHepa) {
        this.bilanHepa = bilanHepa;
    }

    public List<GDSA> getGdsas() {
        return gdsas;
    }

    public void setGdsas(List<GDSA> gdsas) {
        this.gdsas = gdsas;
    }

    public List<Ionogra> getIonogras() {
        return ionogras;
    }

    public void setIonogras(List<Ionogra> ionogras) {
        this.ionogras = ionogras;
    }
}
