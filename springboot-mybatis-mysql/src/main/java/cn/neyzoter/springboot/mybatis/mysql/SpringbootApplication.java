package cn.neyzoter.springboot.mybatis.mysql;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Springboot Application
 * @author Neyzoter Song
 * @date 2019/9/16
 */
@MapperScan(basePackages = "cn.neyzoter.springboot.mybatis.mysql.dal.dao")
//@EnableScheduling
@SpringBootApplication
public class SpringbootApplication {
    private final static Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);
    public static void main(String[] args){
        logger.info("SpringbootApplication Start...");
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
