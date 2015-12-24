package com.winit.mybatis.entity;

import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;

/**
 * Created by xiangyu.liang on 2015/12/21.
 */
@Alias( "Student")
public class Student {
    Long id;
    String  name;
    String idcard;
    String age;
    Timestamp createdate;
    public Long getId()
    {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIdcard() {
        return idcard;
    }

    public String getAge() {
        return age;
    }

    public Timestamp getCreatedate() {
        return createdate;
    }
}
