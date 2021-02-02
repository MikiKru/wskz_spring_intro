package pl.wskz.spring_intro.service;

import org.springframework.stereotype.Service;

@Service        // klasa specyficzna dostarczająca logikę biznesową
public class TaskService {
    public String textToUpperCase(String text){
        return text.toUpperCase();
    }
}
