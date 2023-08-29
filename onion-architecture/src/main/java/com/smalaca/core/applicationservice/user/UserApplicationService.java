package com.smalaca.core.applicationservice.user;

import com.smalaca.core.domain.user.Password;
import com.smalaca.core.domain.user.User;
import com.smalaca.core.domainservice.user.PasswordDomainService;
import com.smalaca.core.domainservice.user.UserDomainService;

import java.util.UUID;

public class UserApplicationService {
    private final PasswordDomainService passwordDomainService;
    private final UserDomainService userDomainService;

    public UserApplicationService(PasswordDomainService passwordDomainService, UserDomainService userDomainService) {
        this.passwordDomainService = passwordDomainService;
        this.userDomainService = userDomainService;
    }

    public void add(UserDto userDto) {
        userDomainService.addUser(asUser(userDto));
    }

    private User asUser(UserDto userDto) {
        return null;
    }

    public void remove(UUID userId) {
        userDomainService.remove(userId);
    }

    public UserDto findById(UUID userId) {
        User user = userDomainService.findById(userId);
        return asUserDto(user);
    }

    private UserDto asUserDto(User user) {
        return null;
    }

    public void changePassword(UUID userId, PasswordDto passwordDto) {
        passwordDomainService.changePassword(userId, asPassword(passwordDto));
    }

    private Password asPassword(PasswordDto passwordDto) {
        return null;
    }
}
