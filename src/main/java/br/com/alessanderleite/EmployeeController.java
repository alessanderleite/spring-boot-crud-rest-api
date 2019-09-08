package br.com.alessanderleite;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alessanderleite.exception.ResourceNotFoundException;
import br.com.alessanderleite.model.Employee;
import br.com.alessanderleite.service.EmployeeService;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.findAll();
	}
	
	@GetMapping("employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long id) throws ResourceNotFoundException {
		Employee employee = employeeService.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
		
		return ResponseEntity.ok().body(employee);
	}
}
