package com.lisaone.tasks.exception;

import java.io.Serial;

public class BusinessException extends TaskServiceException {
    @Serial
    private static final long serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }
}
