package com.yobitrust.HachCovid19Back.Models.RequestModels;

import java.util.Date;

public class GetEvolutionModel {
    private String category;
    private String type;
    private Date dateDiag;

    public GetEvolutionModel() {
    }

    public GetEvolutionModel(String category, String type, Date dateDiag) {
        this.category = category;
        this.type = type;
        this.dateDiag = dateDiag;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateDiag() {
        return dateDiag;
    }

    public void setDateDiag(Date dateDiag) {
        this.dateDiag = dateDiag;
    }
}
