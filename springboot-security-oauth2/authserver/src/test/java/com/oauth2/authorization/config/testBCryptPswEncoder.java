package com.oauth2.authorization.config;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 测试BCryptPasswordEncoder
 * @author Charles Song
 * @date 2020-6-25
 */
public class testBCryptPswEncoder {
    @Test
    public void testBcPswEnc () {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String enc = encoder.encode("web_application_123456");
        // 可以发现每次执行的结果不一样
        // 是如何实现密文和明文匹配的呢？
        // 密文中有salt的信息
        // BCryptPasswordEncoder的match函数对比明文和密文前，计算密文，即将明文和密文作为输入，从密文中获取salt信息，计算得到密文
        System.out.println(enc);
    }
}
