package core.domain.fileUnpackagerComponent;

import core.domain.employeePaymentCalculationComponent.AttendanceIterator;
import core.domain.employeePaymentCalculationComponent.WorkAttendanceIterator;

public class WorkAttendance extends AttendanceRecord {
    @Override
    public AttendanceIterator createIterator(){
        return new WorkAttendanceIterator(this);
    }
}
