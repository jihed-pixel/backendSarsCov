package com.yobitrust.HachCovid19Back.Models;

import com.yobitrust.HachCovid19Back.Models.PatientParts.GeneralInformation;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Patient {
    @Id
    private Integer cin ;
    private Integer matricule ;
    private GeneralInformation generalInformation;

    public Patient() {
       // this.generalInformation=new GeneralInformation();
    }

    public Patient(Integer cin, Integer matricule,GeneralInformation generalInformation) {
        this.cin = cin;
        this.matricule = matricule;
        this.generalInformation=generalInformation;
    }

    public Integer getCin() {
        return cin;
    }

    public void setCin(Integer cin) {
        this.cin = cin;
    }

    public Integer getMatricule() {
        return matricule;
    }

    public void setMatricule(Integer matricule) {
        this.matricule = matricule;
    }

    public GeneralInformation getGeneralInformation() {
        return generalInformation;
    }

    public void setGeneralInformation(GeneralInformation generalInformation) {
        this.generalInformation = generalInformation;
    }
}
