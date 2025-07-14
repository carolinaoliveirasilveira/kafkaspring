package com.kafkaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/producer")
    public ResponseEntity<String> producer(@RequestBody String message) {
        kafkaTemplate.send("ecommerce.cliente2", message);
        return ResponseEntity.ok("Mensagem enviada ao tópico ecommerce.cliente2");
    }

}

