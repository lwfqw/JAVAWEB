package com.parking.wchat.mappers;

import com.parking.wchat.Entity.Parkinglot;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ParkinglotMapper {
    @Select("select * from parkinglot")
    @Results({@Result(property = "plname",column="plname"),
    @Result(property = "pltype",column = "pltype"),
    @Result(property = "plstate",column = "plstate")})
    List<Parkinglot> selectAllPl();//查询所有停车场
    @Select("select * from parkinglot where plstate='轻松'")
    List<Parkinglot> selectCanPark();
    @Insert("insert into parkinglot values(#{plname},#{pltype},#{plstate})")
    void insertPl(Parkinglot parkinglot);//插入停车场，管理员操作
    @Update("update parkinglot set plstate=#{plstate} where plname=#{plname}")
    void changePlstate(String plstate,String plname);//管理员修改停车场状态
}
