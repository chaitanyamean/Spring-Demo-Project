package com.example.demo.controller;

import com.example.demo.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

//
//    @GetMapping(path = "/getsecret")
//    public String getMySecret() {
//        return "Secret Message: @#@#@#@";
//    }

    @GetMapping("/{employeeId}")
    public EmployeeDTO getEmployeeId(@PathVariable Long employeeId) {
        return new EmployeeDTO(employeeId, "Krishna", "krishna@gmail.com", 27, LocalDate.of(2024,1,2), true);
    }

    @GetMapping
    public String getAllEmployees(@RequestParam Integer age, @RequestParam String sortBy) {
        return "Hi Age" +age + " " + sortBy;
    }

    @PostMapping
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO inputEmployee) {
        inputEmployee.setId(100L);
        return inputEmployee;
    }

    @PutMapping
    public  String updateEmployeeById() {
        return "Hello from PUT";
    }

}
