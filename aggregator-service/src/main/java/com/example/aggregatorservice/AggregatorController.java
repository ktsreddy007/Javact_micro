package com.example.aggregatorservice;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import java.util.*;

@RestController
@RequestMapping("/welcome")
public class AggregatorController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public Map<String, Object> welcome(@PathVariable int userId) {
        Map<String, Object> response = new HashMap<>();
        try {
            System.out.println("Calling user-service...");
            Map<String, Object> user = restTemplate.getForObject(
                "http://user-service:8080/user/" + userId, Map.class);
            System.out.println("User service response: " + user);

            String name = (String) user.get("name");

            System.out.println("Calling greeting-service...");
            Map<String, String> greeting = restTemplate.getForObject(
                "http://greeting-service:8080/greet?name=" + name, Map.class);
            System.out.println("Greeting service response: " + greeting);

            response.putAll(user);
            response.putAll(greeting);

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
            response.put("error", e.getMessage());
        }

        return response;
    }
}