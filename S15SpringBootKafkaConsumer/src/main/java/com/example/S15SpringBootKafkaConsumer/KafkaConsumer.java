package com.example.S15SpringBootKafkaConsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	
	@KafkaListener(topics="my-first-kafka-topic" , groupId = "group_id")
	public void consume(String message) {
		System.out.println("Message: "+message);
	}
}
