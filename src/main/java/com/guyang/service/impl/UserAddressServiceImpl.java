package com.guyang.service.impl;

import com.guyang.entity.UserAddress;
import com.guyang.dao.UserAddressDao;
import com.guyang.mapper.UserAddressMapper;
import com.guyang.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAddressServiceImpl implements UserAddressService {

//    @Autowired
//    private UserAddressMapper userAddressMapper;
    @Autowired
    private  UserAddressDao userAddressDao;

    @Override
    public UserAddress selectById(Long id){
      return  userAddressDao.selectById(id);
    };

    @Override
    public Boolean saveAddressByUserId(Long userId){
        return  null;
    };


}
