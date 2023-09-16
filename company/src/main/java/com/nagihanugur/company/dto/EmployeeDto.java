package com.nagihanugur.company.dto;

import com.nagihanugur.company.entity.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class EmployeeDto {

    private Integer id;
    private String firstName;
    private String secondName;
    private Integer age;
    private String address;
    private String phoneNumber;
    private Date fromDate;
    private Date toDate;
    private Gender gender;
    private CompanyDto company;
}
