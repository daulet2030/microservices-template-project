package io.daulet2030.employee.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    Environment environment;

    @GetMapping("/port")
    public String getPort() {
        return "I am an employee service running on port " + environment.getProperty("local.server.port");
    }
}
