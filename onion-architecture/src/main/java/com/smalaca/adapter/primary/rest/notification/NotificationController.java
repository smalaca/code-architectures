package com.smalaca.adapter.primary.rest.notification;

import com.smalaca.core.applicationservice.notification.MailDto;
import com.smalaca.core.applicationservice.notification.NotificationApplicationService;
import com.smalaca.core.applicationservice.notification.TextMessageDto;

public class NotificationController {
    private final NotificationApplicationService notificationApplicationService;

    public NotificationController(NotificationApplicationService notificationApplicationService) {
        this.notificationApplicationService = notificationApplicationService;
    }

    public void sendMail(MailDto mailDto) {
        notificationApplicationService.sendMail(mailDto);
    }

    public void sendTextMessage(TextMessageDto textMessageDto) {
        notificationApplicationService.sendTextMessage(textMessageDto);
    }
}
