package com.yobitrust.HachCovid19Back.Controllers;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import com.yobitrust.HachCovid19Back.Models.Patient;
import com.yobitrust.HachCovid19Back.Models.PatientParts.GeneralInformation;
import com.yobitrust.HachCovid19Back.Models.RequestModels.AddPatient;
import com.yobitrust.HachCovid19Back.Repositories.PatientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
