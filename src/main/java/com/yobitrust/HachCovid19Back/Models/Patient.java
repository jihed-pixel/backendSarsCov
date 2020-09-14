package com.yobitrust.HachCovid19Back.Models;

import com.yobitrust.HachCovid19Back.Models.PatientParts.AntecedentsMedicaux.AntecedentMedicaux;
import com.yobitrust.HachCovid19Back.Models.PatientParts.ConfDiag;
import com.yobitrust.HachCovid19Back.Models.PatientParts.Diagnostic;
import com.yobitrust.HachCovid19Back.Models.PatientParts.GeneralInformation;
import com.yobitrust.HachCovid19Back.Models.PatientParts.HabitudesDeVie;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Document
public class Patient {
    @Id
    private Integer cin ;
    private Integer matricule ;
    private GeneralInformation generalInformation;
    private HabitudesDeVie habitudesDeVie;
    private HashMap<String, AntecedentMedicaux> antecedentMedicaux;
    private List<Diagnostic> diagnostics ;
    //private List<ConfDiag> confDiags;

    public Patient() {
       // this.generalInformation=new GeneralInformation();
        this.antecedentMedicaux=new HashMap<String, AntecedentMedicaux>();
        this.diagnostics= new ArrayList<>();
        //this.confDiags= new ArrayList<>();
    }

    public Patient(Integer cin, Integer matricule,GeneralInformation generalInformation,HabitudesDeVie habitudesDeVie,HashMap<String,AntecedentMedicaux>  antecedentMedicaux,List<Diagnostic> diagnostics) {
        this.cin = cin;
        this.matricule = matricule;
        this.generalInformation=generalInformation;
        this.habitudesDeVie=habitudesDeVie;
        this.antecedentMedicaux=antecedentMedicaux;
        this.diagnostics=diagnostics;
        //this.confDiags=confDiags;
    }

  /*  public List<ConfDiag> getConfDiags() {
        return confDiags;
    }

    public void setConfDiags(List<ConfDiag> confDiags) {
        this.confDiags = confDiags;
    }
*/
    public List<Diagnostic> getDiagnostics() {
        return diagnostics;
    }

    public void setDiagnostics(List<Diagnostic> diagnostics) {
        this.diagnostics = diagnostics;
    }

    public HashMap<String, AntecedentMedicaux> getAntecedentMedicaux() {
        return antecedentMedicaux;
    }

    public void setAntecedentMedicaux(HashMap<String, AntecedentMedicaux> antecedentMedicaux) {
        this.antecedentMedicaux = antecedentMedicaux;
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

    public HabitudesDeVie getHabitudesDeVie() {
        return habitudesDeVie;
    }

    public void setHabitudesDeVie(HabitudesDeVie habitudesDeVie) {
        this.habitudesDeVie = habitudesDeVie;
    }
}
