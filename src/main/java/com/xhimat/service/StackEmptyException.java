package com.xhimat.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by chima on 1/13/17.
 *
 * This exception is thrown when ever stack service is empty
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class StackEmptyException extends RuntimeException {
    /**
     *
     * @param message
     */
    public StackEmptyException(String message) {
        super(message);
    }
    public StackEmptyException() {
        super();
    }
}
