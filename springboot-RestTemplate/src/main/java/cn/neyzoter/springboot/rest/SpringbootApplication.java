package cn.neyzoter.springboot.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Springboot application
 * @author Neyzoter Song
 * @date 2019/9/15
 */
@SpringBootApplication
@EnableScheduling
public class SpringbootApplication {
    private final static Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);
    public static void main(String[] args){
        logger.info("SpringbootApplication Start...");
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
