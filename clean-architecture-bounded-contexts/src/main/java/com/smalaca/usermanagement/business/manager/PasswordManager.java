package com.smalaca.usermanagement.business.manager;

import com.smalaca.usermanagement.business.exception.PasswordException;
import com.smalaca.usermanagement.persistence.embedded.Password;
import com.smalaca.usermanagement.persistence.entity.User;
import com.smalaca.usermanagement.persistence.repository.UserRepository;

import java.util.UUID;

public class PasswordManager {
    private final UserRepository userRepository;

    public PasswordManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void changePassword(UUID userId, Password password) {
        if (userRepository.existsById(userId)) {
            User user = userRepository.findById(userId);
            user.change(password);
            userRepository.save(user);
        } else {
            throw new PasswordException();
        }
    }
}
