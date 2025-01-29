package com.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

  
   @KafkaListener(topics = "NewTopic", groupId = "test-group")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}