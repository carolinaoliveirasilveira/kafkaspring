package com.kafkaspring;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "ecommerce.cliente2", groupId = "ecommerce-groupId")
    public void listen(String message) {
        System.out.println("Mensagem recebida: " + message);
    }
}
