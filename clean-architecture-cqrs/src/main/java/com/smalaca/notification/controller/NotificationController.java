package com.smalaca.notification.controller;

import com.smalaca.notification.client.MailClient;
import com.smalaca.notification.dto.MailDto;
import com.smalaca.notification.dto.TextMessageDto;
import com.smalaca.notification.gateway.SmsGateway;
import com.smalaca.notification.message.MailMessage;
import com.smalaca.notification.message.TextMessage;

public class NotificationController {
    private final MailClient mailClient;
    private final SmsGateway smsGateway;

    public NotificationController(MailClient mailClient, SmsGateway smsGateway) {
        this.mailClient = mailClient;
        this.smsGateway = smsGateway;
    }

    public void sendMail(MailDto mailDto) {
        MailMessage mailMessage = asMailMessage(mailDto);
        mailClient.send(mailMessage);
    }

    private MailMessage asMailMessage(MailDto mailDto) {
        return null;
    }

    public void sendTextMessage(TextMessageDto textMessageDto) {
        TextMessage textMessage = asTextMessage(textMessageDto);
        smsGateway.send(textMessage);
    }

    private TextMessage asTextMessage(TextMessageDto textMessageDto) {
        return null;
    }
}
