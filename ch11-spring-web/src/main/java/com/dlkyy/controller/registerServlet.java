package com.dlkyy.controller;

/**
 * Created by dlkyy on 2021/3/6 12:38
 */

import com.dlkyy.entity.Student;
import com.dlkyy.service.StudentService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class registerServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    //获取参数
    String username = request.getParameter("username");
    String age = request.getParameter("age");
    String email = request.getParameter("email");
    // 将参数放入student对象
    Student student = new Student(null, username, email, Integer.parseInt(age));

    // 使用监听器之前
    // 创建spring容器对象
    // ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

    // 使用监听器后
    WebApplicationContext ac = null;
    // 获取ServletContext中的容器对象，拿来就用
    // String key = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
    // Object attr = getServletContext().getAttribute(key);
    // if(attr != null) {
    //   ac = (WebApplicationContext)attr;
    // }

    // 使用框架中的方法获取容器对象
    ServletContext sc = getServletContext();
    ac = WebApplicationContextUtils.getRequiredWebApplicationContext(sc);
    System.out.println("容器对象的信息："+ac);

    StudentService service = (StudentService) ac.getBean("studentService");

    // 添加
    service.addStudent(student);
    // 给个页面
    request.getRequestDispatcher("/result.jsp").forward(request, response);

  }
}
