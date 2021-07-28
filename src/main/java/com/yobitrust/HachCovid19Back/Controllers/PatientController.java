package com.yobitrust.HachCovid19Back.Controllers;
import com.sun.jdi.VoidType;
import com.yobitrust.HachCovid19Back.Models.Patient;
import com.yobitrust.HachCovid19Back.Models.PatientParts.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.AntecedentsMedicaux.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.CaracteristiquesCliniques.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.CaracteristiquesCliniques.Autre;
import com.yobitrust.HachCovid19Back.Models.PatientParts.ExamRadioParaCli.ECG;
import com.yobitrust.HachCovid19Back.Models.PatientParts.ExamRadioParaCli.TdmTho;
import com.yobitrust.HachCovid19Back.Models.PatientParts.ExamRadioParaCli.Thorax;
import com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.ExpoRisque.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA.NAK1;
import com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA.NAKUR;
import com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA.NAKUR1;
import com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA.NAk;
import com.yobitrust.HachCovid19Back.Models.PatientParts.NFS.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.admission.AdmHHop;
import com.yobitrust.HachCovid19Back.Models.PatientParts.admission.AdmHop;
import com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags.Pcr;
import com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags.RapideAc;
import com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags.RapideAg;
import com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags.Serologie;
import com.yobitrust.HachCovid19Back.Models.PatientParts.evaluation.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.gdsa.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.traitement.*;
import com.yobitrust.HachCovid19Back.Models.RequestModels.*;
import com.yobitrust.HachCovid19Back.Repositories.PatientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

@RestController
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    public Integer findThoraxByDate(List<Thorax> thorax, Date date) {
        for (Integer i =0;i<thorax.size();i++){
            Date date1=thorax.get(i).getDatepr();
            if(date1.compareTo(date)==0)
                return i;
        }
        return  -1;
    }
    public Integer findTdmThoByDate(List<TdmTho> tdmTho, Date date) {
        for (Integer i =0;i<tdmTho.size();i++){
            Date date1=tdmTho.get(i).getDatepr();
            if(date1.compareTo(date)==0)
                return i;
        }
        return  -1;
    }
    public Integer findECGByDate(List<ECG> ecg , Date date) {
        for (Integer i =0;i<ecg.size();i++){
            Date date1=ecg.get(i).getDatepr();
            if(date1.compareTo(date)==0)
                return i;
        }
        return  -1;
    }
    public Integer findPCRByDate(List<Pcr> pcr , Date date) {
        for (Integer i =0;i<pcr.size();i++){
            Date date1=pcr.get(i).getDatePr();
            if(date1.compareTo(date)==0)
                return i;
        }
        return  -1;
    }
    public Integer findRapideAcByDate(List<RapideAc> rapideAc , Date date) {
        for (Integer i =0;i<rapideAc.size();i++){
            Date date1=rapideAc.get(i).getDatePr();
            if(date1.compareTo(date)==0)
                return i;
        }
        return  -1;
    }
    public Integer findRapideAgByDate(List<RapideAg> rapideAg , Date date) {
        for (Integer i =0;i<rapideAg.size();i++){
            Date date1=rapideAg.get(i).getDatePr();
            if(date1.compareTo(date)==0)
                return i;
        }
        return  -1;
    }
    public Integer findIonograByDate(List<NAk> nAks , Date date) {
        for (Integer i =0;i<nAks.size();i++){
            Date date1=nAks.get(i).getDatePr();
            if(date1.compareTo(date)==0)
                return i;
        }
        return  -1;
    }
    public Integer findGDSAByDate(List<PH> phs , Date date) {
        for (Integer i =0;i<phs.size();i++){
            Date date1=phs.get(i).getDatePr();
            if(date1.compareTo(date)==0)
                return i;
        }
        return  -1;
    }
    public Integer findBilanRenalByDate(List<CREAT> creats , Date date) {
        for (Integer i =0;i<creats.size();i++){
            Date date1=creats.get(i).getDatePr();
            if(date1.compareTo(date)==0)
                return i;
        }
        return  -1;
    }
    public Integer findBilanHepaByDate(List<BILIRU> bilirus , Date date) {
        for (Integer i =0;i<bilirus.size();i++){
            Date date1=bilirus.get(i).getDatePr();
            if(date1.compareTo(date)==0)
                return i;
        }
        return  -1;
    }
    public Integer findAutreBilanByDate(List<PATHS> paths , Date date) {
        for (Integer i =0;i<paths.size();i++){
            Date date1=paths.get(i).getDatePr();
            if(date1.compareTo(date)==0)
                return i;
        }
        return  -1;
    }
    public Integer findSerologieByDate(List<Serologie> serologie , Date date) {
        for (Integer i =0;i<serologie.size();i++){
            Date date1=serologie.get(i).getDatePr();
            if(date1.compareTo(date)==0)
                return i;
        }
        return  -1;
    }

    public Integer findNFSByDate(List<LYM> lyms , Date date) {
        for (Integer i =0;i<lyms.size();i++){
            Date date1=lyms.get(i).getDatePr();
            if(date1.compareTo(date)==0)
                return i;
        }
        return  -1;
    }

    @CrossOrigin(origins ="*" )
    @PostMapping("/addPatient")
    public ResponseEntity addPatient(@RequestBody AddPatient model) {
        Patient patient = patientRepository.findByCinAndMatricule(model.getCin(), model.getMatricule());
        if (patient != null)
            return ResponseEntity.ok("Cin or/and matricule already existed");
        Patient newPatient = new Patient();
        newPatient.setCin(model.getCin());
        newPatient.setCinD(model.getCinD());
        newPatient.setMatricule(model.getMatricule());
        ModelMapper mapper= new ModelMapper();
        GeneralInformation generalInformation = mapper.map(model,GeneralInformation.class);
        newPatient.setGeneralInformation(generalInformation);
        patientRepository.save(newPatient);
        return ResponseEntity.ok("Patient added successfuly");
    }
    @CrossOrigin(origins ="*" )
    @GetMapping("/getAllPatients")
    public ResponseEntity getAllPatients(){
        List<Patient> patients= patientRepository.findAll();
        return ResponseEntity.ok(patients);
    }
    @CrossOrigin(origins ="*" )
    @GetMapping("/search/{cin}/{cinD}")
    public ResponseEntity searchPatient(@PathVariable Integer cin,@PathVariable String cinD){
        Patient patient=patientRepository.findByCinAndCinD(cin,cinD);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/add-habitudes-de-vie/{cin}")
    public ResponseEntity addHabitudesDeVie(@RequestBody HabitudesDeVie habitudesDeVie,@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");
        else patient.setHabitudesDeVie(habitudesDeVie);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/add-infos-generales/{cin}")
    public ResponseEntity addInfosGenerales(@RequestBody GeneralInformation generalInformation ,@PathVariable Integer cin){
        Patient patient =patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");
        else patient.setGeneralInformation(generalInformation);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
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
    @CrossOrigin(origins ="*" )
    @GetMapping("/get-all-antecedents-medicaux/{cin}")
    public  ResponseEntity getAllAntecedentsMedicaux(@PathVariable Integer cin){

        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        List<String> antecedents = new ArrayList<String>(patient.getAntecedentMedicaux().keySet());
        return  ResponseEntity.ok(antecedents);

    }
    @CrossOrigin(origins ="*" )
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
    @CrossOrigin(origins ="*" )
    @PostMapping("/remove-p-info-generales/{cin}")
    public ResponseEntity deletePatientS(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        GeneralInformation generalInformations =null;
        patient.setGeneralInformation(generalInformations);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/remove-p-antecedent-medical/{cin}")
    public ResponseEntity deletePatient(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        HashMap<String, AntecedentMedicaux> antecedents =null;
        patient.setAntecedentMedicaux(antecedents);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/remove-p-habitudes-de-vie/{cin}")
    public ResponseEntity deletePatientsss(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        HabitudesDeVie habitudesDeVie =null;
        patient.setHabitudesDeVie(habitudesDeVie);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/remove-p-Conf-Diags/{cin}")
    public ResponseEntity deletePatientConfDiags(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        ConfDiag confDiags =null;
        patient.setConfDiags(confDiags);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/remove-p-Admissions/{cin}")
    public ResponseEntity deletePatientAdmissions(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        List<Admission> admissions =null;
        patient.setAdmissions(admissions);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/remove-p-ExpoRisque/{cin}")
    public ResponseEntity deletePatientExpoRisque(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        ExpoRisque expoRisque =null;
        patient.setExpoRisque(expoRisque);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/remove-p-ExamBio/{cin}")
    public ResponseEntity deletePatientExamBios(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        ExamBio examBio =null;
        patient.setExamBio(examBio);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/remove-p-CaracCliniques/{cin}")
    public ResponseEntity deletePatientCaracCliniques(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        CaracCliniques caracCliniques =null;
        patient.setCaracCliniques(caracCliniques);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }

    @CrossOrigin(origins ="*" )
    @PostMapping("/remove-p-ExamenCli/{cin}")
    public ResponseEntity deletePatientExamenCli(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        ExamenCli examenCli =null;
        patient.setExamenCli(examenCli);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/remove-p-ExamRadio_ParaCli/{cin}")
    public ResponseEntity deletePatientExamRadio_ParaCli(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        ExamRadio_ParaCli examRadio_ParaCli =null;
        patient.setExamRadio_paraCli(examRadio_ParaCli);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/remove-p-EvaluationFinale/{cin}")
    public ResponseEntity deletePatientEvaluationFinale(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        EvaluationFinale evaluationFinale =null;
        patient.setEvaluationFinale(evaluationFinale);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/remove-p-Traitement/{cin}")
    public ResponseEntity deletePatientTraitement(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        Traitement traitement =null;
        patient.setTraitement(traitement);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/remove-p-EvoluationQuo/{cin}")
    public ResponseEntity deletePatientEvoluationQuo(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        EvoluationQuo evoluationQuo =null;
        patient.setEvolution(evoluationQuo);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/add-exposition/{cin}")
    public ResponseEntity addExposition(@PathVariable Integer cin , @RequestBody Exposition exposition){
        Patient patient = patientRepository.findByCin(cin);
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }

        ModelMapper mapper= new ModelMapper();
        Arrivee arrivee = mapper.map(exposition,Arrivee.class);
        Parcours parcours =mapper.map(exposition,Parcours.class);
        ZoneRisque zoneRisque=mapper.map(exposition,ZoneRisque.class);
        ContactEtroit contactEtroit=mapper.map(exposition,ContactEtroit.class);
        AutreCritere autreCritere=mapper.map(exposition,AutreCritere.class);
        Quarantine quarantine=mapper.map(exposition,Quarantine.class);
        ExpoRisque  expoRisque=new ExpoRisque(zoneRisque,arrivee,parcours,contactEtroit,autreCritere,quarantine);
        patient.setExpoRisque(expoRisque);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);

    }

    @CrossOrigin(origins ="*" )
    @PostMapping("add-confDiag/{cin}")
    public ResponseEntity addConfDiag(@PathVariable Integer cin, @RequestBody ConfDiagModel confDiagModel){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }
        if(confDiagModel.getTest().equals("Pcr")) {
            Pcr pcr = mapper.map(confDiagModel, Pcr.class);
            Integer index = findPCRByDate(patient.getConfDiags().getPcrs(), pcr.getDatePr());
            System.out.println("index : " + index);
            if (index == -1) {
                patient.getConfDiags().getPcrs().add(pcr);
            }
            else{
                patient.getConfDiags().getPcrs().remove(patient.getConfDiags().getPcrs().get(index));
                patient.getConfDiags().getPcrs().add(pcr);
            }
        }
        if(confDiagModel.getTest().equals("RapideAc")){
            RapideAc rapideAc=mapper.map(confDiagModel,RapideAc.class);
            Integer index = findRapideAcByDate(patient.getConfDiags().getRapideAcs(), rapideAc.getDatePr());
            System.out.println("index : " + index);
            if (index == -1) {
                patient.getConfDiags().getRapideAcs().add(rapideAc);
            }
            else{
                patient.getConfDiags().getRapideAcs().remove(patient.getConfDiags().getRapideAcs().get(index));
                patient.getConfDiags().getRapideAcs().add(rapideAc);
            }
        }
        if(confDiagModel.getTest().equals("RapideAg")){
            RapideAg rapideAg=mapper.map(confDiagModel,RapideAg.class);
            Integer index = findRapideAgByDate(patient.getConfDiags().getRapideAgs(), rapideAg.getDatePr());
            System.out.println("index : " + index);
            if (index == -1) {
                patient.getConfDiags().getRapideAgs().add(rapideAg);
            }
            else{
                patient.getConfDiags().getRapideAgs().remove(patient.getConfDiags().getRapideAgs().get(index));
                patient.getConfDiags().getRapideAgs().add(rapideAg);
            }
        }
        if(confDiagModel.getTest().equals("Serologie")){
            Serologie serologie =mapper.map(confDiagModel,Serologie.class);
            Integer index = findSerologieByDate(patient.getConfDiags().getSerologies(), serologie.getDatePr());
            System.out.println("index : " + index);
            if (index == -1) {
                patient.getConfDiags().getSerologies().add(serologie);
            }
            else{
                patient.getConfDiags().getSerologies().remove(patient.getConfDiags().getSerologies().get(index));
                patient.getConfDiags().getSerologies().add(serologie);
            }
        }
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/add-admission/{cin}")
    public ResponseEntity addAdmission(@PathVariable Integer cin , @RequestBody AdmissionModel model){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }

        if (model.getType().equals("hop")){
            AdmHop admHop= mapper.map(model,AdmHop.class);
            patient.getAdmissions().add(admHop);
        }
        if(model.getType().equals("hhop")){
            AdmHHop admHHop=mapper.map(model,AdmHHop.class);
            patient.getAdmissions().add(admHHop);
        }
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/add-carac-cliniques/{cin}")
    public ResponseEntity addCaracCliniques(@PathVariable Integer cin , @RequestBody CaracCliniquesModel model){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }

        //System.out.println(patient.getDiagnostics().get(index).getCaracCliniques());

        if(patient.getCaracCliniques()==null){
            patient.setCaracCliniques(new CaracCliniques());
        }
        patient.getCaracCliniques().setSym(model.getSym());
        if(model.getSym()==false){
            patientRepository.save(patient);
            return  ResponseEntity.ok(patient);
        }
        if(model.getType().equals("Fievre")){
            Fievre fievre =mapper.map(model,Fievre.class);
            patient.getCaracCliniques().getSymptomes().put("Fievre",fievre);
        }
        if(model.getType().equals("Toux")){
            Toux toux=mapper.map(model,Toux.class);
            patient.getCaracCliniques().getSymptomes().put("Toux",toux);
        }
        if(model.getType().equals("Cephalees")){
            Cephalees cephalees=mapper.map(model,Cephalees.class);
            patient.getCaracCliniques().getSymptomes().put("Cephalees",cephalees);
        }
        if(model.getType().equals("AshthFat")){
            AshthFat ashthFat=mapper.map(model,AshthFat.class);
            patient.getCaracCliniques().getSymptomes().put("AshthFat",ashthFat);
        }
        if(model.getType().equals("MyalCourba")){
            MyalCourba myalCourba =mapper.map(model,MyalCourba.class);
            patient.getCaracCliniques().getSymptomes().put("MyalCourba",myalCourba);
        }
        if(model.getType().equals("Odynophagie")){
            Odynophagie odynophagie=mapper.map(model,Odynophagie.class);
            patient.getCaracCliniques().getSymptomes().put("Odynophagie",odynophagie);
        }
        if(model.getType().equals("RhinoCongNas")){
            RhinoCongNas rhinoCongNas =mapper.map(model,RhinoCongNas.class);
            patient.getCaracCliniques().getSymptomes().put("RhinoCongNas",rhinoCongNas);
        }
        if(model.getType().equals("Anosmie")){
            Anosmie anosmie=mapper.map(model,Anosmie.class);
            patient.getCaracCliniques().getSymptomes().put("Anosmie",anosmie);
        }
        if(model.getType().equals("Agueusie")){
            Agueusie agueusie=mapper.map(model,Agueusie.class);
            patient.getCaracCliniques().getSymptomes().put("Agueusie",agueusie);
        }
        if(model.getType().equals("Diarrhee")){
            Diarrhee diarrhee= mapper.map(model,Diarrhee.class);
            patient.getCaracCliniques().getSymptomes().put("Diarrhee",diarrhee);
        }
        if(model.getType().equals("NauVoumi")){
            NauVoumi nauVoumi=mapper.map(model,NauVoumi.class);
            patient.getCaracCliniques().getSymptomes().put("NauVoumi",nauVoumi);
        }
        if(model.getType().equals("ErruptionCu")){
            ErruptionCu erruptionCu=mapper.map(model,ErruptionCu.class);
            patient.getCaracCliniques().getSymptomes().put("ErruptionCu",erruptionCu);
        }
        if(model.getType().equals("Engelure")){
            Engelure engelure=mapper.map(model,Engelure.class);
            patient.getCaracCliniques().getSymptomes().put("Engelure",engelure);
        }
        if(model.getType().equals("DouleurThora")){
            DouleurThora douleurThora=mapper.map(model,DouleurThora.class);
            patient.getCaracCliniques().getSymptomes().put("DouleurThora",douleurThora);
        }
        if(model.getType().equals("GeneRespi")){
            GeneRespi geneRespi =mapper.map(model,GeneRespi.class);
            patient.getCaracCliniques().getSymptomes().put("GeneRespi",geneRespi);
        }
        if(model.getType().equals("Essouflement")){
            Essouflement essouflement =mapper.map(model,Essouflement.class);
            patient.getCaracCliniques().getSymptomes().put("Essouflement",essouflement);
        }
        if(model.getType().equals("Autre")){
            Autre autre=mapper.map(model,Autre.class);
            patient.getCaracCliniques().getSymptomes().put("Autre",autre);
        }
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);

    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/add-traitement/{cin}")
    public ResponseEntity addTraitement(@RequestBody TraitementModel model, @PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }


        if(patient.getCaracCliniques()==null){
            patient.setCaracCliniques(new CaracCliniques());
        }
        patient.getTraitement().setTrait(model.getTrait());
        if(model.getTrait()==false){
            patientRepository.save(patient);
            return  ResponseEntity.ok(patient);
        }
        if(model.getType().equals("ADO")){
            ADO ado =mapper.map(model, ADO.class);
            patient.getTraitement().getTraitementPart().put("ADO",ado);
        }
        if(model.getType().equals("Amoxicilline")){
            Amoxicilline amoxicilline =mapper.map(model, Amoxicilline.class);
            patient.getTraitement().getTraitementPart().put("Amoxicilline",amoxicilline);
        }
        if(model.getType().equals("ADO")){
            Amoxicilline amoxicilline =mapper.map(model, Amoxicilline.class);
            patient.getTraitement().getTraitementPart().put("Amoxicilline",amoxicilline);
        }
        if(model.getType().equals("Anti_coagulant")){
            Anti_coagulant anti_coagulant =mapper.map(model, Anti_coagulant.class);
            patient.getTraitement().getTraitementPart().put("Anti_coagulant",anti_coagulant);
        }

        if(model.getType().equals("AutreTrait")){
            AutreTrait autre =mapper.map(model, AutreTrait.class);
            patient.getTraitement().getTraitementPart().put("AutreTrait",autre);
        }
        if(model.getType().equals("Azithromycine")){
            Azithromycine azithromycine =mapper.map(model, Azithromycine.class);
            patient.getTraitement().getTraitementPart().put("Azithromycine",azithromycine);
        }
        if(model.getType().equals("Cefotaxime")){
            Cefotaxime cefotaxime =mapper.map(model, Cefotaxime.class);
            patient.getTraitement().getTraitementPart().put("Cefotaxime",cefotaxime);
        }
        if(model.getType().equals("Ceftriaxone")){
            Ceftriaxone ceftriaxone =mapper.map(model, Ceftriaxone.class);
            patient.getTraitement().getTraitementPart().put("Ceftriaxone",ceftriaxone);
        }
        if(model.getType().equals("Chloroquine_phosphate")){
            Chloroquine_phosphate chloroquine_phosphate =mapper.map(model, Chloroquine_phosphate.class);
            patient.getTraitement().getTraitementPart().put("Chloroquine_phosphate",chloroquine_phosphate);
        }
        if(model.getType().equals("CPAP")){
            CPAP cpap =mapper.map(model, CPAP.class);
            patient.getTraitement().getTraitementPart().put("CPAP",cpap);
        }
        if(model.getType().equals("H2O")){
            H2O h2o =mapper.map(model, H2O.class);
            patient.getTraitement().getTraitementPart().put("H2O",h2o);
        }
        if(model.getType().equals("HFNC")){
            HFNC hfnc =mapper.map(model, HFNC.class);
            patient.getTraitement().getTraitementPart().put("HFNC",hfnc);
        }
        if(model.getType().equals("Hydroxy_Chloroquine")){
            Hydroxy_Chloroquine hydroxy_Chloroquine =mapper.map(model, Hydroxy_Chloroquine.class);
            patient.getTraitement().getTraitementPart().put("Hydroxy_Chloroquine",hydroxy_Chloroquine);
        }
        if(model.getType().equals("Insulinotherapie")){
            Insulinotherapie insulinotherapie =mapper.map(model, Insulinotherapie.class);
            patient.getTraitement().getTraitementPart().put("Insulinotherapie",insulinotherapie);
        }
        if(model.getType().equals("Lopinavir_ritonavir")){
            Lopinavir_ritonavir lopinavir_ritonavir =mapper.map(model, Lopinavir_ritonavir.class);
            patient.getTraitement().getTraitementPart().put("Lopinavir_ritonavir",lopinavir_ritonavir);
        }
        if(model.getType().equals("Nebulisation_bronchodilatateurs")){
            Nebulisation_bronchodilatateurs nebulisation_bronchodilatateurs =mapper.map(model, Nebulisation_bronchodilatateurs.class);
            patient.getTraitement().getTraitementPart().put("Nebulisation_bronchodilatateurs",nebulisation_bronchodilatateurs);
        }
        if(model.getType().equals("Nebulisation_corticoides")){
            Nebulisation_corticoides nebulisation_corticoides =mapper.map(model, Nebulisation_corticoides.class);
            patient.getTraitement().getTraitementPart().put("Nebulisation_corticoides",nebulisation_corticoides);
        }
        if(model.getType().equals("O2")){
            O2 o =mapper.map(model, O2.class);
            patient.getTraitement().getTraitementPart().put("O2",o);
        }
        if(model.getType().equals("Paracetamol")){
            Paracetamol paracetamol =mapper.map(model, Paracetamol.class);
            patient.getTraitement().getTraitementPart().put("Paracetamol",paracetamol);
        }
        if(model.getType().equals("Remdesivir")){
            Remdesivir remdesivir =mapper.map(model, Remdesivir.class);
            patient.getTraitement().getTraitementPart().put("Remdesivir",remdesivir);
        }
        if(model.getType().equals("VMI")){
            VMI vmi =mapper.map(model, VMI.class);
            patient.getTraitement().getTraitementPart().put("VMI",vmi);
        }
        if(model.getType().equals("VNI")){
            VNI vni =mapper.map(model, VNI.class);
            patient.getTraitement().getTraitementPart().put("VNI",vni);
        }

        patientRepository.save(patient);
        return ResponseEntity.ok(patient);

    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/add-examen-cli/{cin}")
    public ResponseEntity addExamenCli(@PathVariable Integer cin , @RequestBody ExamenCliModel model){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }
        ExamenCli examenCli=mapper.map(model,ExamenCli.class);
        patient.setExamenCli(examenCli);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);

    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/add-examen-radio-paracli/{cin}")
    public ResponseEntity addExamenRadioParaCli(@PathVariable Integer cin ,@RequestBody ExamRadioParaCliModel model){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }
        if(model.getType().equals("Thorax")){
            Thorax thorax=mapper.map(model,Thorax.class);
            Integer index = findThoraxByDate(patient.getExamRadio_paraCli().getThoraxes(), thorax.getDatepr());
            if (index == -1) {
                patient.getExamRadio_paraCli().getThoraxes().add(thorax);
            }
            else {
                patient.getExamRadio_paraCli().getThoraxes().remove(patient.getExamRadio_paraCli().getThoraxes().get(index));
                patient.getExamRadio_paraCli().getThoraxes().add(thorax);
            }

        }
        if(model.getType().equals("TdmTho")){
            TdmTho tdmTho=mapper.map(model,TdmTho.class);
            Integer index = findTdmThoByDate(patient.getExamRadio_paraCli().getTdmThos(), tdmTho.getDatepr());
            if (index == -1) {
                patient.getExamRadio_paraCli().getTdmThos().add(tdmTho);
            }
            else {
                patient.getExamRadio_paraCli().getTdmThos().remove(patient.getExamRadio_paraCli().getTdmThos().get(index));
                patient.getExamRadio_paraCli().getTdmThos().add(tdmTho);
            }

        }
        if(model.getType().equals("ECG")){
            ECG ecg=mapper.map(model,ECG.class);
            Integer index = findECGByDate(patient.getExamRadio_paraCli().getEcgs(), ecg.getDatepr());
            if (index == -1) {
                patient.getExamRadio_paraCli().getEcgs().add(ecg);
            }
            else {
                patient.getExamRadio_paraCli().getEcgs().remove(patient.getExamRadio_paraCli().getEcgs().get(index));
                patient.getExamRadio_paraCli().getEcgs().add(ecg);
            }

        }
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }

    @CrossOrigin(origins ="*" )
    @PostMapping("add-evaluation-finale/{cin}")
    public ResponseEntity addEvaluationFinale(@PathVariable Integer cin, @RequestBody EvaluationModel model){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }
        EvaluationFinale evaluation =mapper.map(model,EvaluationFinale.class);
        patient.setEvaluationFinale(evaluation);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }

    @CrossOrigin(origins ="*" )
    @PostMapping("/add-examen-bio/{cin}")
    public ResponseEntity addExamBio(@PathVariable Integer cin , @RequestBody ExamBioModel model  ){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }
        if(model.getType().equals("NFS")){


            LYM lym =mapper.map(model, LYM.class);
            GB gb =mapper.map(model, GB.class);
            HB hb =mapper.map(model, HB.class);
            HT ht =mapper.map(model, HT.class);
            PLA pla =mapper.map(model, PLA.class);
            Integer index = findNFSByDate(patient.getExamBio().getNfs().getLyms(), lym.getDatePr());
            if (index == -1) {
                patient.getExamBio().getNfs().getLyms().add(lym);
                patient.getExamBio().getNfs().getGbs().add(gb);
                patient.getExamBio().getNfs().getHbs().add(hb);
                patient.getExamBio().getNfs().getHts().add(ht);
                patient.getExamBio().getNfs().getPlas().add(pla);
            }
            else{
                patient.getExamBio().getNfs().getLyms().remove(patient.getExamBio().getNfs().getLyms().get(index));
                patient.getExamBio().getNfs().getLyms().add(lym);
                patient.getExamBio().getNfs().getGbs().remove(patient.getExamBio().getNfs().getGbs().get(index));
                patient.getExamBio().getNfs().getGbs().add(gb);
                patient.getExamBio().getNfs().getHbs().remove(patient.getExamBio().getNfs().getHbs().get(index));
                patient.getExamBio().getNfs().getHbs().add(hb);
                patient.getExamBio().getNfs().getHts().remove(patient.getExamBio().getNfs().getHts().get(index));
                patient.getExamBio().getNfs().getHts().add(ht);
                patient.getExamBio().getNfs().getPlas().remove(patient.getExamBio().getNfs().getPlas().get(index));
                patient.getExamBio().getNfs().getPlas().add(pla);
            }
        }
        if(model.getType().equals("Ionogra")){
            NAk nak =mapper.map(model, NAk.class);
            NAK1 nak1 =mapper.map(model, NAK1.class);
            NAKUR nakur =mapper.map(model, NAKUR.class);
            NAKUR1 nakur1 =mapper.map(model, NAKUR1.class);
            Integer index = findIonograByDate(patient.getExamBio().getIonogras().getNaks(), nak.getDatePr());
            if (index == -1) {
                patient.getExamBio().getIonogras().getNaks().add(nak);
                patient.getExamBio().getIonogras().getNak1s().add(nak1);
                patient.getExamBio().getIonogras().getNakUrs().add(nakur);
                patient.getExamBio().getIonogras().getNakUr1s().add(nakur1);
            }
            else{
                patient.getExamBio().getIonogras().getNaks().remove(patient.getExamBio().getIonogras().getNaks().get(index));
                patient.getExamBio().getIonogras().getNaks().add(nak);
                patient.getExamBio().getIonogras().getNak1s().remove(patient.getExamBio().getIonogras().getNak1s().get(index));
                patient.getExamBio().getIonogras().getNak1s().add(nak1);
                patient.getExamBio().getIonogras().getNakUrs().remove(patient.getExamBio().getIonogras().getNakUrs().get(index));
                patient.getExamBio().getIonogras().getNakUrs().add(nakur);
                patient.getExamBio().getIonogras().getNakUr1s().remove(patient.getExamBio().getIonogras().getNakUr1s().get(index));
                patient.getExamBio().getIonogras().getNakUr1s().add(nakur1);
            }

        }
        if(model.getType().equals("GDSA")){
            PH ph =mapper.map(model, PH.class);
            PAO2 pao2 =mapper.map(model, PAO2.class);
            PACO2 paco2 =mapper.map(model, PACO2.class);
            HCO3 hco3 =mapper.map(model, HCO3.class);
            SAO2 sao2 =mapper.map(model, SAO2.class);
            Integer index = findGDSAByDate(patient.getExamBio().getGdsas().getPhs(), ph.getDatePr());
            if (index == -1) {
                patient.getExamBio().getGdsas().getPhs().add(ph);
                patient.getExamBio().getGdsas().getPao2s().add(pao2);
                patient.getExamBio().getGdsas().getPaco2s().add(paco2);
                patient.getExamBio().getGdsas().getHco3s().add(hco3);
                patient.getExamBio().getGdsas().getSao2s().add(sao2);
            }
            else{
                patient.getExamBio().getGdsas().getPhs().remove(patient.getExamBio().getGdsas().getPhs().get(index));
                patient.getExamBio().getGdsas().getPhs().add(ph);
                patient.getExamBio().getGdsas().getPao2s().remove(patient.getExamBio().getGdsas().getPao2s().get(index));
                patient.getExamBio().getGdsas().getPao2s().add(pao2);
                patient.getExamBio().getGdsas().getPaco2s().remove(patient.getExamBio().getGdsas().getPaco2s().get(index));
                patient.getExamBio().getGdsas().getPaco2s().add(paco2);
                patient.getExamBio().getGdsas().getHco3s().remove(patient.getExamBio().getGdsas().getHco3s().get(index));
                patient.getExamBio().getGdsas().getHco3s().add(hco3);
                patient.getExamBio().getGdsas().getSao2s().remove(patient.getExamBio().getGdsas().getSao2s().get(index));
                patient.getExamBio().getGdsas().getSao2s().add(sao2);
            }

        }
        if(model.getType().equals("BilanRenal")){
            CREAT creat =mapper.map(model, CREAT.class);
            CLAIRCREAT claircreat =mapper.map(model, CLAIRCREAT.class);
            UREE uree =mapper.map(model, UREE.class);
            Integer index = findBilanRenalByDate(patient.getExamBio().getBilanRenal().getCreats(), creat.getDatePr());
            if (index == -1) {
                patient.getExamBio().getBilanRenal().getCreats().add(creat);
                patient.getExamBio().getBilanRenal().getClairCreats().add(claircreat);
                patient.getExamBio().getBilanRenal().getUrees().add(uree);
            }
            else{
                patient.getExamBio().getBilanRenal().getCreats().remove(patient.getExamBio().getBilanRenal().getCreats().get(index));
                patient.getExamBio().getBilanRenal().getCreats().add(creat);
                patient.getExamBio().getBilanRenal().getClairCreats().remove(patient.getExamBio().getBilanRenal().getClairCreats().get(index));
                patient.getExamBio().getBilanRenal().getClairCreats().add(claircreat);
                patient.getExamBio().getBilanRenal().getUrees().remove(patient.getExamBio().getBilanRenal().getUrees().get(index));
                patient.getExamBio().getBilanRenal().getUrees().add(uree);
            }

        }
        if(model.getType().equals("BilanHepa")){
            BILIRU biliru =mapper.map(model, BILIRU.class);
            BILIRU1 biliru1 =mapper.map(model, BILIRU1.class);
            ALAT alat =mapper.map(model, ALAT.class);
            ASAT asat =mapper.map(model, ASAT.class);
            TP tp =mapper.map(model, TP.class);
            FACTEURV facteurv =mapper.map(model, FACTEURV.class);
            FIBRINOGENE fibrinogene =mapper.map(model, FIBRINOGENE.class);
            CPK_MB cpk_mb =mapper.map(model, CPK_MB.class);
            TROPONINE troponine =mapper.map(model, TROPONINE.class);
            PRO_BNP pro_bnp =mapper.map(model, PRO_BNP.class);
            ALBUMI albumi =mapper.map(model, ALBUMI.class);
            D_DIMERE d_dimere =mapper.map(model, D_DIMERE.class);
            LDH ldh =mapper.map(model, LDH.class);
            CRP crp =mapper.map(model, CRP.class);
            PROCAL procal =mapper.map(model, PROCAL.class);
            FERRI ferri =mapper.map(model, FERRI.class);
            Integer index = findBilanHepaByDate(patient.getExamBio().getBilanHepa().getBilirus(), biliru.getDatePr());
            if (index == -1) {
                patient.getExamBio().getBilanHepa().getBilirus().add(biliru);
                patient.getExamBio().getBilanHepa().getBiliru1s().add(biliru1);
                patient.getExamBio().getBilanHepa().getAlats().add(alat);
                patient.getExamBio().getBilanHepa().getAsats().add(asat);
                patient.getExamBio().getBilanHepa().getTps().add(tp);
                patient.getExamBio().getBilanHepa().getFacteurVs().add(facteurv);
                patient.getExamBio().getBilanHepa().getFibrinogenes().add(fibrinogene);
                patient.getExamBio().getBilanHepa().getCpk_mbs().add(cpk_mb);
                patient.getExamBio().getBilanHepa().getTroponines().add(troponine);
                patient.getExamBio().getBilanHepa().getPro_bnps().add(pro_bnp);
                patient.getExamBio().getBilanHepa().getAlbumis().add(albumi);
                patient.getExamBio().getBilanHepa().getD_dimères().add(d_dimere);
                patient.getExamBio().getBilanHepa().getLdhs().add(ldh);
                patient.getExamBio().getBilanHepa().getCrps().add(crp);
                patient.getExamBio().getBilanHepa().getProcals().add(procal);
                patient.getExamBio().getBilanHepa().getFerris().add(ferri);
            }
            else{
                patient.getExamBio().getBilanHepa().getBilirus().remove(patient.getExamBio().getBilanHepa().getBilirus().get(index));
                patient.getExamBio().getBilanHepa().getBilirus().add(biliru);
                patient.getExamBio().getBilanHepa().getBiliru1s().remove(patient.getExamBio().getBilanHepa().getBiliru1s().get(index));
                patient.getExamBio().getBilanHepa().getBiliru1s().add(biliru1);
                patient.getExamBio().getBilanHepa().getAlats().remove(patient.getExamBio().getBilanHepa().getAlats().get(index));
                patient.getExamBio().getBilanHepa().getAlats().add(alat);
                patient.getExamBio().getBilanHepa().getAsats().remove(patient.getExamBio().getBilanHepa().getAsats().get(index));
                patient.getExamBio().getBilanHepa().getAsats().add(asat);
                patient.getExamBio().getBilanHepa().getTps().remove(patient.getExamBio().getBilanHepa().getTps().get(index));
                patient.getExamBio().getBilanHepa().getTps().add(tp);
                patient.getExamBio().getBilanHepa().getFacteurVs().remove(patient.getExamBio().getBilanHepa().getFacteurVs().get(index));
                patient.getExamBio().getBilanHepa().getFacteurVs().add(facteurv);
                patient.getExamBio().getBilanHepa().getFibrinogenes().remove(patient.getExamBio().getBilanHepa().getFibrinogenes().get(index));
                patient.getExamBio().getBilanHepa().getFibrinogenes().add(fibrinogene);
                patient.getExamBio().getBilanHepa().getCpk_mbs().remove(patient.getExamBio().getBilanHepa().getCpk_mbs().get(index));
                patient.getExamBio().getBilanHepa().getCpk_mbs().add(cpk_mb);
                patient.getExamBio().getBilanHepa().getTroponines().remove(patient.getExamBio().getBilanHepa().getTroponines().get(index));
                patient.getExamBio().getBilanHepa().getTroponines().add(troponine);
                patient.getExamBio().getBilanHepa().getPro_bnps().remove(patient.getExamBio().getBilanHepa().getPro_bnps().get(index));
                patient.getExamBio().getBilanHepa().getPro_bnps().add(pro_bnp);
                patient.getExamBio().getBilanHepa().getAlbumis().remove(patient.getExamBio().getBilanHepa().getAlbumis().get(index));
                patient.getExamBio().getBilanHepa().getAlbumis().add(albumi);
                patient.getExamBio().getBilanHepa().getD_dimères().remove(patient.getExamBio().getBilanHepa().getD_dimères().get(index));
                patient.getExamBio().getBilanHepa().getD_dimères().add(d_dimere);
                patient.getExamBio().getBilanHepa().getLdhs().remove(patient.getExamBio().getBilanHepa().getLdhs().get(index));
                patient.getExamBio().getBilanHepa().getLdhs().add(ldh);
                patient.getExamBio().getBilanHepa().getCrps().remove(patient.getExamBio().getBilanHepa().getCrps().get(index));
                patient.getExamBio().getBilanHepa().getCrps().add(crp);
                patient.getExamBio().getBilanHepa().getProcals().remove(patient.getExamBio().getBilanHepa().getProcals().get(index));
                patient.getExamBio().getBilanHepa().getProcals().add(procal);
                patient.getExamBio().getBilanHepa().getFerris().remove(patient.getExamBio().getBilanHepa().getFerris().get(index));
                patient.getExamBio().getBilanHepa().getFerris().add(ferri);
            }

        }
        if(model.getType().equals("AutreBilan")){
            PATHS paths =mapper.map(model, PATHS.class);
            Integer index = findAutreBilanByDate(patient.getExamBio().getAutreBilans().getPathss(), paths.getDatePr());
            if (index == -1) {
                patient.getExamBio().getAutreBilans().getPathss().add(paths);
            }
            else{
                patient.getExamBio().getAutreBilans().getPathss().remove(patient.getExamBio().getAutreBilans().getPathss().get(index));
                patient.getExamBio().getAutreBilans().getPathss().add(paths);
            }

        }
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }


    @CrossOrigin(origins ="*" )
    @PostMapping ("/add-Evolution/{cin}")
    public ResponseEntity addEvolution(@PathVariable Integer cin, @RequestBody EvolutionModel model){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }

        if(model.getCategory().equals("evaluValues")){
            EvaluValue evaluValue= mapper.map(model,EvaluValue.class);
            if(patient.getEvolution().getEvaluations().get(model.getType())==null)
            {
                EvaluValueList list = new EvaluValueList();
                list.getEvaluValues().add(evaluValue);
                patient.getEvolution().getEvaluations().put(model.getType(),list);
            }
            else patient.getEvolution().getEvaluations().get(model.getType()).getEvaluValues().add(evaluValue);
        }
        if(model.getCategory().equals("USI")){
            USIValue  usiValue = mapper.map(model,USIValue.class);

            if(patient.getEvolution().getUsiValues().get(model.getType()) ==null){
                //System.out.println("cc value");
                UsiValueList list = new UsiValueList();
                list.getUsiValues().add(usiValue);
                //System.out.println(list.getUsiValues().size());
                patient.getEvolution().getUsiValues().put(model.getType(), list);
            }
            else patient.getEvolution().getUsiValues().get(model.getType()).getUsiValues().add(usiValue);
        }
        if(model.getCategory().equals("AssResp")){
            AssRespValue value= mapper.map(model,AssRespValue.class);

            if(patient.getEvolution().getAssRespValues().get(model.getType())==null){
                AssRespList list= new AssRespList();
                list.getAssRespValues().add(value);
                patient.getEvolution().getAssRespValues().put(model.getType(),list);

            }
            else patient.getEvolution().getAssRespValues().get(model.getType()).getAssRespValues().add(value);
        }
        if(model.getCategory().equals("Evolution")){
            Evolution evolution;
            if(model.getType().equals("IHH")){
                evolution= mapper.map(model,EvolutionIHH.class);
                patient.getEvolution().getEvolutions().add(evolution);

            }
            if(model.getType().equals("Ho")){
                evolution=mapper.map(model,EvolutionHo.class);
                patient.getEvolution().getEvolutions().add(evolution);
            }
        }

        patientRepository.save(patient);
        return ResponseEntity.ok(patient.getEvolution());
        }


    @CrossOrigin(origins ="*" )
         @PostMapping("/get-evolution/{cin}")

         public ResponseEntity getEvolution(@PathVariable Integer cin ,@RequestBody GetEvolutionModel model){
             Patient patient = patientRepository.findByCin(cin);
             //ModelMapper mapper= new ModelMapper();
             if (patient == null){
                 return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
             }
             // if transfert usi
             if(model.getCategory().equals("AssResp") ){
                 if(patient.getEvolution()==null
                         || patient.getEvolution().getAssRespValues()==null
                         || patient.getEvolution().getAssRespValues().get(model.getType()) == null
                         || patient.getEvolution().getAssRespValues().get(model.getType()).getAssRespValues()==null
                         || patient.getEvolution().getAssRespValues().get(model.getType()).getAssRespValues().size()==0

                 )

                     return ResponseEntity.ok("Aucun Transfert trouvé !");
                 else return ResponseEntity.ok(patient.getEvolution().getAssRespValues().get(model.getType()).getAssRespValues().get(patient.getEvolution().getAssRespValues().get(model.getType()).getAssRespValues().size()-1));
             }
             // if transfert assistance respura
             if(model.getCategory().equals("USI") ){
                 if(patient.getEvolution()==null
                         || patient.getEvolution().getUsiValues()==null
                         || patient.getEvolution().getUsiValues().get(model.getType()) == null
                         || patient.getEvolution().getUsiValues().get(model.getType()).getUsiValues()==null
                         || patient.getEvolution().getUsiValues().get(model.getType()).getUsiValues().size()==0

                 )

                     return ResponseEntity.ok("Aucun Transfert trouvé !");
                 else return ResponseEntity.ok(patient.getEvolution().getUsiValues().get(model.getType()).getUsiValues().get(patient.getEvolution().getUsiValues().get(model.getType()).getUsiValues().size()-1));
             }
             return ResponseEntity.ok("Aucun !");

         }
    }





