package cn.neyzoter.aop.service;

import org.springframework.stereotype.Component;

/**
 * 图书馆
 * @author neyzoter
 */
@Component("lib")
public class Lib {
    /**
     * 图书馆的服务
     */
    public void service() {
        System.out.println("借书");
        System.out.println("还书");
    }
}
