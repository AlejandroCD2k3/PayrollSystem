package core.domain.contractManagementComponent;

import core.domain.contractCreationComponent.Contract;
import core.domain.contractCreationComponent.ContractCreatorFacade;
import core.domain.employeeCreationComponent.Employee;

import java.time.LocalTime;
import java.util.Date;

public class RenewDifferentContract extends ContractCreationHandler{
    @Override
    public Contract handleRequest(String request, String contractType, String jobTitleType, String jobTitleDepartment, String employee, Date startDate, Date endDate, double salary, LocalTime checkInTime, LocalTime checkOutTime, int identityDocument, String fullName, String email, String type){
        if(request.equalsIgnoreCase("newemployee")){

            ContractCreatorFacade contractCreatorFacade = new ContractCreatorFacade();

            return contractCreatorFacade.createContract(contractType, jobTitleType, jobTitleDepartment, searchForEmployee(identityDocument), startDate, endDate, salary, checkInTime, checkOutTime);
        }else if(nextHandler != null){
            return nextHandler.handleRequest(request, contractType, jobTitleType, jobTitleDepartment, employee, startDate, endDate, salary, checkInTime, checkOutTime, identityDocument, fullName, email, type);
        }else{
            throw new IllegalArgumentException("Request couldn't be handled");
        }
    }

    //-------------- TO BE DONE --------------
    private Employee searchForEmployee(int identityDocument){
        return null;
    }

}
