package iit.mehedirafi.crud_spring.service;

import iit.mehedirafi.crud_spring.entity.Employee;
import iit.mehedirafi.crud_spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> fetchAllEmployee() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee fetchEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee empobj = employeeRepository.findById(employee.getId()).get();
        if (empobj != null) {
            empobj.setEmail(employee.getEmail());
            empobj.setName(employee.getName());
            empobj.setSalary(employee.getSalary());
        }
        return employeeRepository.save(empobj);
    }

    @Override
    public String deleteEmployee(Long id) {
        Employee empobj = employeeRepository.findById(id).get();
        String deleteMsg = null;
        if (empobj != null) {
            employeeRepository.delete(empobj);
            deleteMsg = "Employee deleted successfully";
        }
        return deleteMsg;
    }
}
