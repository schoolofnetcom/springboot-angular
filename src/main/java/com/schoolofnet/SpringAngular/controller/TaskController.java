package com.schoolofnet.SpringAngular.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.schoolofnet.SpringAngular.entities.Task;
import com.schoolofnet.SpringAngular.services.ITaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

	@Autowired
	private ITaskService taskService;
	
	public TaskController(ITaskService taskService) {
		this.taskService = taskService;
	}
	
	@GetMapping
	public List<Task> findAll() {
		return this.taskService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Task> findOne(@PathVariable("id") Long id) {
		return this.taskService.findOne(id);
	}
	
	@PostMapping
	@ResponseBody
	public Task create(@RequestBody Task task) {
		return this.taskService.create(task);
	}
}
