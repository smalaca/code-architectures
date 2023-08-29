package com.smalaca.adapter.primary.rest.password;

import com.smalaca.entities.user.Password;
import com.smalaca.usecases.user.UserUseCases;

import java.util.UUID;

public class PasswordController {
    private final UserUseCases userUseCases;

    public PasswordController(UserUseCases userUseCases) {
        this.userUseCases = userUseCases;
    }

    public void change(UUID userId, PasswordDto passwordDto) {
        userUseCases.changePassword(userId, asPassword(passwordDto));
    }

    private Password asPassword(PasswordDto passwordDto) {
        return null;
    }
}
