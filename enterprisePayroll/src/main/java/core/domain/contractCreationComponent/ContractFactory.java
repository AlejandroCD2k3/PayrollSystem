package core.domain.contractCreationComponent;

import core.domain.employeeCreationComponent.Employee;

import java.time.LocalTime;
import java.util.Date;

public abstract class ContractFactory{

    public abstract Contract createContract(JobTitle jobTitle, Employee employee, double salary, Date startDate, Date endDate, LocalTime checkInTime, LocalTime checkOutTime);

}
