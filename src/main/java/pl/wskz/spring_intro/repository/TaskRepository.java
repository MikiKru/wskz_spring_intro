package pl.wskz.spring_intro.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pl.wskz.spring_intro.model.Task;
import pl.wskz.spring_intro.model.TaskType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component     // specyficzny interfejs do komunikacji z warstwą danych
public class TaskRepository {
    public List<Task> tasks = new ArrayList<>(Arrays.asList(
            new Task("Nauka Java",
                    LocalDateTime.of(2020, 12,12, 10,10),
                    TaskType.LEARNING),
            new Task("Nauka Spring",
                    LocalDateTime.of(2021, 1,12, 10,10),
                    TaskType.IMPLEMENTATION),
            new Task("Projekt Spring",
                    LocalDateTime.of(2021, 2,2, 10,10),
                    TaskType.IMPLEMENTATION),
            new Task("Publikacja projektu GITHUB",
                    LocalDateTime.of(2021, 2,10, 10,10),
                    TaskType.DEPOLOY)
    ));
}
