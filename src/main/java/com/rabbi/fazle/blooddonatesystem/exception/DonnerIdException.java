package com.rabbi.fazle.blooddonatesystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DonnerIdException extends RuntimeException{
    public DonnerIdException(String massage){
        super(massage);
    }
}

