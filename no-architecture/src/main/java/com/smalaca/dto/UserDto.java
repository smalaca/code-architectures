package com.smalaca.dto;

public class UserDto {
    private final String login;

    public UserDto(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
