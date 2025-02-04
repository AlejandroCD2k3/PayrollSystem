package core.domain.contractManagementComponent;

import core.domain.contractCreationComponent.Contract;

import java.time.LocalTime;
import java.util.Date;

public interface ContractHandler {

    public void setNextHandler(ContractHandler nextHandler);
    public Contract handleRequest(String request, String contractType, String jobTitleType, String jobTitleDepartment, String employee, Date startDate, Date endDate, double salary, LocalTime checkInTime, LocalTime checkOutTime, int identityDocument, String fullName, String email, String type);

}
