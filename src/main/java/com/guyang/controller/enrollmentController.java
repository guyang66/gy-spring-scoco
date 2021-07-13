package com.guyang.controller;

import com.guyang.entity.Enrollment;
import com.guyang.service.enrollService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/enrollment")
public class enrollmentController {
//    @Autowired
//    private enrollService enrollServices;
    @RequestMapping("query")
    public String query(Integer id){
        Enrollment enrollment = new Enrollment();
        return "who:" + enrollment.getApplicant() + "type:" + enrollment.getApplySource();
    }
}

