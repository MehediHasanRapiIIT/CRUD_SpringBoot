package iit.mehedirafi.crud_spring.service;

import iit.mehedirafi.crud_spring.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> fetchAllEmployee();

    Employee fetchEmployeeById(Long id);

    Employee createEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    String deleteEmployee(Long id);
}
