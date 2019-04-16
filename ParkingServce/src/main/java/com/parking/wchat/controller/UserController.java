/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SayHello
 * Author:   Administrator
 * Date:     2019/4/11 23:35
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/4/11
 * @since 1.0.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    AdminerServce adminerServce;
    @Autowired
    UserMapper userMapper;
    @Autowired
    ParkMapper parkMapper;
    @Autowired
    ParkinglotMapper parkinglotMapper;
@RequestMapping( "/hello")//测试控制器能否访问，对项目没啥影响
    String say() {
    return "hello";
}
/**    
@RequestMapping(value = "/login",method = RequestMethod.GET)//管理员登录
    String login(String id,String password){
    String message=adminerServce.login(id,password);
    return "{'message':"+message+"}";
}
*/
@RequestMapping("/write")//用户写入数据库
   void writeUser(User user){
    userMapper.insertOne(user.getwChatId(),user.getCarno());
   }
@RequestMapping("/getstate") //查询绑定信息
   User getState(String wchatno){
   return userMapper.lookInformation(wchatno);
   }
@RequestMapping("/getPark")   //得到当前停车
Park getNowPark(String carno){
    return parkMapper.getParkState(carno);
    }
@RequestMapping("/getAllPl")//得到所有停车场
    List<Parkinglot>  getAllPl(){
    return parkinglotMapper.selectAllPl();
    }
@RequestMapping("/canPark")
   List<Parkinglot> selectCanP() {return parkinglotMapper.selectCanPark();}
}
