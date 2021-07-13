package com.guyang.mapper;

import com.guyang.entity.Enrollment;
import org.apache.ibatis.annotations.*;


@Mapper
public interface enrollMapper {

    @Select("select *from flora_enrollment where id =#{id}")
    @Results(
            {
                    @Result(property = "applySource", column="apply_source")
            }
    )
    Enrollment queryEnrollmentById(Integer id);
}

