package core.domain.employeeCreationComponent;

public abstract class EmployeeFactory {
    public abstract Employee createEmployee(int identityDocument, String fullName, String email);
}
