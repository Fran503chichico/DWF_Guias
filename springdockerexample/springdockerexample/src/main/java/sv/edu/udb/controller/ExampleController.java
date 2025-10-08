package sv.edu.udb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @GetMapping("/example")
    public String exampleEndpoint() {
        return "Hello World from Spring Boot and Docker!";
    }
}
