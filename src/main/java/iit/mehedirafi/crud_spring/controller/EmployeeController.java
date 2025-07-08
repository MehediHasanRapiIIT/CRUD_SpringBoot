package iit.mehedirafi.crud_spring.controller;

import iit.mehedirafi.crud_spring.entity.Employee;
import iit.mehedirafi.crud_spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3360)
@RestController

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/api/v1/employee")
    public ResponseEntity<List<Employee>> fetchAllEmployees() {
        return ResponseEntity.ok(employeeService.fetchAllEmployee());
    }
    @PostMapping("/api/v1/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.createEmployee(employee));
    }
    @PutMapping("/api/v1/employee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long id , @RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.updateEmployee(employee));
    }

    @DeleteMapping("/api/v1/employee/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long id) {
        return ResponseEntity.ok(employeeService.deleteEmployee(id));
    }

}
