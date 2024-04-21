package com.lisaone.tasks.exception;

import java.io.Serial;

public class UtilityException extends TaskServiceException {
    @Serial
    private static final long serialVersionUID = 1L;

    public UtilityException(String message) {
        super(message);
    }
}
