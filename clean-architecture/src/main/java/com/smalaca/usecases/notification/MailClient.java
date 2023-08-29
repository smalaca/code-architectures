package com.smalaca.usecases.notification;

import com.smalaca.entities.notification.MailMessage;

public interface MailClient {
    void send(MailMessage mailMessage);
}
