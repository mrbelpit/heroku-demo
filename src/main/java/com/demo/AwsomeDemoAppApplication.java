package com.demo;

import com.demo.model.Todo;
import com.demo.repo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsomeDemoAppApplication implements CommandLineRunner {

  private TodoRepository todoRepository;

  @Autowired
  public AwsomeDemoAppApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(AwsomeDemoAppApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("todo 1"));
    todoRepository.save(new Todo("todo 2"));
    todoRepository.save(new Todo("todo 3"));
    todoRepository.save(new Todo("todo 4"));
    todoRepository.save(new Todo("todo 5"));

  }
}
