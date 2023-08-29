package com.smalaca.core.domainservice.notification;

import com.smalaca.core.domain.notification.MailMessage;

public interface MailClient {
    void send(MailMessage mailMessage);
}
