/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Adminer
 * Author:   Administrator
 * Date:     2019/4/13 13:34
 * Description: 管理员类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.parking.wchat.Entity;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈管理员类〉
 *
 * @author Administrator
 * @create 2019/4/13
 * @since 1.0.0
 */
public class Adminer implements Serializable {
    private String id;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Adminer{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}