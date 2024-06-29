package com.learning.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

public class ToDo {

	private int id;

	private String username;

	@Size(min=10, message="Enter atleast 10 characters")
	private String description;

	private boolean done;

	private LocalDate targetDate;

	public ToDo(int id, String username, String description, boolean done, LocalDate targetDate) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.done = done;
		this.targetDate = targetDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Size(min=10, message="Enter atleast 10 characters")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", username=" + username + ", description=" + description + ", done=" + done
				+ ", targetDate=" + targetDate + "]";
	}

}
