package com.smalaca.core.domainservice.notification;

import com.smalaca.core.domain.notification.MailMessage;
import com.smalaca.core.domain.notification.TextMessage;

public class NotificationDomainService {
    private final MailClient mailClient;
    private final SmsGateway smsGateway;

    public NotificationDomainService(MailClient mailClient, SmsGateway smsGateway) {
        this.mailClient = mailClient;
        this.smsGateway = smsGateway;
    }

    public void sendMail(MailMessage mailMessage) {
        mailClient.send(mailMessage);
    }

    public void sendTextMessage(TextMessage textMessage) {
        smsGateway.send(textMessage);
    }
}
