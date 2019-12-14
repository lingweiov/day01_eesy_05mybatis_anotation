package com.ithaima.mybatis.sqlsession.defaults;/*
@outhor shkstart
@date 2019/12/11-23:43
*/

import com.ithaima.mybatis.cfg.Configuration;
import com.ithaima.mybatis.sqlsession.SqlSession;
import com.ithaima.mybatis.sqlsession.SqlSessionFactory;

public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg) {
        this.cfg = cfg;
    }

    /**
     * 用于创建一个新的连接
     *
     * @return
     */
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
