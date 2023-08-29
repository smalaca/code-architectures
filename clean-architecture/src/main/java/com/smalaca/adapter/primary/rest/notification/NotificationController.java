package com.smalaca.adapter.primary.rest.notification;

import com.smalaca.entities.notification.MailMessage;
import com.smalaca.usecases.notification.NotificationUseCases;
import com.smalaca.entities.notification.TextMessage;

public class NotificationController {
    private final NotificationUseCases notificationUseCases;

    public NotificationController(NotificationUseCases notificationUseCases) {
        this.notificationUseCases = notificationUseCases;
    }

    public void sendMail(MailDto mailDto) {
        MailMessage mailMessage = asMailMessage(mailDto);
        notificationUseCases.sendMail(mailMessage);
    }

    private MailMessage asMailMessage(MailDto mailDto) {
        return null;
    }

    public void sendTextMessage(TextMessageDto textMessageDto) {
        TextMessage textMessage = asTextMessage(textMessageDto);
        notificationUseCases.sendTextMessage(textMessage);
    }

    private TextMessage asTextMessage(TextMessageDto textMessageDto) {
        return null;
    }
}
