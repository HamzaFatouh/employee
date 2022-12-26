package com.manager.employee.controller;

import com.manager.employee.model.Employee;
import com.manager.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
//import com.manager.employer.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;



    @GetMapping(value = "/findall")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }


    @GetMapping("/findall/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable("id") Long id )
    {
       return employeeService.getEmployeeById(id);
    }


    @PostMapping(value = "/add")
    public Employee postEmployee(@RequestBody Employee employee){
        return employeeService.postEmployee(employee);
    }


    @DeleteMapping(value = "/delete/{id}")
    public Boolean deleteEmployee(@PathVariable ("id")Long id)
    {
        return employeeService.deleteEmployee( id);

    }


    @PutMapping(value = "/update")
    public Employee updateEmployer(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }




}
