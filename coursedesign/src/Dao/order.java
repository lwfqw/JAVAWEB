/**
 * Copyright (C), 2015-2019,luoweifei
 * FileName: order
 * Author:   51915
 * Date:     2019/1/8 15:04
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
 * @create 2019/1/8
 * @since 1.0.0
 */

public class order {
    String no;
    String zhuangtai;
    Double money;

    public void setNo(String no) {
        this.no = no;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getNo() {
        return no;
    }

    public String getZhuangtai() {
        return zhuangtai;
    }

    public Double getMoney() {
        return money;
    }
}
