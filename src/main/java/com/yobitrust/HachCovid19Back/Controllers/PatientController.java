package com.yobitrust.HachCovid19Back.Controllers;
import com.yobitrust.HachCovid19Back.Models.Patient;
import com.yobitrust.HachCovid19Back.Models.PatientParts.AntecedentsMedicaux.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.GeneralInformation;
import com.yobitrust.HachCovid19Back.Models.PatientParts.HabitudesDeVie;
import com.yobitrust.HachCovid19Back.Models.RequestModels.AddPatient;
import com.yobitrust.HachCovid19Back.Models.RequestModels.AntecedentMedical;
import com.yobitrust.HachCovid19Back.Models.RequestModels.RemoveAntecedent;
import com.yobitrust.HachCovid19Back.Repositories.PatientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

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

    @GetMapping("get-all-antecedents-medicaux/{cin}")
    public  ResponseEntity getAllAntecedentsMedicaux(@PathVariable Integer cin){

        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        List<String> antecedents = new ArrayList<String>(patient.getAntecedentMedicaux().keySet());
        return  ResponseEntity.ok(antecedents);

    }
    @PostMapping("remove-antecedent-medical/{cin}")
    public ResponseEntity deleteAntecedentMedical(@PathVariable Integer cin , @RequestBody RemoveAntecedent antecedent){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        HashMap<String, AntecedentMedicaux> antecedents =patient.getAntecedentMedicaux();
        antecedents.remove(antecedent.getAntecedent());
        patient.setAntecedentMedicaux(antecedents);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient.getAntecedentMedicaux().keySet());

    }
}

