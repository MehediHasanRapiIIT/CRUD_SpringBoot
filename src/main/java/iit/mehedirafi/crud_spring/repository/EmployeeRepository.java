package iit.mehedirafi.crud_spring.repository;

import iit.mehedirafi.crud_spring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
