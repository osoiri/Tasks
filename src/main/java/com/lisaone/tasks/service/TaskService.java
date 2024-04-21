package com.lisaone.tasks.service;

import com.lisaone.tasks.dto.TaskRequest;
import com.lisaone.tasks.entity.Task;
import com.lisaone.tasks.mapper.TaskMapper;
import com.lisaone.tasks.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    public String createTask(TaskRequest taskRequest) {
        if (taskRequest.getDueDate() == null) {
            taskRequest.setDueDate(OffsetDateTime.now());
        }
        Task task = taskMapper.toTask(taskRequest);
        taskRepository.save(task);
        return "Task created";
    }
}
