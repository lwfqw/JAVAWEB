package com.weixinSmallApprication.config;

import com.weixinSmallApprication.pojo.User;

import java.util.List;

public interface UserMapper {
    public User selectByTel(String tel)throws Exception;
    public List<User> selectAll()throws Exception;
    public void insertOne(User user)throws  Exception;
    public void  deliteByTel(String tell)throws Exception;
}
