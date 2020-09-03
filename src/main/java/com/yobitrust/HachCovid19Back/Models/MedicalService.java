package com.yobitrust.HachCovid19Back.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MedicalService {
    @Id
    private  Long id;
    private String username;
    private String password ;
    private String hospitalName;
    private String medicalServiceName ;
    private String address;

    public MedicalService() {
    }


    public MedicalService(Long id,String username, String password, String hospitalName, String medicalServiceName, String address) {
        this.id=id;
        this.username = username;
        this.password = password;
        this.hospitalName = hospitalName;
        this.medicalServiceName = medicalServiceName;
        this.address = address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setMedicalServiceName(String medicalServiceName) {
        this.medicalServiceName = medicalServiceName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getMedicalServiceName() {
        return medicalServiceName;
    }

    public String getAddress() {
        return address;
    }
}
