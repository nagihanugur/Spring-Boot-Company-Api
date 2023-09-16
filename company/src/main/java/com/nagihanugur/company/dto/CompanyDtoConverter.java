package com.nagihanugur.company.dto;

import com.nagihanugur.company.entity.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyDtoConverter {

    public CompanyDto convertToDto(Company company){

        return new CompanyDto(company.getId(), company.getName(),
                company.getDateOfEstablish(), company.getDescription(), company.getAddress());

    }

    public Company convertToCompany(CompanyDto dto){

        return new Company(dto.getId(), dto.getName(),
                dto.getDateOfEstablish(),dto.getDescription(), dto.getAddress());
    }
}
