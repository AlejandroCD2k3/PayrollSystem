package core.domain.contractCreationComponent;

import core.domain.employeeCreationComponent.Employee;

import java.time.LocalTime;
import java.util.Date;

public class FixedTermContractFactory extends ContractFactory {
    @Override
    public Contract createContract(JobTitle jobTitle, Employee employee, double salary, Date startDate, Date endDate, LocalTime checkInTime, LocalTime checkOutTime){
        return new FixedTermContract(jobTitle, employee, salary, startDate, endDate, checkInTime, checkOutTime);
    }
}
