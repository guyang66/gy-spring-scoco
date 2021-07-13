package com.guyang.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserAddressParam {

    private Long id;
    private Long userId;
    private String consignee;
    private String consigneeMobile;
    private String email;
    private Long provinceId;
    private Long cityId;
    private Long districtId;
    private String address;
    private Integer isDefault;
    private Long streetId;

    private int creator;


}
