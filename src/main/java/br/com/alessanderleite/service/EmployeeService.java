package br.com.alessanderleite.service;

import java.util.List;
import java.util.Optional;

import br.com.alessanderleite.model.Employee;

public interface EmployeeService {

	List<Employee>findAll();
	Optional<Employee> findById(Long id);
	Employee save(Employee employee);
	Employee update(Employee employee);
	void delete(Employee employee);
}