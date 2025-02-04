package core.domain.contractCreationComponent;

import core.domain.employeeCreationComponent.Employee;

import java.time.LocalTime;
import java.util.Date;

public class PermanentContract extends Contract{

    public PermanentContract(JobTitle jobTitle, Employee employee, double salary, Date startDate, Date endDate, LocalTime checkInTime, LocalTime checkOutTime){
        super(jobTitle, employee, salary, startDate, endDate, checkInTime, checkOutTime);
    }

    public PermanentContract(Contract prototype){
        super(prototype);
    }

    @Override
    public ContractPrototype cloneContract(){
        return new PermanentContract(this);
    }

}
