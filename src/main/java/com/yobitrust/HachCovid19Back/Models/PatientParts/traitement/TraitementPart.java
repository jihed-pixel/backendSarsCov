package com.yobitrust.HachCovid19Back.Models.PatientParts.traitement;

import java.util.ArrayList;
import java.util.List;

public class TraitementPart {
    private List<Dosage> dosages;

    public TraitementPart() {
        this.dosages=new ArrayList<Dosage>();
    }

    public TraitementPart(List<Dosage> dosages) {
        this.dosages = dosages;
    }

    public List<Dosage> getDosages() {
        return dosages;
    }

    public void setDosages(List<Dosage> dosages) {
        this.dosages = dosages;
    }
}
