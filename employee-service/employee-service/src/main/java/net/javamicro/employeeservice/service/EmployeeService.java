package net.javamicro.employeeservice.service;

import net.javamicro.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto savedEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);
}
