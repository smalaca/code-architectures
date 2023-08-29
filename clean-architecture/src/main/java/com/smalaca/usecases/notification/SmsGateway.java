package com.smalaca.usecases.notification;

import com.smalaca.entities.notification.TextMessage;

public interface SmsGateway {
    void send(TextMessage textMessage);
}
