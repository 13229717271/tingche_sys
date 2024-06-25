package com.lab.thelab.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sign {
    private String sid;
    private String postname;
    private String skill;
    private String applicant;
    private String applytime;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getApplytime() {
        return applytime;
    }

    public void setApplytime(String applytime) {
        this.applytime = applytime;
    }
}
