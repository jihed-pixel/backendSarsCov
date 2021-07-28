package com.yobitrust.HachCovid19Back.Models.PatientParts;

import com.yobitrust.HachCovid19Back.Models.PatientParts.ExamRadioParaCli.Thorax;
import com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags.Pcr;
import com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags.RapideAc;
import com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags.RapideAg;
import com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags.Serologie;

import java.util.ArrayList;
import java.util.List;

public class ConfDiag {
    List<Pcr>      pcrs;
    List<RapideAc> rapideAcs;
    List<RapideAg>  rapideAgs;
    List<Serologie> serologies;
    public ConfDiag(){
        this.pcrs=new ArrayList<>();
        this.rapideAcs=new ArrayList<> ();
        this.rapideAgs=new ArrayList<> ();
        this.serologies=new ArrayList<> ();
    }

    public ConfDiag(List<Pcr> pcrs, List<RapideAc> rapideAcs, List<RapideAg> rapideAgs, List<Serologie> serologies) {
        this.pcrs = pcrs;
        this.rapideAcs = rapideAcs;
        this.rapideAgs = rapideAgs;
        this.serologies = serologies;
    }

    public List<Pcr> getPcrs() {
        return pcrs;
    }

    public void setPcrs(List<Pcr> pcrs) {
        this.pcrs = pcrs;
    }

    public List<RapideAc> getRapideAcs() {
        return rapideAcs;
    }

    public void setRapideAcs(List<RapideAc> rapideAcs) {
        this.rapideAcs = rapideAcs;
    }

    public List<RapideAg> getRapideAgs() {
        return rapideAgs;
    }

    public void setRapideAgs(List<RapideAg> rapideAgs) {
        this.rapideAgs = rapideAgs;
    }

    public List<Serologie> getSerologies() {
        return serologies;
    }

    public void setSerologies(List<Serologie> serologies) {
        this.serologies = serologies;
    }
}
