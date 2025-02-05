package core.domain.employeePaymentCalculationComponent;

import core.domain.fileUnpackagerComponent.AttendanceRecord;

public class WorkHoursRecordStrategy implements Strategy{

    private AttendanceIterator iterator;

    public WorkHoursRecordStrategy(AttendanceRecord record){
        this.iterator = record.createIterator();
    }

    @Override
    public HoursRecord calculateHours(){
        return null;
    }

}
