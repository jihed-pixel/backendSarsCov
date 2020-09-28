package com.yobitrust.HachCovid19Back.Models.PatientParts;

import com.yobitrust.HachCovid19Back.Models.PatientParts.ExpoRisque.ExpoRisque;
import com.yobitrust.HachCovid19Back.Models.PatientParts.evaluation.Evolution;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Diagnostic {
    private  Date dateDiag;
    private ExpoRisque expoRisque;
    private List<ConfDiag> confDiags;
    private List<Admission> admissions;
    private CaracCliniques caracCliniques;
    private ExamenCli examenCli;
    private ExamRadio_ParaCli examRadio_paraCli;
    private EvaluationFinale evaluationFinale;
    private ExamBio examBio;
    private Traitement traitement;
    private EvoluationQuo evolution;

    public Diagnostic() {

        this.confDiags= new ArrayList<>();
        this.admissions=new ArrayList<>();
        this.examRadio_paraCli=new ExamRadio_ParaCli();
        this.examBio= new ExamBio();
        this.traitement= new Traitement();
        this.evolution=new EvoluationQuo();
    }

    public Diagnostic(Date dateDiag, ExpoRisque expoRisque,List<ConfDiag> confDiags,List<Admission> admissions,CaracCliniques caracCliniques,ExamenCli examenCli,ExamRadio_ParaCli examRadio_paraCli,EvaluationFinale evaluationFinale,ExamBio examBio,Traitement traitement,EvoluationQuo evolution) {
        this.dateDiag = dateDiag;
        this.expoRisque = expoRisque;
        this.confDiags=confDiags;
        this.admissions=admissions;
        this.caracCliniques=caracCliniques;
        this.examenCli=examenCli;
        this.examRadio_paraCli=examRadio_paraCli;
        this.evaluationFinale=evaluationFinale;
        this.examBio=examBio;
        this.traitement=traitement;
        this.evolution=evolution;
    }

    public ExamBio getExamBio() {
        return examBio;
    }

    public void setExamBio(ExamBio examBio) {
        this.examBio = examBio;
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

    public ExamenCli getExamenCli() {
        return examenCli;
    }

    public void setExamenCli(ExamenCli examenCli) {
        this.examenCli = examenCli;
    }

    public ExamRadio_ParaCli getExamRadio_paraCli() {
        return examRadio_paraCli;
    }

    public EvaluationFinale getEvaluationFinale() {
        return evaluationFinale;
    }

    public void setEvaluationFinale(EvaluationFinale evaluationFinale) {
        this.evaluationFinale = evaluationFinale;
    }

    public void setExamRadio_paraCli(ExamRadio_ParaCli examRadio_paraCli) {
        this.examRadio_paraCli = examRadio_paraCli;

    }

    public Traitement getTraitement() {
        return traitement;
    }

    public void setTraitement(Traitement traitement) {
        this.traitement = traitement;
    }

    public EvoluationQuo getEvolution() {
        return evolution;
    }

    public void setEvolution(EvoluationQuo evolution) {
        this.evolution = evolution;
    }
}
