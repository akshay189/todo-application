package com.akshay.incubation.services;

import com.akshay.incubation.dao.TodoRepository;
import com.akshay.incubation.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoDatabaseServiceImpl implements TodoService{

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @Override
    public Todo getTodoById(int id) {
        return todoRepository.getById(id);
    }

    @Override
    public void addTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public boolean updateTodoItem(int id, Todo todo) {
        deleteTodoById(id);
        Todo newTodo = todoRepository.save(todo);
        return newTodo != null;
    }

    @Override
    public boolean deleteTodoById(int id) {
        todoRepository.deleteById(id);
        return true;
    }
}
