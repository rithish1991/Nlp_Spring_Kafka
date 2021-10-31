package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "topic_rithish1991",groupId = "group_id")
    public void consumeMessage(String message){

        System.out.println("Message From consumer from consumer"+message);
    }
}
