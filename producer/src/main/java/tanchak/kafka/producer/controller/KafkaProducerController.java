package tanchak.kafka.producer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tanchak.kafka.producer.service.KafkaProducerService;

@RestController
@RequestMapping("/api/producer")
@RequiredArgsConstructor
public class KafkaProducerController {

    private final KafkaProducerService kafkaProducerService;

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestParam String topic, @RequestParam String message) {
        kafkaProducerService.sendMessage(topic, message);
        return ResponseEntity.ok("Message was sent to Kafka with REST: " + message);
    }
}
