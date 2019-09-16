package cn.neyzoter.springboot.mybatis.mysql.biz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Task jobs
 * @author Neyzoter Song
 * @data 19/9/16
 */
@Component("taskJob")
public class Taskjobs {
    private final static Logger logger = LoggerFactory.getLogger(Taskjobs.class);
    /**
     * save user info periodically
     */
    @Scheduled(cron="10/5 * * * * ?")
    public void saveUser(){

    }
}
