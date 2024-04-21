package com.lisaone.tasks.exception;

import java.io.Serial;

public class TaskServiceException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public TaskServiceException(String message) {
        super(message);
    }
}
