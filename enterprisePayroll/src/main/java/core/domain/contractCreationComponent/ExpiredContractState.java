package core.domain.contractCreationComponent;

public class ExpiredContractState implements ContractState{

    @Override
    public String showExpiration(){
        return "Contract is expired";
    }
}
