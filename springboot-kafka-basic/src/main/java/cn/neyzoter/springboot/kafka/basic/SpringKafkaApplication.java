package cn.neyzoter.springboot.kafka.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringKafkaApplication {
    public static void main(String args[]){
        SpringApplication.run(SpringKafkaApplication.class,args);
    }
}
