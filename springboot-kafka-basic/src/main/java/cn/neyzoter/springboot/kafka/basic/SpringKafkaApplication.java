package cn.neyzoter.springboot.kafka.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Spring kafka application
 * @author Neyzoter Song
 * @date 2019/9/6
 */
@SpringBootApplication
@EnableScheduling
public class SpringKafkaApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringKafkaApplication.class,args);
    }
}
