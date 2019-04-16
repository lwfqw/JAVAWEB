package com.parking.wchat.mappers;


import com.parking.wchat.Entity.Adminer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface AdMapper {
    @Select("select * from adminer where id=#{id}")
    Adminer getPasswordById(@Param("id") String id);
}
