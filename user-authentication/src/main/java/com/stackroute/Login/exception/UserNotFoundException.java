package com.stackroute.Login.exception;

public class UserNotFoundException extends Exception
{
    private String message;

    public UserNotFoundException()
    {}

    public UserNotFoundException(String message){
        this.message = message;
    }
}
