package ro.itschool.todo_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.itschool.todo_api.model.Task;
import ro.itschool.todo_api.service.TaskService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private static TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.gettAllTasks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable long id) {
        Task taskById = taskService.getTaskById(id);
        if (taskById == null) {
            return ResponseEntity.notFound().build();
        }

        return  ResponseEntity.ok(taskById);
    }

    @PostMapping
    public ResponseEntity<String> addLaptop(@RequestBody Task task){
        taskService.addTask(task);
        return ResponseEntity.status(HttpStatus.CREATED).body("Task added successfuly.");
    }



}
