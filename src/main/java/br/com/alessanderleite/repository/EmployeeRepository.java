package br.com.alessanderleite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alessanderleite.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
