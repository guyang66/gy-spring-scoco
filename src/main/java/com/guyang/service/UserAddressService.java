package com.guyang.service;

import com.guyang.entity.UserAddress;
import java.util.List;


public interface UserAddressService {

    public UserAddress selectById(Long id);
    public Boolean saveAddressByUserId(Long userId);

}
