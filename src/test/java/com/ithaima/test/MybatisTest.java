package com.ithaima.test;/*
@outhor shkstart
@date 2019/12/11-14:23
*/


import com.ithaima.dao.IUserDao;
import com.ithaima.domain.User;
import com.ithaima.mybatis.io.Resources;
import com.ithaima.mybatis.sqlsession.SqlSession;
import com.ithaima.mybatis.sqlsession.SqlSessionFactory;
import com.ithaima.mybatis.sqlsession.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    /*public static void main(String[] args) throws Exception {
        // 1.读取配置文件
        InputStream input = Resources.getResourceAsStream("Mybatis-configs.xml");
        // 2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 使用构建者模式，把对象的创建信息隐藏，使得调用方法的时候就可拿到对象
        SqlSessionFactory factory = builder.build(input);
        // 3.使用工厂创建SqlSession对象(借助此对象与数据库交互)
        // 使用工厂模式，解耦（降低类之间的依赖关系）
        SqlSession session = factory.openSession();
        // 4.使用SqlSession对象创建dao接口的代理对象
        // 使用代理模式，不修改源码的基础上对方法进行增强
        IUserDao userDao = session.getMapper(IUserDao.class);
        // 5.使用代理对象执行dao接口中的方法
        List<User> list = userDao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
        // 6.释放资源
        session.close();
        input.close();
    }*/

    public static void main(String[] args) throws  Exception {
         //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
         SqlSessionFactory factory=builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();

        //4.使用SqlSession创建Dao接口的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);

        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        //6.释放资源
        session.close();
        in.close();
    }
}
