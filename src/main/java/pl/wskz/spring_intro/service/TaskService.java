package pl.wskz.spring_intro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wskz.spring_intro.repository.TaskRepository;

import java.util.stream.Collectors;

@Service        // klasa specyficzna dostarczająca logikę biznesową
public class TaskService {
    private TaskRepository taskRepository;
    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public String textToUpperCase(String text){
        return text.toUpperCase();
    }
    public String publishAllTasks(){
        return taskRepository.tasks.stream()
                .map(task -> String.format("Tytuł: %50s Data publikacji: %20s Typ: %15s",
                        task.getTitle(),task.getRegistrationTime(), task.getTaskType()
                ))
                .collect(Collectors.joining("\n"));
    }
}
