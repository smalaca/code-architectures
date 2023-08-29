package com.smalaca.adapter.primary.rest.password;

import com.smalaca.application.user.Password;
import com.smalaca.application.user.PasswordManager;

import java.util.UUID;

public class PasswordController {
    private final PasswordManager passwordManager;

    public PasswordController(PasswordManager passwordManager) {
        this.passwordManager = passwordManager;
    }

    public void change(UUID userId, PasswordDto passwordDto) {
        passwordManager.changePassword(userId, asPassword(passwordDto));
    }

    private Password asPassword(PasswordDto passwordDto) {
        return null;
    }
}
