package com.smalaca.core.domainservice.user;

import com.smalaca.core.domain.user.Password;
import com.smalaca.core.domain.user.User;

import java.util.UUID;

public class PasswordDomainService {
    private final UserRepository userRepository;

    public PasswordDomainService(UserRepository userRepository) {
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
