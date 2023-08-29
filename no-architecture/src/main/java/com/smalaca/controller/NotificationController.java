package com.smalaca.controller;

import com.smalaca.client.MailClient;
import com.smalaca.dto.MailDto;
import com.smalaca.dto.TextMessageDto;
import com.smalaca.gateway.SmsGateway;
import com.smalaca.message.MailMessage;
import com.smalaca.message.TextMessage;

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
