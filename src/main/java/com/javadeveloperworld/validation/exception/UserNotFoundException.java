package com.javadeveloperworld.validation.exception;

import com.javadeveloperworld.validation.entity.User;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String s) {
        super(s);
    }
}
