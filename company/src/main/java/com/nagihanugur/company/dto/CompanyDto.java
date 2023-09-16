package com.nagihanugur.company.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;


@Data
@AllArgsConstructor
public class CompanyDto {

    private Integer id;
    private String name;
    private Date dateOfEstablish;
    private String description;
    private String address;
}
