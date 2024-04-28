package com.lisaone.tasks.utility;

import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
public class BusinessDateUtils {
    public boolean isDateInPast(final OffsetDateTime dueDate) {
        return dueDate.isBefore(OffsetDateTime.now());
    }
}
