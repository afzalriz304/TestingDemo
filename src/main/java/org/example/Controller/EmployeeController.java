package org.example.Controller;

import org.example.Service.EmployeeService;
import org.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String index() {
        return "Working";
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployee();
    }
}
