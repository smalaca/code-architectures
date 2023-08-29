package com.smalaca.service;

import com.smalaca.dto.UserDto;
import com.smalaca.entity.User;
import com.smalaca.repository.UserRepository;

import java.util.UUID;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(UserDto userDto) {
        User user = asUser(userDto);
        userRepository.save(user);
    }

    private User asUser(UserDto userDto) {
        return null;
    }

    public UserDto findById(UUID userId) {
        User user = userRepository.findById(userId);
        return asUserDto(user);
    }

    private UserDto asUserDto(User user) {
        return null;
    }
}
