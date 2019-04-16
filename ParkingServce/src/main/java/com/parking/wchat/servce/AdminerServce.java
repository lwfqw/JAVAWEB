/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AdminerServce
 * Author:   Administrator
 * Date:     2019/4/13 15:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.parking.wchat.servce;

import com.parking.wchat.mappers.AdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/4/13
 * @since 1.0.0
 */
@Service
public class AdminerServce {
@Autowired
    private AdMapper adMapper;
public String login(String id,String password){
    if(password.equals(adMapper.getPasswordById(id).getPassword()))
        return "success";
    return "fail";
}

}