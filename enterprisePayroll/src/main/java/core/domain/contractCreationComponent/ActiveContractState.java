package core.domain.contractCreationComponent;

public class ActiveContractState implements ContractState{

    @Override
    public String showExpiration(){
        return "Contract still active";
    }

}
