package cn.neyzoter.springboot.rest.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Task jobs
 * @author Neyzoter Song
 * @data 19/9/15
 */
@Component("taskJob")
public class Taskjobs {
    private final static Logger logger = LoggerFactory.getLogger(Taskjobs.class);
    private int counter = 0;

    /**
     * post msg to InfluxDB periodically
     */
    @Scheduled(cron="10/5 * * * * ?")
    public void post2InfluxDb(){
        try{
            logger.info("Starting post : "+counter);

        }catch (Exception e){
            logger.error("",e);
        }
    }
}
