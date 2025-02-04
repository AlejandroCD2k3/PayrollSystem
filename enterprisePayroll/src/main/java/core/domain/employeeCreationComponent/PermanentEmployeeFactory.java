package core.domain.employeeCreationComponent;

public class PermanentEmployeeFactory extends EmployeeFactory{
    @Override
    public Employee createEmployee(int identityDocument, String fullName, String email){
        return new PermanentEmployee(identityDocument,fullName,email);
    }
}
