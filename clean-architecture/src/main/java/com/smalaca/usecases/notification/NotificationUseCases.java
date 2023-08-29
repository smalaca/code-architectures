package com.smalaca.usecases.notification;

import com.smalaca.entities.notification.MailMessage;
import com.smalaca.entities.notification.TextMessage;

public class NotificationUseCases {
    private final MailClient mailClient;
    private final SmsGateway smsGateway;

    public NotificationUseCases(MailClient mailClient, SmsGateway smsGateway) {
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
