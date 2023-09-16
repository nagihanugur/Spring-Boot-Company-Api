package com.nagihanugur.company.repository;

import com.nagihanugur.company.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findEmployeeById(int id);
    List<Employee> findAllByCompanyId(int id);

}
