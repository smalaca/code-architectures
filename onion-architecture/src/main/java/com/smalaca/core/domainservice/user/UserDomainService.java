package com.smalaca.core.domainservice.user;

import com.smalaca.core.domain.user.User;

import java.util.UUID;

public class UserDomainService {
    private final UserRepository userRepository;

    public UserDomainService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        if (userRepository.existsByLogin(user.getLogin())) {
            throw new UserException();
        } else {
            userRepository.save(user);
        }
    }

    public void remove(UUID userId) {
        if (userRepository.existsById(userId)) {
            userRepository.remove(userId);
        } else {
            throw new UserException();
        }
    }

    public User findById(UUID userId) {
        if (userRepository.existsById(userId)) {
            return userRepository.findById(userId);
        } else {
            throw new UserException();
        }
    }
}
