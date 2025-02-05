package core.domain.employeePaymentCalculationComponent;

public class HoursRecordCalculator{

    private Strategy strategy;

    public HoursRecord calculateHours(){
        return strategy.calculateHours();
    }

}
