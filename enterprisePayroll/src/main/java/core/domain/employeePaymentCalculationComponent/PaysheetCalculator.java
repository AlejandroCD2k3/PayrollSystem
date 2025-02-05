package core.domain.employeePaymentCalculationComponent;

import core.domain.employeeCreationComponent.Employee;
import core.domain.fileUnpackagerComponent.AttendanceRecord;

public abstract class PaysheetCalculator {

    protected HoursRecord hoursRecord;
    protected HoursRecordCalculator hoursRecordCalculator;

    public double calculateEmployeePaysheet(AttendanceRecord record){
        calculateHoursRecord(record);
        return calculatePayment();
    }

    protected abstract void calculateHoursRecord(AttendanceRecord record);
    protected abstract double calculatePayment();

}
