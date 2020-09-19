package com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio;

import java.util.Date;

public class AutreBilan {
    private Date datePr;
    private String paths;

    public AutreBilan() {
    }

    public AutreBilan(Date datePr, String paths) {
        this.datePr = datePr;
        this.paths = paths;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public String getPaths() {
        return paths;
    }

    public void setPaths(String paths) {
        this.paths = paths;
    }
}
