package com.smalaca.adapter.primary.rest.user;

import com.smalaca.core.applicationservice.user.UserApplicationService;
import com.smalaca.core.applicationservice.user.UserDto;

import java.util.UUID;

public class UserController {
    private final UserApplicationService userApplicationService;

    public UserController(UserApplicationService userApplicationService) {
        this.userApplicationService = userApplicationService;
    }

    public void add(UserDto userDto) {
        userApplicationService.add(userDto);
    }

    public void remove(UUID userId) {
        userApplicationService.remove(userId);
    }

    public UserDto findById(UUID userId) {
        return userApplicationService.findById(userId);
    }
}
