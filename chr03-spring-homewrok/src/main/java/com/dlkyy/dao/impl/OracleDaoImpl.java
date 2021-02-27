package com.dlkyy.dao.impl;

import com.dlkyy.dao.UserDao;
import com.dlkyy.domain.SysUser;
import org.springframework.stereotype.Repository;

@Repository("oracleDao")
public class OracleDaoImpl implements UserDao {
    @Override
    public void insertUser(SysUser user) {
        System.out.println("oracle 的insertUser");
    }
}
