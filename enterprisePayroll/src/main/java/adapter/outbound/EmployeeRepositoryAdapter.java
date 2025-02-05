package adapter.outbound;

import core.domain.employeeCreationComponent.Employee;
import core.ports.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public class EmployeeRepositoryAdapter implements EmployeeRepository{
    private final JpaEmployeeRepository employeeRepository;

    public EmployeeRepositoryAdapter(JpaEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.findById((long) id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        if (employeeRepository.existsById((long) id)) {
            employee.setIdentityDocument(id);
            return employeeRepository.save(employee);
        }
        throw new RuntimeException("Employee not found");
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById((long) id);
    }
}
