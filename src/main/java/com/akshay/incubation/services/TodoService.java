package com.akshay.incubation.services;

import com.akshay.incubation.models.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAllTodos();
    Todo getTodoById(int id);
    void addTodo(Todo todo);
    boolean updateTodoItem(int id, Todo todo);
    boolean deleteTodoById(int id);
}
