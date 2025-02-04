package core.domain.contractManagementComponent;

import core.domain.contractCreationComponent.Contract;

import java.time.LocalTime;
import java.util.Date;

public abstract class ContractCreationHandler implements ContractHandler{

    protected ContractHandler nextHandler;

    @Override
    public void setNextHandler(ContractHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    @Override
    public abstract Contract handleRequest(String request, String contractType, String jobTitleType, String jobTitleDepartment, String employee, Date startDate, Date endDate, double salary, LocalTime checkInTime, LocalTime checkOutTime, int identityDocument, String fullName, String email, String type);

}
