package core.domain.employeeCreationComponent;

public class ContractorFactory extends EmployeeFactory{
    @Override
    public Employee createEmployee(int identityDocument, String fullName, String email){
        return new Contractor(identityDocument,fullName,email);
    }
}
