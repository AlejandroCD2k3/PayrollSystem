package core.domain.contractCreationComponent;

import core.domain.employeeCreationComponent.Employee;

import java.time.LocalTime;
import java.util.Date;

public abstract class Contract implements ContractPrototype{

    protected JobTitle jobTitle;
    protected Employee employee;
    protected ContractState state;

    private double salary;
    private Date startDate;
    private Date endDate;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;

    public Contract(JobTitle jobTitle, Employee employee, double salary, Date startDate, Date endDate, LocalTime checkInTime, LocalTime checkOutTime){
        this.jobTitle = jobTitle;
        this.employee = employee;
        this.state = new ActiveContractState();
        this.salary = salary;
        this.startDate = startDate;
        this.endDate = endDate;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }

    public Contract(Contract prototype){
        this.jobTitle = prototype.jobTitle;
        this.employee = prototype.employee;
        this.state = new ActiveContractState();
        this.salary = prototype.salary;
        this.startDate = prototype.startDate;
        this.endDate = prototype.endDate;
        this.checkInTime = prototype.checkInTime;
        this.checkOutTime = prototype.checkOutTime;
    }

    public String showExpiration(){
        return this.state.showExpiration();
    }

    @Override
    public abstract ContractPrototype cloneContract();

}
