/**
 * Copyright (C), 2015-2019,luoweifei
 * FileName: Caidan
 * Author:   51915
 * Date:     2019/1/6 15:21
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
 * @create 2019/1/6
 * @since 1.0.0
 */

public class Caidan {
    private String no;
    private String name;
    private String made;
    private String kiwi;
    private double price;

    public void setNo(String no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public void setKiwi(String kiwi) {
        this.kiwi = kiwi;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getKiwi() {
        return kiwi;
    }

    public String getMade() {
        return made;
    }
    public double getPrice(){
        return price;
    }
}
