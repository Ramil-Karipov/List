package com.list.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class EmployeeServiceImpl extends EmployeeService {
    private final int STORAGE_SIZE = 5;
    private final List<Employee> employees = new ArrayList<>(List.of
            (new Employee("Новосельцев", " Виктор"),
                    new Employee(" Константинов", " Ефим"),
                    new Employee(" Копадзе", " Давид"),
                    new Employee(" Касьяненко", " Александр")
            ));

    @Override
    public void addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.size() >= STORAGE_SIZE) {
            throw new EmployeeStorageIsFullException("Список полностью заполнен");
        }
        if (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException("Сотрудник уже добавлен в список");
        }
        employees.add(employee);
    }

    @Override
    public void removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException("Удаляемый сотрудник не найден");
        }
        employees.remove(employee);
    }

    @Override
    public void findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException("Сотрудник не найден");
        }
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }
}





