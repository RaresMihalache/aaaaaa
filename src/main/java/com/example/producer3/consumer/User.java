package com.example.producer3.consumer;

import com.example.producer3.config.MessagingConfig;
import com.example.producer3.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message received from queue: " + orderStatus);
    }
}
