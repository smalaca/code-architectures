package com.smalaca.usermanagement.controller.rest;

import com.smalaca.usermanagement.business.manager.PasswordManager;
import com.smalaca.usermanagement.controller.dto.PasswordDto;
import com.smalaca.usermanagement.persistence.embedded.Password;

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
