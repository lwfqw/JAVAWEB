/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MybatisTest
 * Author:   Administrator
 * Date:     2019/3/16 19:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.weixinSmallApprication.test;


import com.weixinSmallApprication.config.UserMapper;
import com.weixinSmallApprication.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 * @author Administrator
 * @create 2019/3/16
 * @since 1.0.0
 */
public class MybatisTest {

    public static void main(String[] args) throws Exception {
        InputStream inputStream=Resources.getResourceAsStream("mybaties-config.xml");
        SqlSessionFactory sqlSessionFactory;
        sqlSessionFactory = (SqlSessionFactory) new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper;
        userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> list=userMapper.selectAll();
        for (User u1:list) {
            System.out.println(u1.toString());
        }

        sqlSession.commit();//必须提交才能写入数据库
        sqlSession.close();

    }


}