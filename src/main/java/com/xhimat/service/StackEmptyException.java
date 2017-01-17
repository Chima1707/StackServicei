package com.xhimat.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by chima on 1/13/17.
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class StackEmptyException extends RuntimeException {
    public StackEmptyException(String message) {
        super(message);
    }
    public StackEmptyException() {
        super();
    }
}
