package com.manager.employee.service;


import com.manager.employee.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {


    List<Employee> getAllEmployee();
    Employee postEmployee(Employee employee);

    boolean deleteEmployee(Long id);

    Employee updateEmployee(Employee employee);


    Optional<Employee> getEmployeeById(Long id);
}
