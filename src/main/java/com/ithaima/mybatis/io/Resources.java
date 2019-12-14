package com.ithaima.mybatis.io;/*
@outhor shkstart
@date 2019/12/11-20:48
*/

import java.io.InputStream;

public class Resources {
    public static InputStream getResourceAsStream(String filePath){
 return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
