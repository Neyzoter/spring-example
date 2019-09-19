package cn.neyzoter.springboot.mybatis.mysql.biz.service.impl;

import cn.neyzoter.springboot.mybatis.mysql.biz.service.UserService;
import cn.neyzoter.springboot.mybatis.mysql.dal.dao.UserDao;
import cn.neyzoter.springboot.mybatis.mysql.dal.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * user service implement
 * @author Neyzoter Song
 * @date 2019/9/20
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAllUser(){
        return userDao.findAllUser();
    }
}
