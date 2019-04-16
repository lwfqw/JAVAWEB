/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: User
 * Author:   Administrator
 * Date:     2019/4/14 18:06
 * Description: 用户
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.parking.wchat.Entity;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户〉
 *
 * @author Administrator
 * @create 2019/4/14
 * @since 1.0.0
 */
public class User implements Serializable {
    private String wChatId;
    private String carno;

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }

    public String getwChatId() {
        return wChatId;
    }

    public void setwChatId(String wChatId) {
        this.wChatId = wChatId;
    }
}