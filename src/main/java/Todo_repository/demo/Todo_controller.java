package Todo_repository.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Todo_controller
{
    @GetMapping("/")
    public String HelloWorld()
    {
        return "To-do Application";
    }
}
