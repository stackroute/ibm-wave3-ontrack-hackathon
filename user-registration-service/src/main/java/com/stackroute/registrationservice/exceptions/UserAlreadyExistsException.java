package com.stackroute.registrationservice.exceptions;

public class UserAlreadyExistsException extends Exception
{
    private String message;

    public UserAlreadyExistsException(String message)
    {
        super(message);
        this.message = message;
    }

    public UserAlreadyExistsException()
    {
        super();
    }
}
