package com.yobitrust.HachCovid19Back.Models.RequestModels;

import java.util.Date;

public class GetTraitmentModel {
    private Date dateDiag;
    private String trai;

    public GetTraitmentModel() {
    }

    public GetTraitmentModel(Date dateDiag, String trai) {
        this.dateDiag = dateDiag;
        this.trai = trai;
    }

    public Date getDateDiag() {
        return dateDiag;
    }

    public void setDateDiag(Date dateDiag) {
        this.dateDiag = dateDiag;
    }

    public String getTrai() {
        return trai;
    }

    public void setTrai(String trai) {
        this.trai = trai;
    }
}
