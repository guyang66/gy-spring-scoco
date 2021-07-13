package com.guyang.dao;

import com.guyang.dao.common.MyBatisRepository;
import com.guyang.entity.UserAddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@MyBatisRepository
public interface UserAddressDao extends BaseDao<UserAddress>{
    public UserAddress selectById(@Param("id") Long id);
}

