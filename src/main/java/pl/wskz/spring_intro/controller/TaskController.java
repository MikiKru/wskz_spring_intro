package pl.wskz.spring_intro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wskz.spring_intro.service.TaskService;

@Controller     // klasa specyficzna do mapowania żądań http
public class TaskController {
    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @ResponseBody
    @GetMapping("/")                // adres: localhost:8080/
    public String home(){           // wywołanie
        return taskService.textToUpperCase("Hello Spring!");     // działanie: widok html
    }
}
