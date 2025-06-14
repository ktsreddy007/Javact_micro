package com.example.greetingservice;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/greet")
public class GreetingController {
    @GetMapping
    public Map<String, String> greet(@RequestParam String name) {
        return Map.of("greeting", "Hello, " + name + "!");
    }
}
