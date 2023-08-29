package com.smalaca.controller;

import com.smalaca.dto.PasswordDto;
import com.smalaca.exception.PasswordException;
import com.smalaca.manager.PasswordManager;
import com.smalaca.repository.UserRepository;

import java.util.UUID;

public class PasswordController {
    private final UserRepository userRepository;
    private final PasswordManager passwordManager;

    public PasswordController(UserRepository userRepository, PasswordManager passwordManager) {
        this.userRepository = userRepository;
        this.passwordManager = passwordManager;
    }

    public void change(UUID userId, PasswordDto passwordDto) {
        if (userRepository.existsById(userId)) {
            passwordManager.changePassword(userId, passwordDto);
        } else {
            throw new PasswordException();
        }
    }
}
