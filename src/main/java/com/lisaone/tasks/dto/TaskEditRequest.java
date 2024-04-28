package com.lisaone.tasks.dto;

import com.lisaone.tasks.entity.TaskStatus;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class TaskEditRequest {
    private String description;
    private OffsetDateTime dueDate;
    private TaskStatus status;
}
