package adapter.outbound;

import core.domain.contractCreationComponent.Contract;
import core.domain.contractManagementComponent.ContractManagementFacade;
import core.ports.ContractRepository;

import java.util.List;

public class ContractRepositoryAdapter implements ContractRepository{

    private final JpaContractRepository contractRepository;
    private final ContractManagementFacade contractManagementFacade = new ContractManagementFacade();

    public ContractRepositoryAdapter(JpaContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    @Override
    public Contract createContract(String request, String contractType, String jobTitleType, String jobTitleDepartment, String employee, String startDate, String endDate, double salary, String checkInTime, String checkOutTime, int identityDocument, String fullName, String email, String type) {
        return contractRepository.save(contractManagementFacade.manageContractCreation(request, contractType, jobTitleType, jobTitleDepartment, employee, startDate, endDate, salary, checkInTime, checkOutTime, identityDocument, fullName, email, type));
    }

    @Override
    public List<Contract> getAllContracts() {
        return contractRepository.findAll();
    }

}
