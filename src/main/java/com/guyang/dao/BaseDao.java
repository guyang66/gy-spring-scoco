package com.guyang.dao;

import java.util.List;
import java.util.Map;

public interface BaseDao<T> {

    Integer selectCount(Map<String, ?> param);
    List<T> select(Map<String, ?> parameters);
    T selectById(Object id);
    List<T> selectByIds(Object[] ids);
    int deleteById(Object id);
    int deleteByIds(Object[] list);
    int delete(Map<String, Object> parameters);
    int insert(T t);
    int updateById(T t);

}
