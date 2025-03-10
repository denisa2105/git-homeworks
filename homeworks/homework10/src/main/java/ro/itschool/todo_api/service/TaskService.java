package ro.itschool.todo_api.service;

import org.springframework.stereotype.Service;
import ro.itschool.todo_api.model.Task;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private static final List<Task> TASKS = new ArrayList<>();

    public List<Task> gettAllTasks() {
        return TASKS;
    }

    public Task getTaskById(long id) {
        return TASKS.stream()
                .filter(i -> i.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void addTask(Task task) {
        TASKS.add(task);
    }

    public void deleteTaskById(long id) {
        TASKS.removeIf(i -> i.getId() == id);
    }

    public void updateTask(Task task, Task existingTask) {
        if (task.getDescription() != null) {
            existingTask.setDescription(task.getDescription());
        }

        if (task.getTitle() != null) {
            existingTask.setTitle(task.getTitle());
        }

        if (task.getStatus() != null); {
            existingTask.setStatus(task.getTitle());
        }
    }

    public void replaceTask(Task task, Task existingTask) {
        existingTask.setTitle(task.getTitle());
        existingTask.setDescription(task.getDescription());
        existingTask.setStatus(task.getStatus());
    }
}
