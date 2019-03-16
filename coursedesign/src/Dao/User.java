/**
 * Copyright (C), 2015-2019,luoweifei
 * FileName: User
 * Author:   51915
 * Date:     2019/1/3 10:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package Dao;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 51915
 * @create 2019/1/3
 * @since 1.0.0
 */

public class User {
    String Uno;
    String password;
    String name;
     String majar;
    public void setUno(String uno) {
        Uno = uno;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajar(String majar) {
        this.majar = majar;
    }

    public String getUno() {
        return Uno;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getMajar() {
        return majar;
    }
}
