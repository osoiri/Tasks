package com.lisaone.tasks.mapper;

import com.lisaone.tasks.dto.TaskEditRequest;
import com.lisaone.tasks.dto.TaskRequest;
import com.lisaone.tasks.entity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE)
public abstract class TaskMapper{

    public abstract TaskRequest toTaskRequest(Task task);

    @Mapping(target = "id", ignore = true)
    public abstract Task toTask(TaskRequest taskRequest);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "name", ignore = true)
    @Mapping(target = "priority", ignore = true)
    public abstract void update(@MappingTarget Task task, TaskEditRequest taskEditRequest);
}
