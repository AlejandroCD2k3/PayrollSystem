package core.domain.employeePaymentCalculationComponent;

import core.domain.fileUnpackagerComponent.WorkAttendance;
import core.domain.fileUnpackagerComponent.Record;

import java.util.List;

public class WorkAttendanceIterator implements AttendanceIterator{

    private final List<Record> attendanceRecord;
    private int position = 0;

    public WorkAttendanceIterator(WorkAttendance collection){
        attendanceRecord = collection.getAttendanceRecord();
    }

    @Override
    public Record getNext(){
        return attendanceRecord.get(position++);
    }

    @Override
    public boolean hasNext(){
        return position < attendanceRecord.size() && attendanceRecord.get(position) != null;
    }
}
