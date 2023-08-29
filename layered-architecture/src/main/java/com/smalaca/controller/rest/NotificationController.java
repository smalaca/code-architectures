package com.smalaca.controller.rest;

import com.smalaca.output.client.MailClient;
import com.smalaca.output.gateway.SmsGateway;
import com.smalaca.output.message.MailMessage;
import com.smalaca.output.message.TextMessage;
import com.smalaca.controller.dto.MailDto;
import com.smalaca.controller.dto.TextMessageDto;

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
