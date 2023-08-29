package com.smalaca.usermanagement.business.service;

import com.smalaca.usermanagement.business.exception.UserException;
import com.smalaca.usermanagement.persistence.entity.User;
import com.smalaca.usermanagement.persistence.repository.UserRepository;

import java.util.UUID;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
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
