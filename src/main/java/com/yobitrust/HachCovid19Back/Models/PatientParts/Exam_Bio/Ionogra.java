package com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio;

import java.util.Date;

public class Ionogra {
    private Date datePr;
    private Double nak;
    private Double nakUr;

    public Ionogra(Date datePr, Double nak, Double nakUr) {
        this.datePr = datePr;
        this.nak = nak;
        this.nakUr = nakUr;
    }

    public Ionogra() {
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Double getNak() {
        return nak;
    }

    public void setNak(Double nak) {
        this.nak = nak;
    }

    public Double getNakUr() {
        return nakUr;
    }

    public void setNakUr(Double nakUr) {
        this.nakUr = nakUr;
    }
}
