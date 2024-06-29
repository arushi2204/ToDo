package com.learning.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class ToDoService {

	private static List<ToDo> todos = new ArrayList();
	
	private static int todosCount = 0;
	
	static {
		todos.add(new ToDo(++todosCount, "Arushi", "Learn DSA", false, LocalDate.now().plusMonths(2)));
		todos.add(new ToDo(++todosCount, "Arushi", "Learn DevOps", false, LocalDate.now().plusMonths(2)));
		todos.add(new ToDo(++todosCount, "Arushi", "Learn FullStack", false, LocalDate.now().plusMonths(2)));
	}
	
	public List<ToDo> findByUserName(String username){
		return todos;
	}
	
	public void addToDo(String username, String description, LocalDate targetDate, boolean isDone) {
		ToDo todo = new ToDo(++todosCount, username, description, isDone, targetDate);
		todos.add(todo);
	}
	
	public void deleteById(int id) {
		Predicate<? super ToDo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}

	public ToDo findById(int id) {
		Predicate<? super ToDo> predicate = todo -> todo.getId() == id;
		return todos.stream().filter(predicate).findFirst().get();
	}

	public void updateTodo(@Valid ToDo todo) {
		deleteById(todo.getId());
		todos.add(todo);
	}
}
