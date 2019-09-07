package cn.neyzoter.springboot.kafka.basic.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListenerImpl {
    private final static Logger logger = LoggerFactory.getLogger(KafkaListenerImpl.class);
    @KafkaListener(topics = "myTopic")
    public void processMsg(String content){
        logger.info("Processing Kafka msg : " + content);
    }
}
