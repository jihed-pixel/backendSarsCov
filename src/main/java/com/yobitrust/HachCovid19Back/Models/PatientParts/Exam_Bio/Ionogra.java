package com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio;
import com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA.NAK1;
import com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA.NAKUR;
import com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA.NAKUR1;
import com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA.NAk;

import java.util.ArrayList;
import java.util.List;

public class Ionogra {
    private List<NAk> naks;
    private List<NAK1> nak1s;
    private List<NAKUR> nakurs;
    private List<NAKUR1> nakur1s;
    public Ionogra() {
        this.naks=new ArrayList<>();
        this.nak1s=new ArrayList<>();
        this.nakurs=new ArrayList<>();
        this.nakur1s=new ArrayList<>();
    }

    public Ionogra(List<NAk> naks, List<NAK1> nak1s, List<NAKUR> nakurs, List<NAKUR1> nakur1s) {
        this.naks = naks;
        this.nak1s = nak1s;
        this.nakurs = nakurs;
        this.nakur1s = nakur1s;
    }

    public List<NAk> getNaks() {
        return naks;
    }

    public void setNaks(List<NAk> naks) {
        this.naks = naks;
    }

    public List<NAK1> getNak1s() {
        return nak1s;
    }

    public void setNak1s(List<NAK1> nak1s) {
        this.nak1s = nak1s;
    }

    public List<NAKUR> getNakurs() {
        return nakurs;
    }

    public void setNakurs(List<NAKUR> nakurs) {
        this.nakurs = nakurs;
    }

    public List<NAKUR1> getNakur1s() {
        return nakur1s;
    }

    public void setNakur1s(List<NAKUR1> nakur1s) {
        this.nakur1s = nakur1s;
    }
}
