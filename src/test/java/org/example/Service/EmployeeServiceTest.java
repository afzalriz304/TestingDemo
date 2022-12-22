package org.example.Service;

import org.example.ServiceImpl.EmployeeServiceImpl;
import org.example.model.Employee;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class EmployeeServiceTest {

    @Test
    public void testGetEmployees() {
        EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
        List<Employee> list = employeeServiceImpl.getAllEmployee();
        assertEquals(5, list.size());
    }

    @Test
    public void testDeleteEmployee() {
        EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
        List<Employee> list = employeeServiceImpl.deleteEmployee("Afzal", new ArrayList<>());
        assertNotNull(list);
        assertEquals(4, list.size());

    }

}
