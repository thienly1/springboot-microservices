package net.javamicro.employeeservice.controller;

import lombok.AllArgsConstructor;
import net.javamicro.employeeservice.dto.EmployeeDto;
import net.javamicro.employeeservice.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    //Build save Employee Rest api
    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
       EmployeeDto employeeDto1= employeeService.savedEmployee(employeeDto);
       return new  ResponseEntity<>(employeeDto1, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public  ResponseEntity<EmployeeDto> getEmployee(@PathVariable("id") Long employeeId){
        EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
        return new ResponseEntity<>(employeeDto, HttpStatus.OK);
    }
}
