package com.demo.controller;

import com.demo.service.TodoService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

  private TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping("")
  public String showLandingPage(Model model){
    model.addAttribute("todoList", todoService.getAllTodos());
    return "index";
  }
}
