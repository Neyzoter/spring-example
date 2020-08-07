package cn.neyzoter.aop.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 拦截器
 * Aspect：切入点 + 通知，通俗点就是：在什么时机，什么地方，做什么增强！
 * @author neyzoter
 */
@Component
@Aspect
public class LibAop {

    /**
     * 切入点：在哪些类，哪些方法上切入
     */
    @Pointcut("execution(* cn.neyzoter.aop.service.Lib.service())")
    public void lSerivice() {

    }

    @Before("lSerivice()")
    public void before() {
        System.out.println("服务开始");
    }
    @After("lSerivice()")
    public void after() {
        System.out.println("服务结束");
    }
}
