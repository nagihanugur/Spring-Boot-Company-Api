package com.nagihanugur.company.dto;

import com.nagihanugur.company.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDtoConverter {

    private final CompanyDtoConverter companyDtoConverter;

    public EmployeeDtoConverter(CompanyDtoConverter companyDtoConverter) {
        this.companyDtoConverter = companyDtoConverter;
    }

    public EmployeeDto convertToEmployeeDto(Employee employee){

        return new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getSecondName(), employee.getAge(),
                employee.getAddress(), employee.getPhoneNumber(), employee.getFromDate(), employee.getToDate(), employee.getGender(), companyDtoConverter.convertToDto(employee.getCompany()));
    }
}
