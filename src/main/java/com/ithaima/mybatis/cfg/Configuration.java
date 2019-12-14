package com.ithaima.mybatis.cfg;/*
@outhor shkstart
@date 2019/12/11-23:22
*/

import java.util.HashMap;
import java.util.Map;

public class Configuration {
    private String driver;
    private String url;
    private String username;

    public Configuration(String driver, String url, String username, String password, Map<String, Mapper> mappers) {
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
        this.mappers = mappers;
    }

    public Configuration() {
    }

    private String password;
    private Map<String, Mapper> mappers = new HashMap<String, Mapper>();

    public Map<String, Mapper> getMappers() {
        return mappers;
    }

    public void setMappers(Map<String, Mapper> mappers) {
        this.mappers.putAll(mappers);//此处使用追加的方式
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
