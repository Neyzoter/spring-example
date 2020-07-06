package icu.nescar.jet;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

// MapperScan的作用是将接口和classpath/mapper文件夹内的xml文件对应起来
// @Mapper可以实现相同的功能，但是需要给每个接口都添加
@MapperScan(basePackages = "icu.nescar.jet.dal.dao")
@EnableScheduling
@SpringBootApplication
public class Application {
    private final static Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args){
        logger.info("Application Start...");
        SpringApplication.run(Application.class, args);
    }
}
