package com.ithaima.mybatis.sqlsession;/*
@outhor shkstart
@date 2019/12/11-20:54
*/


import com.ithaima.mybatis.cfg.Configuration;
import com.ithaima.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.ithaima.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

public class SqlSessionFactoryBuilder {
    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     *
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config) {
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(cfg);
    }

}
