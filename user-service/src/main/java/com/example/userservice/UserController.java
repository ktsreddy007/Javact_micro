package com.example.userservice;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/{id}")
    public Map<String, Object> getUser(@PathVariable int id) {
        return Map.of("id", id, "name", "Teja");
    }
}
