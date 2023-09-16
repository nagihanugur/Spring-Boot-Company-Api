package com.nagihanugur.company.service;

import com.nagihanugur.company.dto.CompanyDtoConverter;
import com.nagihanugur.company.dto.EmployeeDto;
import com.nagihanugur.company.dto.EmployeeDtoConverter;
import com.nagihanugur.company.entity.Company;
import com.nagihanugur.company.entity.Employee;
import com.nagihanugur.company.repository.IEmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final IEmployeeRepository employeeRepository;
    private final CompanyService companyService;
    private final EmployeeDtoConverter employeeDtoConverter;
    private final CompanyDtoConverter companyDtoConverter;

    public EmployeeService(IEmployeeRepository employeeRepository, CompanyService companyService, EmployeeDtoConverter employeeDtoConverter, CompanyDtoConverter companyDtoConverter) {
        this.employeeRepository = employeeRepository;
        this.companyService = companyService;
        this.employeeDtoConverter = employeeDtoConverter;
        this.companyDtoConverter = companyDtoConverter;
    }


    public Employee createEmployee(Employee employee){
        if(employeeRepository.existsById(employee.getId())){

            throw new IllegalStateException("this employee is already exist");

        }

       return employeeRepository.save(employee);

    }

    public List<Employee> getEmployees(){

        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id){

        if(!employeeRepository.existsById(id)){

            throw new IllegalStateException("employe with id "+id+" does not exist");

        }
        return employeeRepository.findEmployeeById(id);
    }

    public void deleteEmployeeById(int id){

        if(!employeeRepository.existsById(id)){

            throw new IllegalStateException("employe with id "+id+" does not exist");
        }

        employeeRepository.deleteById(id);
    }
}
