package core.domain.contractCreationComponent;

import core.domain.employeeCreationComponent.Employee;

import java.time.LocalTime;
import java.util.Date;

public class ServiceContractFactory extends ContractFactory{
    @Override
    public Contract createContract(JobTitle jobTitle, Employee employee, double salary, Date startDate, Date endDate, LocalTime checkInTime, LocalTime checkOutTime){
        return new ServiceContract(jobTitle, employee, salary, startDate, endDate, checkInTime, checkOutTime);
    }
}
