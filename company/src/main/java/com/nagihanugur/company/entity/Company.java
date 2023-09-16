package com.nagihanugur.company.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="company")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "date_establish")
    private Date dateOfEstablish;

    @Column(name = "description")
    private String description;

    @Column(name = "address")
    private String address;

    public Company(String name, Date dateOfEstablish, String description, String address) {
        this.name = name;
        this.dateOfEstablish = dateOfEstablish;
        this.description = description;
        this.address = address;
    }
}
