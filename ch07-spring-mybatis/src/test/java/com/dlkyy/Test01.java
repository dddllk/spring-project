package com.dlkyy;

import com.dlkyy.dao.StudentDao;
import com.dlkyy.entity.Student;
import com.dlkyy.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by dlkyy on 2021/3/4 19:48
 */
public class Test01 {
  @Test
  public void test01(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    String names[] = ac.getBeanDefinitionNames();
    for(String name: names){
      System.out.println("容器中对象名称：" +name + "||" + ac.getBean(name).getClass().getName());
    }
  }

  @Test
  public void test02(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    StudentDao dao = (StudentDao) ac.getBean("studentDao");
    Student stu = new Student(1019, "小狗子", "123@qq.com","17");
    int num = dao.insertStudent(stu);
    System.out.println(num);
  }

  @Test
  public void test03(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    // 获取spring容器中的dao对象
    StudentService service = (StudentService) ac.getBean("studentService");
    Student stu = new Student(1020, "小猫子", "456@qq.com","21");
    int num = service.addStudent(stu);
    // spring和mybatis整合在一起使用，事务是自动提交的。无需执行SqlSession.commit();
    System.out.println("nums = " + num);
  }

  // 查询
  @Test
  public void test04(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    StudentService service = (StudentService) ac.getBean("studentService");
    List<Student> students = service.queryStudents();
    for(Student stu : students) {
      System.out.println(stu);
    }
  }
}
