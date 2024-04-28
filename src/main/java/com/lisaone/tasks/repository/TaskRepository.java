package com.lisaone.tasks.repository;

import com.lisaone.tasks.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
    @Override
    <S extends Task> S save(S entity);

    @Override
    Optional<Task> findById(Long id);
}
