package com.smalaca.core.applicationservice.notification;

import com.smalaca.core.domain.notification.MailMessage;
import com.smalaca.core.domain.notification.TextMessage;
import com.smalaca.core.domainservice.notification.NotificationDomainService;

public class NotificationApplicationService {
    private final NotificationDomainService notificationDomainService;

    public NotificationApplicationService(NotificationDomainService notificationDomainService) {
        this.notificationDomainService = notificationDomainService;
    }

    public void sendMail(MailDto mailDto) {
        MailMessage mailMessage = asMailMessage(mailDto);
        notificationDomainService.sendMail(mailMessage);
    }

    private MailMessage asMailMessage(MailDto mailDto) {
        return null;
    }

    public void sendTextMessage(TextMessageDto textMessageDto) {
        TextMessage textMessage = asTextMessage(textMessageDto);
        notificationDomainService.sendTextMessage(textMessage);
    }

    private TextMessage asTextMessage(TextMessageDto textMessageDto) {
        return null;
    }
}
