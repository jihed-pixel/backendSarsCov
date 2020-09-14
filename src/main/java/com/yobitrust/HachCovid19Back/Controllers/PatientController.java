package com.yobitrust.HachCovid19Back.Controllers;
import com.yobitrust.HachCovid19Back.Models.Patient;
import com.yobitrust.HachCovid19Back.Models.PatientParts.AntecedentsMedicaux.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.CaracCliniques;
import com.yobitrust.HachCovid19Back.Models.PatientParts.CaracteristiquesCliniques.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.Diagnostic;
import com.yobitrust.HachCovid19Back.Models.PatientParts.ExpoRisque.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.GeneralInformation;
import com.yobitrust.HachCovid19Back.Models.PatientParts.HabitudesDeVie;
import com.yobitrust.HachCovid19Back.Models.PatientParts.admission.AdmHHop;
import com.yobitrust.HachCovid19Back.Models.PatientParts.admission.AdmHop;
import com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags.Pcr;
import com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags.RapideAc;
import com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags.RapideAg;
import com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags.Serologie;
import com.yobitrust.HachCovid19Back.Models.RequestModels.*;
import com.yobitrust.HachCovid19Back.Repositories.PatientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

    public Integer findDiagnosticByDate(List<Diagnostic> diagnostics, Date date) {
        for (Integer i =0;i<diagnostics.size();i++){
            Date date1=diagnostics.get(i).getDateDiag();
            if(date1.compareTo(date)==0)
                return i;
        }
        return  -1;
    }

    @PostMapping("/addPatient")
    public ResponseEntity addPatient(@RequestBody AddPatient model) {
        Patient patient = patientRepository.findByCinAndMatricule(model.getCin(), model.getMatricule());
        if (patient != null)
            return ResponseEntity.ok("Cin or/and matricule already existed");
        Patient newPatient = new Patient();
        newPatient.setCin(model.getCin());
        newPatient.setMatricule(model.getMatricule());
        ModelMapper mapper= new ModelMapper();
        GeneralInformation generalInformation = mapper.map(model,GeneralInformation.class);
        newPatient.setGeneralInformation(generalInformation);
        patientRepository.save(newPatient);
        return ResponseEntity.ok("Patient added successfuly");
    }
    @GetMapping("/getAllPatients")
    public ResponseEntity getAllPatients(){
        List<Patient> patients= patientRepository.findAll();
        return ResponseEntity.ok(patients);
    }
    @GetMapping("/search/{cin}")
    public ResponseEntity searchPatient(@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        return ResponseEntity.ok(patient);

    }
    @PostMapping("/add-habitudes-de-vie/{cin}")
    public ResponseEntity addHabitudesDeVie(@RequestBody HabitudesDeVie habitudesDeVie,@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setHabitudesDeVie(habitudesDeVie);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @PostMapping("/add-infos-generales/{cin}")
    public ResponseEntity addInfosGenerales(@RequestBody GeneralInformation generalInformation ,@PathVariable Integer cin){
        Patient patient =patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");
        else patient.setGeneralInformation(generalInformation);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @PostMapping("/add-antecedents-medicaux/{cin}")
    public ResponseEntity addAntecedentsMedicaux(@RequestBody AntecedentMedical antecedentMedical,@PathVariable Integer cin) {
        Patient patient =patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");
        ModelMapper mapper= new ModelMapper();
        HashMap<String, AntecedentMedicaux> antecedents =patient.getAntecedentMedicaux();
        if(antecedentMedical.getAntecedent().equals("grossesse")){

            Grossesse grossesse = mapper.map(antecedentMedical, Grossesse.class);
            antecedents.put("grossesse",grossesse);
            patient.setAntecedentMedicaux(antecedents);

        }
        else if (antecedentMedical.getAntecedent().equals("PathResChronique")){
            PathRespChronique pathRespChronique=mapper.map(antecedentMedical,PathRespChronique.class);
            System.out.println(pathRespChronique.toString());
            antecedents.put("PathResChronique",pathRespChronique);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("Cardiopathies")){
            Cardiopathies cardiopathies=mapper.map(antecedentMedical,Cardiopathies.class);
            antecedents.put("Cardiopathies",cardiopathies);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("TrRythCardiaque")){
            TrRythCardiaque trRythCardiaque =mapper.map(antecedentMedical,TrRythCardiaque.class);
            antecedents.put("TrRythCardiaque",trRythCardiaque);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("HTA")){
            HTA hta =mapper.map(antecedentMedical,HTA.class);
            antecedents.put("HTA",hta);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("Diabete")){
            Diabete diabete=mapper.map(antecedentMedical,Diabete.class);
            antecedents.put("Diabete",diabete);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("InsRenaleChro")){
            InsRenaleChro insRenaleChro=mapper.map(antecedentMedical,InsRenaleChro.class);
            antecedents.put("InsRenaleChro",insRenaleChro);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("AVC")){
            AVC avc = mapper.map(antecedentMedical,AVC.class);
            antecedents.put("AVC",avc);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("Retinopathie")){
            Retinopathie retinopathie=mapper.map(antecedentMedical,Retinopathie.class);
            antecedents.put("Retinopathie",retinopathie);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("ATCDchir")){
            ATCDchir atcDchir =mapper.map(antecedentMedical,ATCDchir.class);
            antecedents.put("ATCDchir",atcDchir);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("PriseAINS")){
            PriseAINS priseAINS=mapper.map(antecedentMedical,PriseAINS.class);
            antecedents.put("PriseAINS",priseAINS);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("Immunosuppreseur")){
            Immunosuppreseur immunosuppreseur=mapper.map(antecedentMedical,Immunosuppreseur.class);
            antecedents.put("Immunosuppreseur",immunosuppreseur);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("AutresATCD")){
            if(antecedents.containsKey("AutresATCD")){
                List<String> autres= (List<String>) antecedents.get("AutresATCD");
                autres.add(antecedentMedical.getAutres());
                AutresATCD autresATCD = (AutresATCD) antecedents.get("AutresATCD");
                autresATCD.setAutres(autres);
                antecedents.put("AutresATCD", autresATCD);
                patient.setAntecedentMedicaux(antecedents);

            }
            else {
                AutresATCD autresATCD=new AutresATCD();
                List<String> autres = autresATCD.getAutres();
                autres.add(antecedentMedical.getAutres());
                autresATCD.setAutres(autres);
                antecedents.put("AutresATCD", autresATCD);
                patient.setAntecedentMedicaux(antecedents);
            }

        }
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);

    }

    @GetMapping("/get-all-antecedents-medicaux/{cin}")
    public  ResponseEntity getAllAntecedentsMedicaux(@PathVariable Integer cin){

        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        List<String> antecedents = new ArrayList<String>(patient.getAntecedentMedicaux().keySet());
        return  ResponseEntity.ok(antecedents);

    }
    @PostMapping("/remove-antecedent-medical/{cin}")
    public ResponseEntity deleteAntecedentMedical(@PathVariable Integer cin , @RequestBody RemoveAntecedent antecedent){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        HashMap<String, AntecedentMedicaux> antecedents =patient.getAntecedentMedicaux();
        antecedents.remove(antecedent.getAntecedent());
        patient.setAntecedentMedicaux(antecedents);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient.getAntecedentMedicaux().keySet());

    }

    @PostMapping("/add-diagnostic/{cin}")
    public ResponseEntity ajouterDiagnostic(@PathVariable Integer cin , @RequestBody Exposition exposition)  {
        Patient patient = patientRepository.findByCin(cin);
        if (patient == null){
           return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }

        if(findDiagnosticByDate(patient.getDiagnostics(),exposition.getDate())==-1){
            Diagnostic diagnostic= new Diagnostic();
            diagnostic.setDateDiag(exposition.getDate());
             patient.getDiagnostics().add(diagnostic);
             patientRepository.save(patient);
            return ResponseEntity.ok(diagnostic);}
        return ResponseEntity.ok("You have already added a diagnostic in the same day");
    }
    @PostMapping("search-diagnostic/{cin}")
    public ResponseEntity searchDiagnostic(@PathVariable Integer cin, @RequestBody Exposition exposition){
        Patient patient = patientRepository.findByCin(cin);
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }
        Integer diagnostic = findDiagnosticByDate(patient.getDiagnostics(),exposition.getDate());
        if(diagnostic ==-1){
            return ResponseEntity.ok("No diagnostoc added on "+exposition.getDate().toString());
        }
        return ResponseEntity.ok(patient.getDiagnostics().get(diagnostic));
    }
    @PostMapping("/add-exposition/{cin}")
    public ResponseEntity addExposition(@PathVariable Integer cin , @RequestBody Exposition exposition){
        Patient patient = patientRepository.findByCin(cin);
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }
        Integer index = findDiagnosticByDate(patient.getDiagnostics(),exposition.getDiagnosticDate());
        if(index ==-1){
            return ResponseEntity.ok("No diagnostoc added on "+exposition.getDate().toString());
        }
        ModelMapper mapper= new ModelMapper();
        Arrivee arrivee = mapper.map(exposition,Arrivee.class);
        Parcours parcours =mapper.map(exposition,Parcours.class);
        ZoneRisque zoneRisque=mapper.map(exposition,ZoneRisque.class);
        ContactEtroit contactEtroit=mapper.map(exposition,ContactEtroit.class);
        AutreCritere autreCritere=mapper.map(exposition,AutreCritere.class);
        Quarantine quarantine=mapper.map(exposition,Quarantine.class);
        ExpoRisque  expoRisque=new ExpoRisque(zoneRisque,arrivee,parcours,contactEtroit,autreCritere,quarantine);
        Diagnostic diagnostic= patient.getDiagnostics().get(index);
        diagnostic.setExpoRisque(expoRisque);
        patient.getDiagnostics().set(index,diagnostic);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient.getDiagnostics().get(index));

    }

    @GetMapping("/get-all-diagnostics/{cin}")
    public ResponseEntity getAllDiagnostics(@PathVariable Integer cin) {
        Patient patient = patientRepository.findByCin(cin);
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }
        return ResponseEntity.ok(patient.getDiagnostics());
    }

    @PostMapping("add-confDiag/{cin}")
    public ResponseEntity addConfDiag(@PathVariable Integer cin, @RequestBody ConfDiagModel confDiagModel){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }
        Integer index = findDiagnosticByDate(patient.getDiagnostics(),confDiagModel.getDateDiag());
        if(index ==-1){
            return ResponseEntity.ok("No diagnostoc added on "+confDiagModel.getDateDiag());
        }
        if(confDiagModel.getTest().equals("Pcr")){
            Pcr pcr=mapper.map(confDiagModel,Pcr.class);
            patient.getDiagnostics().get(index).getConfDiags().add(pcr);
        }
        if(confDiagModel.getTest().equals("RapideAc")){
            RapideAc rapideAc=mapper.map(confDiagModel,RapideAc.class);
            patient.getDiagnostics().get(index).getConfDiags().add(rapideAc);
        }
        if(confDiagModel.getTest().equals("RapideAg")){
            RapideAg rapideAg=mapper.map(confDiagModel,RapideAg.class);
            patient.getDiagnostics().get(index).getConfDiags().add(rapideAg);
        }
        if(confDiagModel.getTest().equals("Serologie")){
            Serologie serologie =mapper.map(confDiagModel,Serologie.class);
            patient.getDiagnostics().get(index).getConfDiags().add(serologie);
        }
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient.getDiagnostics().get(index));
    }

    @PostMapping("/add-admission/{cin}")
    public ResponseEntity addAdmission(@PathVariable Integer cin , @RequestBody AdmissionModel model){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }
        Integer index = findDiagnosticByDate(patient.getDiagnostics(),model.getDateDiag());
        if(index ==-1){
            return ResponseEntity.ok("No diagnostoc added on "+model.getDateDiag());
        }
        if (model.getType().equals("hop")){
            AdmHop admHop= mapper.map(model,AdmHop.class);
            patient.getDiagnostics().get(index).getAdmissions().add(admHop);
        }
        if(model.getType().equals("hhop")){
            AdmHHop admHHop=mapper.map(model,AdmHHop.class);
            patient.getDiagnostics().get(index).getAdmissions().add(admHHop);
        }
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient.getDiagnostics().get(index));
    }
    @PostMapping("add-carac-cliniques/{cin}")
    public ResponseEntity addCaracCliniques(@PathVariable Integer cin , @RequestBody CaracCliniquesModel model){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }
        Integer index = findDiagnosticByDate(patient.getDiagnostics(),model.getDateDiag());
        if(index ==-1){
            return ResponseEntity.ok("No diagnostoc added on "+model.getDateDiag());
        }

        //System.out.println(patient.getDiagnostics().get(index).getCaracCliniques());

        if(patient.getDiagnostics().get(index).getCaracCliniques()==null){
            patient.getDiagnostics().get(index).setCaracCliniques(new CaracCliniques());
        }
        patient.getDiagnostics().get(index).getCaracCliniques().setSym(model.getSym());
        if(model.getSym()==false){
            patientRepository.save(patient);
            return  ResponseEntity.ok(patient.getDiagnostics().get(index));
        }
        if(model.getType().equals("Fievre")){
            Fievre fievre =mapper.map(model,Fievre.class);
            patient.getDiagnostics().get(index).getCaracCliniques().getSymptomes().put("Fievre",fievre);
        }
        if(model.getType().equals("Toux")){
            Toux toux=mapper.map(model,Toux.class);
            patient.getDiagnostics().get(index).getCaracCliniques().getSymptomes().put("Toux",toux);
        }
        if(model.getType().equals("Cephalees")){
            Cephalees cephalees=mapper.map(model,Cephalees.class);
            patient.getDiagnostics().get(index).getCaracCliniques().getSymptomes().put("Cephalees",cephalees);
        }
        if(model.getType().equals("AshthFat")){
            AshthFat ashthFat=mapper.map(model,AshthFat.class);
            patient.getDiagnostics().get(index).getCaracCliniques().getSymptomes().put("AshthFat",ashthFat);
        }
        if(model.getType().equals("MyalCourba")){
            MyalCourba myalCourba =mapper.map(model,MyalCourba.class);
            patient.getDiagnostics().get(index).getCaracCliniques().getSymptomes().put("MyalCourba",myalCourba);
        }
        if(model.getType().equals("Odynophagie")){
            Odynophagie odynophagie=mapper.map(model,Odynophagie.class);
            patient.getDiagnostics().get(index).getCaracCliniques().getSymptomes().put("Odynophagie",odynophagie);
        }
        if(model.getType().equals("RhinoCongNas")){
            RhinoCongNas rhinoCongNas =mapper.map(model,RhinoCongNas.class);
            patient.getDiagnostics().get(index).getCaracCliniques().getSymptomes().put("RhinoCongNas",rhinoCongNas);
        }
        if(model.getType().equals("Anosmie")){
            Anosmie anosmie=mapper.map(model,Anosmie.class);
            patient.getDiagnostics().get(index).getCaracCliniques().getSymptomes().put("Anosmie",anosmie);
        }
        if(model.getType().equals("Agueusie")){
            Agueusie agueusie=mapper.map(model,Agueusie.class);
            patient.getDiagnostics().get(index).getCaracCliniques().getSymptomes().put("Agueusie",agueusie);
        }
        if(model.getType().equals("Diarrhee")){
            Diarrhee diarrhee= mapper.map(model,Diarrhee.class);
            patient.getDiagnostics().get(index).getCaracCliniques().getSymptomes().put("Diarrhee",diarrhee);
        }
        if(model.getType().equals("NauVoumi")){
            NauVoumi nauVoumi=mapper.map(model,NauVoumi.class);
            patient.getDiagnostics().get(index).getCaracCliniques().getSymptomes().put("NauVoumi",nauVoumi);
        }
        if(model.getType().equals("ErruptionCu")){
            ErruptionCu erruptionCu=mapper.map(model,ErruptionCu.class);
            patient.getDiagnostics().get(index).getCaracCliniques().getSymptomes().put("ErruptionCu",erruptionCu);
        }
        if(model.getType().equals("Engelure")){
            Engelure engelure=mapper.map(model,Engelure.class);
            patient.getDiagnostics().get(index).getCaracCliniques().getSymptomes().put("Engelure",engelure);
        }
        if(model.getType().equals("DouleurThora")){
            DouleurThora douleurThora=mapper.map(model,DouleurThora.class);
            patient.getDiagnostics().get(index).getCaracCliniques().getSymptomes().put("DouleurThora",douleurThora);
        }
        if(model.getType().equals("GeneRespi")){
            GeneRespi geneRespi =mapper.map(model,GeneRespi.class);
            patient.getDiagnostics().get(index).getCaracCliniques().getSymptomes().put("GeneRespi",geneRespi);
        }
        if(model.getType().equals("Essouflement")){
            Essouflement essouflement =mapper.map(model,Essouflement.class);
            patient.getDiagnostics().get(index).getCaracCliniques().getSymptomes().put("Essouflement",essouflement);
        }
        if(model.getType().equals("Autre")){
            Autre autre=mapper.map(model,Autre.class);
            patient.getDiagnostics().get(index).getCaracCliniques().getSymptomes().put("Autre",autre);
        }
        patientRepository.save(patient);
        return ResponseEntity.ok(patient.getDiagnostics().get(index));

    }


}

