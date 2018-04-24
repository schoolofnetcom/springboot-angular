package com.schoolofnet.SpringAngular.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolofnet.SpringAngular.entities.Task;
import com.schoolofnet.SpringAngular.repository.TaskRepository;

@Service
public class TaskService implements ITaskService {

	@Autowired
	private TaskRepository taskRepository;
	
	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	@Override
	public List<Task> findAll() {
		return this.taskRepository.findAll();
	}

	@Override
	public Task create(Task task) {
		return this.taskRepository.save(task);
	}

	@Override
	public Optional<Task> findOne(Long id) {
		return this.taskRepository.findById(id);
	}

}
