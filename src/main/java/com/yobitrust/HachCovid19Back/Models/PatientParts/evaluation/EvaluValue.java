package com.yobitrust.HachCovid19Back.Models.PatientParts.evaluation;

import java.util.Date;

public class EvaluValue {
    private Date time;
    private Double value;

    public EvaluValue(Date time, Double value) {
        this.time = time;
        this.value = value;
    }

    public EvaluValue() {
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
