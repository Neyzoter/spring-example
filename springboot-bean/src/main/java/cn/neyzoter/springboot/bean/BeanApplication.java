package cn.neyzoter.springboot.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages={"cn.neyzoter.springboot.bean.service.*","cn.neyzoter.springboot.bean.web.controller"})
@SpringBootApplication
public class BeanApplication {
    public static void main(String args[]){
        SpringApplication.run(BeanApplication.class,args);
    }
}
