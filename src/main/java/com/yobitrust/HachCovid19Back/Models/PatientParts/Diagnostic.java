package com.yobitrust.HachCovid19Back.Models.PatientParts;

import com.yobitrust.HachCovid19Back.Models.PatientParts.ExpoRisque.ExpoRisque;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Diagnostic {
    private  Date dateDiag;
    private ExpoRisque expoRisque;
    private List<ConfDiag> confDiags;
    private List<Admission> admissions;
    private CaracCliniques caracCliniques;

    public Diagnostic() {

        this.confDiags= new ArrayList<>();
        this.admissions=new ArrayList<>();
    }

    public Diagnostic(Date dateDiag, ExpoRisque expoRisque,List<ConfDiag> confDiags,List<Admission> admissions,CaracCliniques caracCliniques) {
        this.dateDiag = dateDiag;
        this.expoRisque = expoRisque;
        this.confDiags=confDiags;
        this.admissions=admissions;
        this.caracCliniques=caracCliniques;
    }

    public CaracCliniques getCaracCliniques() {
        return caracCliniques;
    }

    public void setCaracCliniques(CaracCliniques caracCliniques) {
        this.caracCliniques = caracCliniques;
    }

    public List<Admission> getAdmissions() {
        return admissions;
    }

    public void setAdmissions(List<Admission> admissions) {
        this.admissions = admissions;
    }

    public List<ConfDiag> getConfDiags() {
        return confDiags;
    }

    public void setConfDiags(List<ConfDiag> confDiags) {
        this.confDiags = confDiags;
    }

    public Date getDateDiag() {
        return dateDiag;
    }

    public void setDateDiag(Date dateDiag) {
        this.dateDiag = dateDiag;
    }

    public ExpoRisque getExpoRisque() {
        return expoRisque;
    }

    public void setExpoRisque(ExpoRisque expoRisque) {
        this.expoRisque = expoRisque;
    }
}
