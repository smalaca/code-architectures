package com.smalaca.application.notification;

public interface SmsGateway {
    void send(TextMessage textMessage);
}
