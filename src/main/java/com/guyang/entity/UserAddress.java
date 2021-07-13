package com.guyang.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;



@EqualsAndHashCode(callSuper =  false)
@Data
public class UserAddress extends BaseEntity {


    private Long userId;
    private String consignee;
    private String consigneeMobile;
    private String email;
    private Long provinceId;
    private Long cityId;
    private Long districtId;
    private String address;
    private String isDefault;
    private Long streetId;


    public String checkValidation(){
        if(this.userId==null){
            return "userId is null";
        }
        if(this.consignee==null){
            return "consignee is null";
        }
        if(this.consigneeMobile==null){
            return "consigneeMobile is null";
        }
        if(this.provinceId==null){
            return "provinceId is null";
        }
        if(this.cityId==null){
            return "cityId is null";
        }
        if(this.districtId==null){
            return "districtId is null";
        }
        if(this.streetId==null){
            return "streetId is null";
        }
        return "";
    }
}
