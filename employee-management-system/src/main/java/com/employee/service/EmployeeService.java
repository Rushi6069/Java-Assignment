package com.employee.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

public class EmployeeService {

@Autowired
private EmployeeRepository employeeRepository;

//Adding employee
public Employee addEmployee(Employee e) {
	Employee save = employeeRepository.save(e);
	return save;
}

//Fetching all employyes
public List<Employee> getAllEmployees(){
	List <Employee> list =(List<Employee>) this.employeeRepository.findAll();
	return list;
}

//Fetching single employee
public Employee getEmployeeById(int id) {
	Employee employee=null;
	try {
		employee=this.employeeRepository.findById(id);
		  	  }  catch(Exception e) {
		e.printStackTrace();  
	  }
		  return employee;
	  }
 
	//update employee
	public void updateEmployee(Employee employee, int employeeid) {
		Employee save = employeeRepository.save(employee);
	}
	
	//Delete Employee
	public void deleteEmployee(int eid) {
		employeeRepository.deleteById(eid);
	}
}
