package com.list.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public abstract class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/add")
    public Employee addEmployee(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName) {
        try {
            employeeService.addEmployee(firstName, lastName);
        } catch (EmployeeStorageIsFullException | EmployeeAlreadyAddedException e) {
            throw new RuntimeException();
        }
        return new Employee(firstName, lastName);
    }

    @GetMapping(path = "/remove")
    public Employee removeEmployee(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName) {
        try {
            employeeService.removeEmployee(firstName, lastName);
        } catch (EmployeeNotFoundException e) {
            throw new RuntimeException();
        }
        Employee employee = new Employee(firstName, lastName);
        return employee;
    }

    @GetMapping(path = "/find")

    public Employee findEmployee(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName) {
        try {
            employeeService.findEmployee(firstName, lastName);
        } catch (EmployeeNotFoundException e) {
            throw new RuntimeException();
        }
        return new Employee(firstName, lastName);

    }

    @GetMapping(path = "/print")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}

