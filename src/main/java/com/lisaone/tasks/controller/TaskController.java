package com.lisaone.tasks.controller;

import com.lisaone.tasks.dto.TaskRequest;
import com.lisaone.tasks.exception.TaskServiceException;
import com.lisaone.tasks.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @PostMapping("/tasks")
    public ResponseEntity<String> createTask(@RequestBody TaskRequest request) throws TaskServiceException {
        return ResponseEntity.ok(taskService.createTask(request));
    }
}
