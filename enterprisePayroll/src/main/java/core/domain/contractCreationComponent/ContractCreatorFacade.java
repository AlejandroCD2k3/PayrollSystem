package core.domain.contractCreationComponent;

import core.domain.employeeCreationComponent.Employee;

import java.time.LocalTime;
import java.util.Date;

public class ContractCreatorFacade{

    public Contract createContract(String contractType, String jobTitleType, String jobTitleDepartment, Employee employee, Date startDate, Date endDate, double salary, LocalTime checkInTime, LocalTime checkOutTime){

        ContractFactory contractFactory;

        switch (contractType.toLowerCase()){
            case ("fixedterm"):
                contractFactory = new FixedTermContractFactory();
                break;
            case ("permanent"):
                contractFactory = new PermanentContractFactory();
                break;
            case ("service"):
                contractFactory = new ServiceContractFactory();
                break;
            default:
                throw new IllegalArgumentException("Unknown Contract type");
        }

        return contractFactory.createContract(createJobTitle(jobTitleType, jobTitleDepartment), employee, salary, startDate, endDate, checkInTime, checkOutTime);
    }

    private JobTitle createJobTitle(String jobTitleType, String jobTitleDepartment){

        JobTitleFactory jobTitleFactory;

        switch (jobTitleType.toLowerCase()){
            case ("manager"):
                jobTitleFactory = new ManagerFactory();
                break;
            case ("consultant"):
                jobTitleFactory = new ConsultantFactory();
                break;
            case ("supervisor"):
                jobTitleFactory = new SupervisorFactory();
                break;
            default:
                throw new IllegalArgumentException("Unknown Job title");
        }

        return jobTitleFactory.createJobTitle(jobTitleDepartment,jobTitleType);
    }

}
