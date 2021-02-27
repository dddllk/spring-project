package com.dlkyy.service.impl;

import com.dlkyy.dao.UserDao;
import com.dlkyy.dao.impl.UserDaoImpl;
import com.dlkyy.domain.SysUser;
import com.dlkyy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    //引用类型， 在xml文件给属性赋值， 要求属性需要有set方法
    //byType
    //@Autowired
    //@Qualifier("mysqlDao")
    @Resource(name = "oracleDao")
    private UserDao dao = null;

    //可以不需要
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void addUser(SysUser user) {
        //处理数据，调用dao的方法
        //调用dao的方法
        dao.insertUser(user);
    }
}
