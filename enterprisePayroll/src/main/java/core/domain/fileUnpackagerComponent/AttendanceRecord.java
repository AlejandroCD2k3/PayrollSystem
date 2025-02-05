package core.domain.fileUnpackagerComponent;

import core.domain.employeePaymentCalculationComponent.AttendanceIterator;
import java.util.ArrayList;
import java.util.List;

public abstract class AttendanceRecord{

    protected List<Record> attendanceRecord = new ArrayList<>();

    public abstract AttendanceIterator createIterator();

    public List<Record> getAttendanceRecord(){
        return this.attendanceRecord;
    }
}
