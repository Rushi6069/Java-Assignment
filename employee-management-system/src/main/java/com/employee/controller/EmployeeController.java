package com.employee.controller;
import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
	
	//Adding Employees
	@Operation(summary = "Create a new employee", description = "Adds a new employee to the database")
	@ApiResponses(value = {
	    @ApiResponse(responseCode = "201", description = "Employee created successfully"),
	    @ApiResponse(responseCode = "400", description = "Invalid input data")
	})
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		this.employeeService.addEmployee(employee);
		return employee;
	}
	
	
	//Fetch all Employee
	@Operation(summary = "Create a new employee", description = "Adds a new employee to the database")
	@ApiResponses(value = {
	    @ApiResponse(responseCode = "201", description = "Employee created successfully"),
	    @ApiResponse(responseCode = "400", description = "Invalid input data")
	})
	@GetMapping("/Employees")
	public List <Employee> getEmployee(){
		 return employeeService.getAllEmployees();
	}
	
	//Fetch Employee by id
	@Operation(summary = "Create a new employee", description = "Adds a new employee to the database")
	@ApiResponses(value = {
	    @ApiResponse(responseCode = "201", description = "Employee created successfully"),
	    @ApiResponse(responseCode = "400", description = "Invalid input data")
	})
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getBook	(@PathVariable("id") int id) {
		Employee employee= employeeService.getEmployeeById(id);
		if (employee==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(employee));
	}
	
	//Update Employee Details
	@Operation(summary = "Create a new employee", description = "Adds a new employee to the database")
	@ApiResponses(value = {
	    @ApiResponse(responseCode = "201", description = "Employee created successfully"),
	    @ApiResponse(responseCode = "400", description = "Invalid input data")
	})
	@PutMapping("/employee/{employeeid}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable("employeeid") int employeeid) {
		this.employeeService.updateEmployee(employee, employeeid);
		return employee;
	}
	
	
		//Delete an employee
	@Operation(summary = "Create a new employee", description = "Adds a new employee to the database")
	@ApiResponses(value = {
	    @ApiResponse(responseCode = "201", description = "Employee created successfully"),
	    @ApiResponse(responseCode = "400", description = "Invalid input data")
	})
		@DeleteMapping("/employee/{eid}")
		public void  deleteEmployee(@PathVariable("eid") int eid) {
			this.employeeService.deleteEmployee(eid);
			}
}
