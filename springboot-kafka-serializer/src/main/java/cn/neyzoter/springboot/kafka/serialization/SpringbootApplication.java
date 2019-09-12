package cn.neyzoter.springboot.kafka.serialization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot application
 */
@SpringBootApplication
public class SpringbootApplication {
    private final static Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);
    public static void main(String[] args){
        logger.info("SpringbootApplication Start...");
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
