package com.smalaca.usecases.user;

import com.smalaca.entities.user.User;

import java.util.UUID;

public interface UserRepository {
    boolean existsByLogin(String login);

    void save(User user);

    void remove(UUID userId);

    boolean existsById(UUID userId);

    User findById(UUID userId);
}
