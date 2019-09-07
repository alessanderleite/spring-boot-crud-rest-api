package br.com.alessanderleite.service;

import java.util.List;
import java.util.Optional;

import br.com.alessanderleite.model.Employee;

public interface EmployeeService {

	List<Employee>findAll();
	Optional<Employee> findById(Long id);
	void save(Employee employee);
	void update(Employee employee);
	void delete(Long id);
}
