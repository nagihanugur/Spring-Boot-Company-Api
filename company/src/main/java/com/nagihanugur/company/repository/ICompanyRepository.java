package com.nagihanugur.company.repository;

import com.nagihanugur.company.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICompanyRepository extends JpaRepository<Company, Integer> {

    Company findCompanyById(int id);

}
