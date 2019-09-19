package cn.neyzoter.springboot.mybatis.mysql.biz.service;

import cn.neyzoter.springboot.mybatis.mysql.dal.domain.User;

import java.util.List;

/**
 * user service
 * @author Neyzoter Song
 * @date 2019/9/20
 */
public interface UserService {
    List<User> findAllUser();
}
