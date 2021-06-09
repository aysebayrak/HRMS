package kodlamaio.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import kodlamaio.HRMS.business.abstracts.EmployeeService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
	
	private EmployeeService employeeService;

	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	

	@GetMapping("/getall")
	public DataResult<List<Employee>> getAll(){
		return this.employeeService.getAll();
	}
}
