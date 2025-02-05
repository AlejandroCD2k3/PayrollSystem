package core.domain.employeePaymentCalculationComponent;

import core.domain.fileUnpackagerComponent.AttendanceRecord;

public class WorkPaysheetCalculator extends PaysheetCalculator{

    @Override
    protected void calculateHoursRecord(AttendanceRecord record) {
        hoursRecordCalculator = new HoursRecordCalculator();
        Strategy strategy = new WorkHoursRecordStrategy(record);

        hoursRecord = hoursRecordCalculator.calculateHours();
    }

    @Override
    protected double calculatePayment() {
        return 0;
    }
}
