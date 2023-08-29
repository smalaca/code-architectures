package com.smalaca.persistence.entity;

import com.smalaca.persistence.embedded.Password;

public class User {
    private final String login;

    public User(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void change(Password password) {

    }
}
