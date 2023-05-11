package net.javamicro.employeeservice.service;

import net.javamicro.employeeservice.dto.APIResponseDto;
import net.javamicro.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto savedEmployee(EmployeeDto employeeDto);
    APIResponseDto getEmployeeById(Long employeeId);
}
