package core.domain.fileUnpackagerComponent;

public class AttendanceDirector{

    public void makeWorkAttendance(AttendanceBuilder builder, Row row){
        builder.reset();
        builder.employeeAttendanceGeneration(row);
    }

}
