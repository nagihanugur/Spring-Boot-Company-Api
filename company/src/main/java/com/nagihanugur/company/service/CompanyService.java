package com.nagihanugur.company.service;


import com.nagihanugur.company.dto.CompanyDto;
import com.nagihanugur.company.dto.CompanyDtoConverter;
import com.nagihanugur.company.entity.Company;
import com.nagihanugur.company.repository.ICompanyRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {

    private final ICompanyRepository companyRepository;
    private final CompanyDtoConverter companyDtoConverter;

    public CompanyService(ICompanyRepository companyRepository, CompanyDtoConverter companyDtoConverter){

        this.companyRepository = companyRepository;
        this.companyDtoConverter = companyDtoConverter;
    }

    public void createCompany(Company company){


        if (companyRepository.existsById(company.getId())){

            throw new IllegalStateException("company already exist");

        }
        Company comp = new Company(
                company.getName(),
                company.getDateOfEstablish(),
                company.getDescription(),
                company.getAddress()
        );

        companyDtoConverter.convertToDto(companyRepository.save(comp));

    }

    public CompanyDto getCompanyById(int id){

       return companyDtoConverter.convertToDto(companyRepository.findById(id)
               .orElseThrow(()-> new IllegalStateException("Company could not find by id")));
    }


}
