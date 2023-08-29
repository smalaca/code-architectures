package com.smalaca.application.user;

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
