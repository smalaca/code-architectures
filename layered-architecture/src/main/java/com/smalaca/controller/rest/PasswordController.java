package com.smalaca.controller.rest;

import com.smalaca.business.manager.PasswordManager;
import com.smalaca.controller.dto.PasswordDto;
import com.smalaca.persistence.embedded.Password;

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
