package com.antobevi.springbootaopeducacionit.controllers;

import com.antobevi.springbootaopeducacionit.models.Employee;
import com.antobevi.springbootaopeducacionit.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired // Instanciar una clase por medio de los beans
    private EmployeeService employeeService;

    @RequestMapping(value = "/add/employee", method = RequestMethod.GET)
    public Employee addEmployee(@RequestParam("name") String name, @RequestParam("id") String id) {

        return employeeService.addEmployee(name, id);
    }

}
