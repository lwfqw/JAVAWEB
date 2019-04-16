/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: park
 * Author:   Administrator
 * Date:     2019/4/14 20:39
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
public class Park implements Serializable {
private String carno;
private String plname;
private String pstate;

    public String getPstate() {
        return pstate;
    }

    public void setPstate(String pstate) {
        this.pstate = pstate;
    }

    public String getPlname() {
        return plname;
    }

    public void setPlname(String plname) {
        this.plname = plname;
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }
}