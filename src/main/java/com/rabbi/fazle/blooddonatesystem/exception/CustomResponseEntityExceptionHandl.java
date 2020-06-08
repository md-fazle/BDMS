package com.rabbi.fazle.blooddonatesystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandl {
      @ExceptionHandler
    public final ResponseEntity<Object> handleDonnerIdException(DonnerIdException e, WebRequest request) {
        DonnerIdExceptionResponse donnerIdExceptionResponse = new DonnerIdExceptionResponse(e.getMessage());
        return new ResponseEntity(donnerIdExceptionResponse, HttpStatus.BAD_REQUEST);
    }
}