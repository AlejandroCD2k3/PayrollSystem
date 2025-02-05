package core.domain.fileUnpackagerComponent;

public class WorkAttendance implements AttendanceRecord{
    @Override
    public AttendanceIterator createIterator(){
        return new WorkAttendanceIterator(this);
    }
}
