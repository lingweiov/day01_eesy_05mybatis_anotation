package com.ithaima.mybatis.cfg;/*
@outhor shkstart
@date 2019/12/11-23:22
*/

public class Mapper {
    private String queryString; // 要执行的sql语句
    private String resultType; // 实体类的全限定类名

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

}
