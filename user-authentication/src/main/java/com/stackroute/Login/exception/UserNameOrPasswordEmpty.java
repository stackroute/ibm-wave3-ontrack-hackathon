package com.stackroute.Login.exception;

public class UserNameOrPasswordEmpty extends Exception {

    private String message;

    public UserNameOrPasswordEmpty()
    {}

    public UserNameOrPasswordEmpty(String message)
    {
        this.message=message;
    }
}
