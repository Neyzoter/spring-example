package cn.neyzoter.springboot.mybatis.mysql.dal.dao;

import cn.neyzoter.springboot.mybatis.mysql.dal.domain.User;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * user dall
 * @author Neyzoter Song
 * @date 2019/9/20
 */
public interface UserDao {
    List<User> findAllUser();
}
