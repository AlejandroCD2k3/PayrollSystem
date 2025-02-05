package core.ports;

import core.domain.contractCreationComponent.Contract;

import java.util.List;
import java.util.Optional;

public interface ContractRepository {
    public Contract createContract(String request, String contractType, String jobTitleType, String jobTitleDepartment, String employee, String startDate, String endDate, double salary, String checkInTime, String checkOutTime, int identityDocument, String fullName, String email, String type);
    public List<Contract> getAllContracts();
}
