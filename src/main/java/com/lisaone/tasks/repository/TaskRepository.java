package com.lisaone.tasks.repository;

import com.lisaone.tasks.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
    @Override
    public <S extends Task> S save(S entity);
}
