package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final Producer producer;

    @Autowired
    public TestController(Producer producer) {
        this.producer = producer;
    }
    @GetMapping("/publish")
    public void messageToTopic(@RequestParam("message") String message){

    	
    	//1)Send it to kafka producer({userid:message})(ASYNC)
    	//2)STORE CHATS IN DB(ASYNC)
    	//3)First 
    	
    	
    	
    	
    	
    	
        this.producer.sendMessage(message);


    }
}