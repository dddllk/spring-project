package com.dlkyy.dao.impl;

import com.dlkyy.dao.UserDao;
import com.dlkyy.domain.SysUser;
import org.springframework.stereotype.Repository;

@Repository("mysqlDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void insertUser(SysUser user) {
        System.out.println("user插入到mysql数据库");
    }
}
