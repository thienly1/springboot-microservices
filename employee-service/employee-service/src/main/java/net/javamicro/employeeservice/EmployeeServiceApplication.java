package net.javamicro.employeeservice;

import net.javamicro.employeeservice.dto.EmployeeDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

	public static interface EmployeeService {
		EmployeeDto savedEmployeeDto(EmployeeDto employeeDto);

	}
}
