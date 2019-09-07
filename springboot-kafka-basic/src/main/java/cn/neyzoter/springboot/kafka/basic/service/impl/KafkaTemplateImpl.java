package cn.neyzoter.springboot.kafka.basic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaTemplateImpl {
    private final KafkaTemplate kafkaTemplate;
    @Autowired
    public KafkaTemplateImpl(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

}
