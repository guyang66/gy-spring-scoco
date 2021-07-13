package com.guyang.controller;

import com.alibaba.fastjson.JSON;
import org.omg.CORBA.Object;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;


@Controller
public class CustomerErrorController implements ErrorController {
    private static final String ERROR_PATH="/error";

    @GetMapping(ERROR_PATH)
    @ResponseBody
    public String error(HttpServletRequest request){
        Enumeration<String> att = request.getAttributeNames();

        Map<String,Object> map = new HashMap<String,Object>();
        while (att.hasMoreElements()){
            String name = att.nextElement();
            if(name.startsWith("java")){
                Object value = (Object) request.getAttribute(name);
                map.put(name,value);
            }
        }
        return JSON.toJSONString(map);
    }

    @Override
    public String getErrorPath () {
        return ERROR_PATH;
    }
}
