package core.domain.employeeCreationComponent;

public class EmployeeCreatorFacade {
    public Employee createEmployee(int identityDocument, String fullName, String email, String type){

        EmployeeFactory employeeFactory;

        switch (type.toLowerCase()){
            case ("permanentemployee"):
                employeeFactory = new PermanentEmployeeFactory();
                break;
            case ("contractor"):
                employeeFactory = new ContractorFactory();
                break;
            default:
                throw new IllegalArgumentException ("Unknow Employee type") ;
        }
        return employeeFactory.createEmployee(identityDocument,fullName,email);
    }
}
