package core.ports;

import core.domain.employeeCreationComponent.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
    public Employee createEmployee(Employee employee);
    public Optional<Employee> getEmployeeById(int id);
    public List<Employee> getAllEmployees();
    public Employee updateEmployee(int id, Employee employee);
    public void deleteEmployee(int id);
}
