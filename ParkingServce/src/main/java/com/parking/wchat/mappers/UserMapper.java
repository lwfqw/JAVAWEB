package com.parking.wchat.mappers;

import com.parking.wchat.Entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
@Insert("insert into user(wchatno,carno) values(#{wchatno},#{carno})")
    void insertOne(String wchatno,String carno);//插入绑定的用户
@Select("select * from user where wchatno=#{wchatno}")
    User lookInformation(@Param("wchatno") String wchatno);//查询绑定的用户
@Select("select * from user")
    List<User>  getAllUser();//管理员查询所有用户
}
