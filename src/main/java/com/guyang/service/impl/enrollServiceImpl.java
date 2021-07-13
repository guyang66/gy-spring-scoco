package com.guyang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.guyang.service.enrollService;
import com.guyang.entity.Enrollment;
import com.guyang.mapper.enrollMapper;


@Service("enrollService")
public class enrollServiceImpl implements  enrollService{
    private @Autowired enrollMapper enrollMappers;
    private @Autowired enrollService enrollServices;

    @Override
    public  Enrollment queryEnrollmentById(Integer id){
        return enrollMappers.queryEnrollmentById(id);
    }

}
