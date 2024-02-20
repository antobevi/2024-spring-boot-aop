package com.antobevi.springbootaopeducacionit.services;

import com.antobevi.springbootaopeducacionit.models.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public Employee addEmployee(String name, String id) {
        System.out.println("Ingreso a [AddEmployee]");

        Employee employee = new Employee();

        employee.setName(name);
        employee.setId(id);

        return employee;
    }

    public String deleteEmployee(String id) {

        return "Deleted employee: ".concat(id); // El concat es mas optimo en cuanto a uso de recursos
    }

}
