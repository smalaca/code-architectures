package com.smalaca.adapter.primary.rest.password;

import com.smalaca.core.applicationservice.user.PasswordDto;
import com.smalaca.core.applicationservice.user.UserApplicationService;

import java.util.UUID;

public class PasswordController {
    private final UserApplicationService userApplicationService;

    public PasswordController(UserApplicationService userApplicationService) {
        this.userApplicationService = userApplicationService;
    }

    public void change(UUID userId, PasswordDto passwordDto) {
        userApplicationService.changePassword(userId, passwordDto);
    }
}
