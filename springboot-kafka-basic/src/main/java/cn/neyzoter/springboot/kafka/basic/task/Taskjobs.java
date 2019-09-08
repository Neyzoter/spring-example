package cn.neyzoter.springboot.kafka.basic.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * Task jobs
 * @author Neyzoter Song
 * @data 19/9/7
 */
@Component("taskJob")
public class Taskjobs {
    private final static Logger logger = LoggerFactory.getLogger(Taskjobs.class);
    public static Integer counter = 0;
    @Autowired
    private KafkaTemplate kafkaTemplate;

    /**
     * send msg periodically
     */
    @Scheduled(cron="10/5 * * * * ?")
    public void sendKafkaMsg(){
        try{
            logger.info("Starting send Kafka msg : "+counter);
            kafkaTemplate.send("myTopic",counter.toString());
            if(counter++>10000){
                counter = 0;
            }
        }catch (Exception e){
            logger.error("",e);
        }
    }
}
