package com.smalaca.adapter.secondary.repository.user;

import com.smalaca.application.user.User;
import com.smalaca.application.user.UserRepository;

import java.util.UUID;

public class FakeUserRepository implements UserRepository {
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
