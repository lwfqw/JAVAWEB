/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AdminerController
 * Author:   Administrator
 * Date:     2019/4/14 21:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.parking.wchat.controller;

import com.parking.wchat.Entity.Park;
import com.parking.wchat.Entity.Parkinglot;
import com.parking.wchat.Entity.User;
import com.parking.wchat.mappers.ParkMapper;
import com.parking.wchat.mappers.ParkinglotMapper;
import com.parking.wchat.mappers.UserMapper;
import com.parking.wchat.servce.AdminerServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/4/14
 * @since 1.0.0
 */
@RestController
@RequestMapping("/adminer")
public class AdminerController {
    @Autowired
    AdminerServce adminerServce;
    @Autowired
    UserMapper userMapper;
    @Autowired
    ParkMapper parkMapper;
    @Autowired
    ParkinglotMapper parkinglotMapper;
@RequestMapping("/getAllPark")//得到所有停车信息
    List<Park> getAllPark(){
    return parkMapper.getAllPark();
    }
@RequestMapping("/getParkNum")   //得到所有停车数目
   int getParkNum(){
    return parkMapper.getApNum();
}
@RequestMapping("/removePark")//把用户移除正停状态
    void removePark(String carno){
    parkMapper.changeState(carno);
}
@RequestMapping("/getAllUser")//得到所有用户
    List<User> getAllUser(){
    return userMapper.getAllUser();
}
@RequestMapping("/addPl")//添加停车场
    void addPl(Parkinglot parkinglot){
    parkinglotMapper.insertPl(parkinglot);
}
@RequestMapping("/changeState")//改变停车场状态，比如将华东交大1停车场轻松状态改为紧张
    void changeState(String plstate,String plname){
    parkinglotMapper.changePlstate(plstate,plname);
}
}
