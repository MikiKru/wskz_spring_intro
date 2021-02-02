package pl.wskz.spring_intro.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class Task {
    private String title;
    private LocalDateTime registrationTime;
    private TaskType taskType;
}
