package com.schoolofnet.SpringAngular.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	@Column
	private String name;
	@Column
	private Boolean done;
	
	public Task() {
		
	}
	
	public Task(Long id, String name, Boolean done) {
		this.setId(id);
		this.setName(name);
		this.setDone(done);
	}
	
	public Task(String name, Boolean done) {
		this.setName(name);
		this.setDone(done);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getDone() {
		return done;
	}

	public void setDone(Boolean done) {
		this.done = done;
	}
}
