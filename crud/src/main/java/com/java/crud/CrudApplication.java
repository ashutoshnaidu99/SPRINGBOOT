package com.java.crud;



import com.java.crud.exception.ResourceNotFoundException;
import com.java.crud.model.Employee;
import com.java.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = new Employee();
		employee1.setFirstName("Ashutosh");
		employee1.setLastName("Naidu");
		employee1.setEmailId("ashu@gmail.com");
		employeeRepository.save(employee1);

		Employee employee2 = new Employee();
		employee2.setFirstName("Ashu");
		employee2.setLastName("AURA");
		employee2.setEmailId("ashu20@gmail.com");
		employeeRepository.save(employee2);
	}
	//build update employee restapi

}

