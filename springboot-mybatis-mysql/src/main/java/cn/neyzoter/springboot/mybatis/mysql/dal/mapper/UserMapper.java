package cn.neyzoter.springboot.mybatis.mysql.dal.mapper;

import cn.neyzoter.springboot.mybatis.mysql.dal.dao.User;
import cn.neyzoter.springboot.mybatis.mysql.dal.util.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * User mapper
 * @author Neyzoter Song
 * @date 2019/9/16
 */
public interface UserMapper extends BaseMapper<User> {
    @Select(value = "select * from User")
    List<User> getAllUser();


    @Insert(value = "insert into user(userName,password) values(#{userName}, #{password})")
    void insertUser(String userName, String password);
}
