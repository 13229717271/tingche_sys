package com.lab.thelab.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plan {
    private String pid;
    private String pname;
    private String postrequire;
    private Integer pnum;
    private String apply;
    private String applicant;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPostrequire() {
        return postrequire;
    }

    public void setPostrequire(String postrequire) {
        this.postrequire = postrequire;
    }

    public Integer getPnum() {
        return pnum;
    }

    public void setPnum(Integer pnum) {
        this.pnum = pnum;
    }

    public String getApply() {
        return apply;
    }

    public void setApply(String apply) {
        this.apply = apply;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }
}


