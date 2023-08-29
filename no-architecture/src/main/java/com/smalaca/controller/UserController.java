package com.smalaca.controller;

import com.smalaca.dto.UserDto;
import com.smalaca.exception.UserException;
import com.smalaca.repository.UserRepository;
import com.smalaca.service.UserService;

import java.util.UUID;

public class UserController {
    private final UserRepository userRepository;
    private final UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    public void add(UserDto userDto) {
        if (userRepository.existsByLogin(userDto.getLogin())) {
            throw new UserException();
        } else {
            userService.addUser(userDto);
        }
    }

    public void remove(UUID userId) {
        if (userRepository.existsById(userId)) {
            userRepository.remove(userId);
        } else {
            throw new UserException();
        }
    }

    public UserDto findById(UUID userId) {
        if (userRepository.existsById(userId)) {
            return userService.findById(userId);
        } else {
            throw new UserException();
        }
    }
}
