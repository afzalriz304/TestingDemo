package org.example.Service;

import org.example.model.Employee;

import java.util.List;

// CRUD operation for Employee
// 100% abstraction
public interface EmployeeService {
    // add
    boolean addEmployee(Employee employee, List<Employee> employeeList);

    // delete
    List<Employee> deleteEmployee(String name, List<Employee> employeeList);

    // update
    Employee updateEmployee(Employee employee, List<Employee> employeeList);

    // retrieve
    Employee getEmployee(String name, List<Employee> employeeList);

    List<Employee> getAllEmployee();
}
