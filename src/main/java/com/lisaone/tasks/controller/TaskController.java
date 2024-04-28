package com.lisaone.tasks.controller;

import com.lisaone.tasks.dto.TaskEditRequest;
import com.lisaone.tasks.dto.TaskRequest;
import com.lisaone.tasks.exception.TaskServiceException;
import com.lisaone.tasks.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @PostMapping("/tasks")
    public ResponseEntity<String> createTask(@RequestBody TaskRequest request) throws TaskServiceException {
        return ResponseEntity.ok(taskService.createTask(request));
    }

    @PutMapping("/tasks/{id}")
    public ResponseEntity<String> updateTask(@PathVariable Long id, @RequestBody TaskEditRequest request) throws TaskServiceException {
        return ResponseEntity.ok(taskService.updateTask(id, request));
    }
}
