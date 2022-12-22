package org.example.ServiceImpl;

import org.example.Service.EmployeeService;
import org.example.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    public static List<Employee> List = Arrays.asList(new Employee("Afzal", "SSE"),
            new Employee("Rupesh", "Pata-nahi"),
            new Employee("Akku", "Wife"),
            new Employee("Suruchi", "Awara"),
            new Employee("Somya", "SDET"));

    public boolean addEmployee(Employee employee, List<Employee> employeeList) {
        return false;
    }

    public List<Employee> deleteEmployee(String name, List<Employee> employeeList) {
        Set<Employee> list = new HashSet<>(Arrays.asList(new Employee("Afzal", "SSE"),
                new Employee("Rupesh", "Pata-nahi"),
                new Employee("Akku", "Wife"),
                new Employee("Suruchi", "Awara"),
                new Employee("Somya", "SDET")));
        Set<Employee> copyOfSet = new HashSet<>(list);

        for (Employee employee : copyOfSet) {
            if (employee.getName().equals(name))
                list.remove(employee);
        }
        return new ArrayList<>(list);
    }

    public Employee updateEmployee(Employee employee, List<Employee> employeeList) {
        return null;
    }

    public Employee getEmployee(String name, List<Employee> employeeList) {
        return null;

    }

    @Override
    public List<Employee> getAllEmployee() {
        return Arrays.asList(new Employee("Afzal", "SSE"),
                new Employee("Rupesh", "Pata-nahi"),
                new Employee("Akku", "Wife"),
                new Employee("Suruchi", "Awara"),
                new Employee("Somya", "SDET"));
    }
}
