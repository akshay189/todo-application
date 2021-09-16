package com.akshay.incubation.services;

import com.akshay.incubation.models.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TodoServiceImpl implements TodoService {

    private List<Todo> todoList = new ArrayList<>();

    @Override
    public List<Todo> getAllTodos() {
        return todoList;
    }

    @Override
    public Todo getTodoById(int id) {
        for(Todo todo : todoList) {
            if(id == todo.getId()) {
                return todo;
            }
        }
        return null;
    }

    @Override
    public void addTodo(Todo todo) {
        if (todo != null) {
            todoList.add(todo);
        }
    }

    @Override
    public boolean updateTodoItem(int id, Todo todo) {
        boolean deleteOp = deleteTodoById(id);
        if(deleteOp) {
            addTodo(todo);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteTodoById(int id) {
        Todo todoItem = getTodoById(id);
        if(todoItem != null) {
            todoList.remove(todoItem);
            return true;
        }
        return false;
    }
}
