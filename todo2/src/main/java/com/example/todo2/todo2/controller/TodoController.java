package com.example.todo2.todo2.controller;

import com.example.todo2.todo2.model.Todo;
import com.example.todo2.todo2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;


    @GetMapping
    public List<Todo> todoList(){
        return todoRepository.findAll();
    }

    @PostMapping
    public Todo addTarefa(@RequestBody Todo todo){
        return todoRepository.save(todo);
    }

}
