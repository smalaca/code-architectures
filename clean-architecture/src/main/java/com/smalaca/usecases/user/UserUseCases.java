package com.smalaca.usecases.user;

import com.smalaca.entities.user.Password;
import com.smalaca.entities.user.User;

import java.util.UUID;

public class UserUseCases {
    private final UserRepository userRepository;

    public UserUseCases(UserRepository userRepository) {
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
