/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: User
 * Author:   Administrator
 * Date:     2019/3/16 14:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.weixinSmallApprication.pojo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/3/16
 * @since 1.0.0
 */
public class User {
    private String nick;
    private String tel;
    private  String graduate;

    public User(String nick,String tel,String educate){
        this.nick=nick;
        this.tel=tel;
        this.graduate=educate;
    }

    @Override
    public String toString() {
        return "User{" +
                "nick='" + nick + '\'' +
                ", tel='" + tel + '\'' +
                ", graduate='" + graduate + '\'' +
                '}';
    }

    public void setGraduate(String graduate) {
        this.graduate = graduate;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getGraduate() {
        return graduate;
    }


    public String getTel() {
        return tel;
    }


    public String getNick() {
        return nick;
    }


}