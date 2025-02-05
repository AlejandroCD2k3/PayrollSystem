package core.domain.fileUnpackagerComponent;

public interface AttendanceBuilder{

    public void reset();
    public void employeeAttendanceGeneration(Row row);
    public AttendanceRecord getResult();

}
