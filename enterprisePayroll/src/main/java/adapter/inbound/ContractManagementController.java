package adapter.inbound;

import adapter.outbound.ContractRepositoryAdapter;
import adapter.outbound.EmployeeRepositoryAdapter;
import core.domain.contractCreationComponent.Contract;
import core.domain.employeeCreationComponent.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class ContractManagementController {
    private final EmployeeRepositoryAdapter employeeRepositoryAdapter;
    private final ContractRepositoryAdapter contractRepositoryAdapter;

    public ContractManagementController(EmployeeRepositoryAdapter employeeRepositoryAdapter, ContractRepositoryAdapter contractRepositoryAdapter) {
        this.employeeRepositoryAdapter = employeeRepositoryAdapter;
        this.contractRepositoryAdapter = contractRepositoryAdapter;
    }

    @PostMapping
    public ResponseEntity<Contract> createContract(@PathVariable String request, @PathVariable String contractType, @PathVariable String jobTitleType, @PathVariable String jobTitleDepartment, @PathVariable String employee, @PathVariable String startDate, @PathVariable String endDate, @PathVariable double salary, @PathVariable String checkInTime, @PathVariable String checkOutTime, @PathVariable int identityDocument, @PathVariable String fullName, @PathVariable String email, @PathVariable String type) {
        return ResponseEntity.ok(contractRepositoryAdapter.createContract(request, contractType, jobTitleType, jobTitleDepartment, employee, startDate, endDate, salary, checkInTime, checkOutTime, identityDocument, fullName, email, type));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
        return employeeRepositoryAdapter.getEmployeeById(id)
                .map(employee -> ResponseEntity.ok(employee))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(employeeRepositoryAdapter.getAllEmployees());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        return ResponseEntity.ok(employeeRepositoryAdapter.updateEmployee(id, employee));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable int id) {
        employeeRepositoryAdapter.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
}
