package com.lisaone.tasks.service;

import com.lisaone.tasks.dto.TaskEditRequest;
import com.lisaone.tasks.dto.TaskRequest;
import com.lisaone.tasks.entity.Task;
import com.lisaone.tasks.exception.BusinessException;
import com.lisaone.tasks.mapper.TaskMapper;
import com.lisaone.tasks.repository.TaskRepository;
import com.lisaone.tasks.utility.BusinessDateUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;
    private final BusinessDateUtils dateUtils;
    private final TaskMapper taskMapper;

    public String createTask(final TaskRequest taskRequest) throws BusinessException {
        if (taskRequest.getDueDate() == null) {
            taskRequest.setDueDate(OffsetDateTime.now());
        } else if (dateUtils.isDateInPast(taskRequest.getDueDate())) {
            throw new BusinessException("Due date cannot be in the past");
        }
        final Task task = taskMapper.toTask(taskRequest);
        taskRepository.save(task);
        return "Task created";
    }

    public String updateTask(final Long id, final TaskEditRequest request) throws BusinessException {
        final Task task = taskRepository.findById(id).orElseThrow(() -> new BusinessException("Task not found"));
        if (request.getDueDate() != null && dateUtils.isDateInPast(request.getDueDate())) {
            throw new BusinessException("Due date cannot be in the past");
        }
        taskMapper.update(task, request);
        taskRepository.save(task);
        return "Task updated";
    }
}
