package com.smalaca.core.domainservice.notification;

import com.smalaca.core.domain.notification.TextMessage;

public interface SmsGateway {
    void send(TextMessage textMessage);
}
