package com.smalaca.application.notification;

public class NotificationService {
    private final MailClient mailClient;
    private final SmsGateway smsGateway;

    public NotificationService(MailClient mailClient, SmsGateway smsGateway) {
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
