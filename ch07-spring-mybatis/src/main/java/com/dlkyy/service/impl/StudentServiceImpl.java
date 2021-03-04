package com.dlkyy.service.impl;

import com.dlkyy.dao.StudentDao;
import com.dlkyy.entity.Student;
import com.dlkyy.service.StudentService;

import java.util.List;

/**
 * Created by dlkyy on 2021/3/4 0:04
 */
public class StudentServiceImpl implements StudentService {
  // 引用类型
  private StudentDao studentDao;

  // set 注入
  public void setStudentDao(StudentDao studentDao) {
    this.studentDao = studentDao;
  }

  @Override
  public int addStudent(Student student) {
    int nums = studentDao.insertStudent(student);
    return nums;
  }

  @Override
  public List<Student> queryStudents() {
    List<Student> students = studentDao.selectStudents();
    return students;
  }
}
