package com.smalaca.persistence.repository;

import com.smalaca.persistence.entity.User;

import java.util.UUID;

public class UserRepository {
    public boolean existsByLogin(String login) {
        return false;
    }

    public void save(User user) {

    }

    public void remove(UUID userId) {

    }

    public boolean existsById(UUID userId) {
        return false;
    }

    public User findById(UUID userId) {
        return null;
    }
}
