/**
 * Copyright (C), 2015-2019,luoweifei
 * FileName: SqlDao
 * Author:   51915
 * Date:     2019/1/3 10:50
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
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SqlDao {
    public Connection getCon() {
        //数据库连接名称
        String username = "sa";
        //数据库连接密码
        String password = "123";
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        //其中test为数据库名称
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=restaurant";
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 工作人员登陆
     * @param no
     * @param password
     * @return
     */
    public boolean getWorkSelect(String no, String password){
        Connection coun = getCon();
        boolean flag = false;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = coun.prepareStatement("select" +
                    " * " +
                    "from Users where Uno=? and password=? and majar='食堂'");

        preparedStatement.setString(1, no);
        preparedStatement.setString(2, password);
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            flag = true;
        }
        rs.close();
        preparedStatement.close();
        coun.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 验证账号密码
     *
     * @param no
     * @param password
     * @return
     * @throws SQLException
     */
    public Boolean getSelect(String no, String password) throws SQLException {
        Connection coun = getCon();
        PreparedStatement preparedStatement =
                coun.prepareStatement("select" +
                        " * " +
                        "from Users where Uno=? and password=?");
        preparedStatement.setString(1, no);
        preparedStatement.setString(2, password);
        ResultSet rs = preparedStatement.executeQuery();
        boolean flag = false;
        while (rs.next()) {
            flag = true;
        }
        rs.close();
        preparedStatement.close();
        coun.close();
        return flag;
    }

    /**
     * 得到菜单
     *
     * @return
     */
    public List<Caidan> getCaidan() {
        Connection coun = getCon();
        List<Caidan> list = new ArrayList<>();
        try {
            Statement statement = coun.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from cai");
            while (resultSet.next()) {
                Caidan caidan = new Caidan();
                caidan.setNo(resultSet.getString("cno"));
                caidan.setName(resultSet.getString("cname"));
                caidan.setMade(resultSet.getString("c_main_made"));
                caidan.setPrice(resultSet.getDouble("c_price"));
                caidan.setKiwi(resultSet.getString("c_taste"));
                list.add(caidan);
            }
            resultSet.close();
            statement.close();
            coun.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 得到点的菜，通过数组
     */
    public List<Caidan> getMyCaidan(String[] a) {
        Connection coun = getCon();
        List<Caidan> list = new ArrayList<>();
        try {
            Statement statement = coun.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from cai where " +
                    "cno in(" + stringArray2Strin(a) + ")");
            while (resultSet.next()) {
                Caidan c= new Caidan();
                c.setNo(resultSet.getString("cno"));
                c.setName(resultSet.getString("cname"));
                c.setMade(resultSet.getString("c_main_made"));
                c.setPrice(resultSet.getDouble("c_price"));
                c.setKiwi(resultSet.getString("c_taste"));
                list.add(c);
            }
            resultSet.close();
            statement.close();
            coun.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    /**
     * 得到所有未完成订单
     */
    public List<order> getallorder() {
        Connection coun = getCon();
        List<order> back = new ArrayList<>();
        try {
            Statement statement = coun.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from dingdan" +
                    " where dzhuangtai='未完成'");
            while (resultSet.next()) {
                order o = new order();
                o.setNo(resultSet.getString("dno"));
                o.setMoney(resultSet.getDouble("dprice"));
                o.setZhuangtai(resultSet.getString("dzhuangtai"));
                back.add(o);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return back;
    }

    /**
     * 添加订单号，状态1和价格
     *
     * @param a
     * @param no
     */
    public void order(String[] a, String no) {
        Connection coun = getCon();
        double money = getMoney(a);
        try {
            Statement statement = coun.createStatement();
            statement.executeUpdate("insert into dingdan(dno,dzhuangtai,date," +
                    "dpr" +
                    "ice) " +
                    "values (" + no +
                    "," +
                    "'未完成',"+getSqlTime()+"," + money + ")");
            for (int i = 0; i < a.length; i++) {
                statement.executeUpdate("insert into own(cno,dno,dzhuangtai," +
                        "date) values (" + a[i] +
                        "," + no
                       + ",未完成" + getSqlTime() +
                        ")");
            }
            statement.close();
            coun.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 得到一串数组表示的订单号的总价格
     *
     * @param m
     * @return
     */
    public double getMoney(String[] m) {
        Connection coun = getCon();
        String s = stringArray2Strin(m);
        double money = 0;
        try {
            Statement statement = coun.createStatement();
            ResultSet resultSet = statement.executeQuery("select count(c_price)" +
                    " from cai where cno in(" + s + ")");
            while (resultSet.next()) {
                money = resultSet.getDouble(1);
            }
            resultSet.close();
            statement.close();
            coun.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return money;
    }

    /**
     * 将数组转化为能被放入sql in语句的括号中
     *
     * @param str
     * @return
     */
    public static String stringArray2Strin(String[] str) {

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            sb.append("'").append(str[i]).append("'").append(",");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

    /**
     * 得到我的信息
     *
     * @param no
     * @throws SQLException
     */
    public User getprivate(String no) {
        User user = new User();
        Connection coun = getCon();
        try {
            Statement statement = coun.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Users" +
                    " where Uno=" + no);
            while (resultSet.next()) {
                user.setName(resultSet.getString("Uname"));
                user.setUno(resultSet.getString("Uno"));
                user.setPassword(resultSet.getString("password"));
                user.setMajar(resultSet.getString("majar"));
            }
            resultSet.close();
            statement.close();
            coun.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }


    /**
     * 得到历史菜单
     */
    public List<order> getHistory(String no) {
        Connection coun = getCon();
        List<order> back = new ArrayList<>();
        try {
            Statement statement = coun.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from dingdan" +
                    " where dno='" + no + "'");
            while (resultSet.next()) {
                order o = new order();
                o.setNo(resultSet.getString("dno"));
                o.setMoney(resultSet.getDouble("dprice"));
                o.setZhuangtai(resultSet.getString("dzhuangtai"));
                back.add(o);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return back;
    }

    public Date getSqlTime() {
        java.util.Date date = new java.util.Date();
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        return date1;
    }
    public void changeZhuangtai(java.util.Date date,String no){
       Connection coun=getCon();
       try{
           Statement statement=coun.createStatement();
           statement.executeUpdate("update dingdan set zhuangtai='完成' where " +
                   "date="+date+"and dno="+no);
           statement.close();
           coun.close();
       } catch (SQLException e) {
           e.printStackTrace();
       }
    }

    public static void main(String[] args) {
        System.out.println(new SqlDao().getSqlTime());
    }
}
