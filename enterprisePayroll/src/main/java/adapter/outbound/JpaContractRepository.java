package adapter.outbound;

import core.domain.contractCreationComponent.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaContractRepository extends JpaRepository<Contract, Long> {

}
