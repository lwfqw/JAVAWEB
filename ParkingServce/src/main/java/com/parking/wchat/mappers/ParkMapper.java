package com.parking.wchat.mappers;

import com.parking.wchat.Entity.Park;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ParkMapper{
    //用户操作
 @Select("select * from park where carno=#{carno} and pstate='正停'")
    Park getParkState(String carno);//查询车辆当前停车


 //管理员操作
  @Select("select * from park where pstate='正停' group by plname")
    List<Park> getAllPark();//管理员查看所有已停车辆
    @Select("select count(*) from park where pstate='正停'")
    int getApNum();//管理员查看所有已停车辆 数目
  @Update("update park set pstate='已开' where carno=#{carno} and pstate='正停'")
    void changeState(String carno);//移除车辆，管理员操作
}
