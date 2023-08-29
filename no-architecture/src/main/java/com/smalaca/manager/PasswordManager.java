package com.smalaca.manager;

import com.smalaca.dto.PasswordDto;
import com.smalaca.embedded.Password;
import com.smalaca.entity.User;
import com.smalaca.repository.UserRepository;

import java.util.UUID;

public class PasswordManager {
    private final UserRepository userRepository;

    public PasswordManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void changePassword(UUID userId, PasswordDto passwordDto) {
        User user = userRepository.findById(userId);
        Password password = asPassword(passwordDto);
        user.change(password);
        userRepository.save(user);
    }

    private Password asPassword(PasswordDto passwordDto) {
        return null;
    }
}
