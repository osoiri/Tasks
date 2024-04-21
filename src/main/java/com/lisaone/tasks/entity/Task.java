package com.lisaone.tasks.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.OffsetDateTime;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private OffsetDateTime dueDate;
    private Integer priority;
    @Enumerated(jakarta.persistence.EnumType.STRING)
    private TaskStatus status;
}
