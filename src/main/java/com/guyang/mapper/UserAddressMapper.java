package com.guyang.mapper;

import com.guyang.entity.UserAddress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
public interface UserAddressMapper {
    UserAddress selectById(@Param("id") Long id);
    Boolean saveAddressByUserId(@Param("userId") Long userId);
}
