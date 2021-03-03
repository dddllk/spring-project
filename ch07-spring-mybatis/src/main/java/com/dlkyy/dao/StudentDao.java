package com.dlkyy.dao;

import com.dlkyy.entity.Student;

import java.util.List;

/**
 * Created by dlkyy on 2021/3/3 23:47
 */
public interface StudentDao {
  int insertStudent(Student student);
  List<Student> selectStudents();
}
