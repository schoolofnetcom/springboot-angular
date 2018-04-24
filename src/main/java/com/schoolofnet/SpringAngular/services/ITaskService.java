package com.schoolofnet.SpringAngular.services;

import java.util.List;
import java.util.Optional;

import com.schoolofnet.SpringAngular.entities.Task;

public interface ITaskService {

	List<Task> findAll();
	Optional<Task> findOne(Long id);
	Task create(Task task);
}
