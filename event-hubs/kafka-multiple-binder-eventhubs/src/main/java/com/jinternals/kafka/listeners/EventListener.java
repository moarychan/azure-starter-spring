package com.jinternals.kafka.listeners;

import com.jinternals.kafka.config.AccountStreams;
import com.jinternals.kafka.config.OrderStreams;
import com.jinternals.kafka.events.AccountEvent;
import com.jinternals.kafka.events.OrderEvent;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EventListener {


    @StreamListener(value = AccountStreams.INPUT)
    public void handle(@Payload AccountEvent accountEvent) {
        System.out.println("Account Received: " + accountEvent);
    }


    @StreamListener(value = OrderStreams.INPUT )
    public void handle(@Payload OrderEvent demoEvent) {
        System.out.println("Order Received: " + demoEvent);
    }

}
