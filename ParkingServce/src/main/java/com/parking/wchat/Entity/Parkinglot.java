/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Parkinglot
 * Author:   Administrator
 * Date:     2019/4/14 20:49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.parking.wchat.Entity;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/4/14
 * @since 1.0.0
 */
public class Parkinglot implements Serializable {
private String plname;
private String pltype;
private String plstate;

    public String getPlstate() {
        return plstate;
    }

    public void setPlstate(String plstate) {
        this.plstate = plstate;
    }

    public String getPltype() {
        return pltype;
    }

    public void setPltype(String pltype) {
        this.pltype = pltype;
    }

    public String getPlname() {
        return plname;
    }

    public void setPlname(String plname) {
        this.plname = plname;
    }
}