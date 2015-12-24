package com.winit.mybatis.dao;

import com.winit.mybatis.entity.Student;

import java.util.List;

/**
 * Created by xiangyu.liang on 2015/12/21.
 */
public interface StudentDao {
    List<Student> getStudentsByName(String username);
}
