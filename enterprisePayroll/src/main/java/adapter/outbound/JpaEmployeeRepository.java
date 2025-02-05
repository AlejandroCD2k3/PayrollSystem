package adapter.outbound;

import core.domain.employeeCreationComponent.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaEmployeeRepository extends JpaRepository<Employee, Long>{
}
