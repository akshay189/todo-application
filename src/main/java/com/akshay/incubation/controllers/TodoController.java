package com.akshay.incubation.controllers;


import com.akshay.incubation.models.Todo;
import com.akshay.incubation.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TodoController {

    @Autowired
    @Qualifier(value = "todoDatabaseServiceImpl")
    private TodoService todoService;

    @GetMapping("/")
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable int id) {
        return todoService.getTodoById(id);
    }

    @PostMapping("/")
    public void addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);
        String str = new String();
        str.equals("");
    }

    @PutMapping("/{id}")
    public boolean updateTodo(@RequestBody Todo todo, @PathVariable int id) {
        return todoService.updateTodoItem(id, todo);
    }

    //richardson maturity principle
    //spring data, jpa
    //mysql - hibernate
    //update package name. //idempotent && diff b/w patch, put, post & what is options http call
    //option call http for cors and csrf.
    // executor service and immutable class
    //baeldung spring boot.
    @DeleteMapping("/{id}")
    public boolean deleteTodo(@PathVariable int id) {
        Map<String, String> mp = new HashMap<>();
        return todoService.deleteTodoById(id);
    }
}
