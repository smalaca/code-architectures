package com.smalaca.adapter.primary.rest.user;

import com.smalaca.application.user.User;
import com.smalaca.application.user.UserService;

import java.util.UUID;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void add(UserDto userDto) {
        userService.addUser(asUser(userDto));
    }

    private User asUser(UserDto userDto) {
        return null;
    }

    public void remove(UUID userId) {
        userService.remove(userId);
    }

    public UserDto findById(UUID userId) {
        User user = userService.findById(userId);
        return asUserDto(user);
    }

    private UserDto asUserDto(User user) {
        return null;
    }
}
