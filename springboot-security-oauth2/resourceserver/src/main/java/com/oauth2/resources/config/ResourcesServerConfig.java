package com.oauth2.resources.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;


import javax.sql.DataSource;

/**
 * 资源服务器配置
 * @author Charles Song
 * @date 2020-6-25
 */

@Configuration
@EnableResourceServer
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResourcesServerConfig extends ResourceServerConfigurerAdapter {
    /**
     * mysql data source
     */
    @Autowired
    private DataSource dataSource;
    /**
     * redis
     */
    @Autowired
    RedisConnectionFactory redisConnectionFactory;
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
}

    @Autowired
    private LogoutSuccessHandler logoutSuccessHandler;

//    /**
//     * 将token存放在jdbc中
//     * @return
//     */
//    @Bean
//    public TokenStore tokenStore() {
//        return new JdbcTokenStore(dataSource);
//    }
    /**
     * 将token存放在redis中
     * @return TokenStore
     */
    @Bean
    public TokenStore tokenStore() {
        return new RedisTokenStore(redisConnectionFactory);
    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId("project_api").stateless(false);
        resources.tokenStore(tokenStore());
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .logout()
                //虚拟的登出地址
                .logoutUrl("/logout")
                //登出做的操作
                .logoutSuccessHandler(logoutSuccessHandler)
                .and()
                .authorizeRequests()
                // 配置不需要token的path
                .antMatchers("/test/hello").permitAll()
                // 配置需要token的path
                .antMatchers("/test/**").authenticated();
    }
}
