package com.dlkyy.service;

import com.dlkyy.entity.Student;

import java.util.List;

/**
 * Created by dlkyy on 2021/3/4 0:02
 */
public interface StudentService {
  int addStudent(Student student);
  List<Student> queryStudents();
}
