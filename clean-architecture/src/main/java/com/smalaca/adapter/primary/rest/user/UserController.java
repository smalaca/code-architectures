package com.smalaca.adapter.primary.rest.user;

import com.smalaca.entities.user.User;
import com.smalaca.usecases.user.UserUseCases;

import java.util.UUID;

public class UserController {
    private final UserUseCases userUseCases;

    public UserController(UserUseCases userUseCases) {
        this.userUseCases = userUseCases;
    }

    public void add(UserDto userDto) {
        userUseCases.addUser(asUser(userDto));
    }

    private User asUser(UserDto userDto) {
        return null;
    }

    public void remove(UUID userId) {
        userUseCases.remove(userId);
    }

    public UserDto findById(UUID userId) {
        User user = userUseCases.findById(userId);
        return asUserDto(user);
    }

    private UserDto asUserDto(User user) {
        return null;
    }
}
