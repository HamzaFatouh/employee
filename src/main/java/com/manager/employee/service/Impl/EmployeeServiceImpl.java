package com.manager.employee.service.Impl;

import com.manager.employee.model.Employee;
import com.manager.employee.repository.EmployeeRepository;
import com.manager.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee postEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public boolean deleteEmployee(Long id) {
        if(employeeRepository.existsById(id)){
            employeeRepository.deleteById(id);
            return true;
        }else {
            return false;
        }

    }

    @Override
    public Employee updateEmployee(Employee employee) {
        if(employeeRepository.existsById(employee.getId())){
            return employeeRepository.save(employee);
        }else{
            return null;
        }
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id){
        return employeeRepository.findById(id);
    }


}
