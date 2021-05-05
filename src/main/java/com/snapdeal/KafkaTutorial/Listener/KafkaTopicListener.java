package com.snapdeal.KafkaTutorial.Listener;

import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;

@Service
public class KafkaTopicListener {

    @KafkaListener(topics= "Kafka_Example", groupId = "group_id")
    public void getMessage(String message) {
        System.out.println("Consumed Message : " + message);
    }
}
