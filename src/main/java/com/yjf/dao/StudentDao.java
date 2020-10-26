package com.yjf.dao;

import com.yjf.entity.*;

import java.util.List;

/**
 * @author 余俊锋
 * @date 2020/10/9 11:50
 * @Description
 */
public interface StudentDao {

     int addStudent(Student student);
     List<Student> listAll();
     void deleteStudent(Integer id);
     void updateStudent(Student student);
}
