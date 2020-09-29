package com.oauth2.authorization.userdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 用户的JDB服务
 * @author Charles Song
 * @date 2020-6-25
 */
@Service("userDetailsService")
public class JdbcUserDetails implements UserDetailsService {

    /**
     * 自定义用户查询操作
     */
    @Autowired
    private CredentialsDao credentialsDao;

    /**
     * 根据用户名来获取User
     * @param username 用户名
     * @return UserDetails
     * @throws UsernameNotFoundException 用户名未找到
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Credentials credentials = credentialsDao.findByName(username);
        if (credentials == null) {
            throw new UsernameNotFoundException("User '" + username + "' can not be found");
        }
        System.out.println(credentials.toString());
        System.out.println(credentials.getAuthorities().toString());

        //此处授权也可以用credentials.getAuthorities(),但是在资源服务器解析的时候要引入自定义的com.oauth2.authorization.userdetails.Authority类否则会报找不到类对象而解析失败
        return new User(credentials.getName(), credentials.getPassword(), credentials.isEnabled(), true, true, true, credentials.getGrantedAuthorities());
    }

}
