package com.guyang.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper =  false)
@Data
public class Enrollment extends BaseEntity {
    private String applySource;
    private Long userId;
    private String applicant;
    private String applyImg;
    private String contactMobile;
    private String contactName;
    private String briefDesc;
    private String applyStatus;
    private String remark;

//    public  Long getUserId(){return  userId;}
//    public  void setUserId(Long userId){this.userId = userId ;}
//
//
//    public String getApplySource() {
//        return applySource;
//    }
//    public void setApplySource(String applySource) {
//        this.applySource = applySource;
//    }
//
//
//    public String getApplicant() {
//        return applicant;
//    }
//    public void setApplicant(String applicant) {
//        this.applicant = applicant;
//    }
//
//    public String getApplyImg() {
//        return applyImg;
//    }
//    public void setApplyImg(String applyImg) {
//        this.applicant = applyImg;
//    }
//
//    public String getContactMobile() {
//        return contactMobile;
//    }
//    public void setContactMobile(String contactMobile) {
//        this.contactMobile = contactMobile;
//    }
//
//    public String getContactName() {
//        return contactName;
//    }
//    public void setContactName(String contactName) {
//        this.contactName = contactName;
//    }
//
//    public String getBriefDesc() {
//        return briefDesc;
//    }
//    public void setBriefDesc(String briefDesc) {
//        this.briefDesc = briefDesc;
//    }
//
//    public String getApplyStatus() {
//        return applyStatus;
//    }
//    public void setApplyStatus(String applyStatus) {
//        this.applicant = applyStatus;
//    }
//
//    public String getRemark() {
//        return remark;
//    }
//    public void SetRemark(String remark) {
//        this.remark = remark;
//    }
}
