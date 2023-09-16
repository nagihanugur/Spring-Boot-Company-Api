package com.nagihanugur.company.controller;

import com.nagihanugur.company.dto.CompanyDto;
import com.nagihanugur.company.entity.Company;
import com.nagihanugur.company.service.CompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/company")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService){

        this.companyService = companyService;
    }

    @PostMapping
    public void saveCompany(@RequestBody Company company){
        companyService.createCompany(company);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyDto> getCompanyById(@PathVariable int id){

        return ResponseEntity.ok(companyService.getCompanyById(id));

    }
}
