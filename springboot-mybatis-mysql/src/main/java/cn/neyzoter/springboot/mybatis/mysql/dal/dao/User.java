package cn.neyzoter.springboot.mybatis.mysql.dal.dao;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;

/**
 * User
 * @author Neyzoter Song
 * @date 2019/9/16
 */
public class User implements Serializable {
    private static final long serialVersionUID = -1L;
    /**
     * main key
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userName;

    /**
     * password
     */
    private String password;

}
