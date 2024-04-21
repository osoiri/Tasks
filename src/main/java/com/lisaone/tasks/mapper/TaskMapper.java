package com.lisaone.tasks.mapper;

import com.lisaone.tasks.dto.TaskRequest;
import com.lisaone.tasks.entity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class TaskMapper{

    public abstract TaskRequest toTaskRequest(Task task);

    @Mapping(target = "id", ignore = true)
    public abstract Task toTask(TaskRequest taskRequest);
}
