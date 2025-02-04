package core.domain.contractManagementComponent;

import core.domain.contractCreationComponent.Contract;
import core.domain.contractCreationComponent.ContractPrototype;

import java.time.LocalTime;
import java.util.Date;

public class RenewSameContract extends ContractCreationHandler{

    @Override
    public Contract handleRequest(String request, String contractType, String jobTitleType, String jobTitleDepartment, String employee, Date startDate, Date endDate, double salary, LocalTime checkInTime, LocalTime checkOutTime, int identityDocument, String fullName, String email, String type){
        if(request.equalsIgnoreCase("newemployee")){
            return (Contract) searchForContract(identityDocument).cloneContract();
        }else if(nextHandler != null){
            return nextHandler.handleRequest(request, contractType, jobTitleType, jobTitleDepartment, employee, startDate, endDate, salary, checkInTime, checkOutTime, identityDocument, fullName, email, type);
        }else{
            throw new IllegalArgumentException("Request couldn't be handled");
        }
    }

    // --------- TO BE DONE ---------
    private Contract searchForContract(int identityDocument){
        return null;
    }

}
