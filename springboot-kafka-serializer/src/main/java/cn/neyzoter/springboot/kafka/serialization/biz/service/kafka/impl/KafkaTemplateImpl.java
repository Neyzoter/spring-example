package cn.neyzoter.springboot.kafka.serialization.biz.service.kafka.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * Kafka template implement
 * @author Neyzoter Song
 * @date 2019/9/6
 */
@Component
public class KafkaTemplateImpl {
    private final KafkaTemplate kafkaTemplate;
    @Autowired
    public KafkaTemplateImpl(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

}
