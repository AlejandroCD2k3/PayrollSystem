package core.domain.contractCreationComponent;

import core.domain.employeeCreationComponent.Employee;

import java.time.LocalTime;
import java.util.Date;

public class FixedTermContract extends Contract{

    public FixedTermContract(JobTitle jobTitle, Employee employee, double salary, Date startDate, Date endDate, LocalTime checkInTime, LocalTime checkOutTime){
        super(jobTitle, employee, salary, startDate, endDate, checkInTime, checkOutTime);
    }

    public FixedTermContract(Contract prototype){
        super(prototype);
    }

    @Override
    public ContractPrototype cloneContract(){
        return new FixedTermContract(this);
    }

}
