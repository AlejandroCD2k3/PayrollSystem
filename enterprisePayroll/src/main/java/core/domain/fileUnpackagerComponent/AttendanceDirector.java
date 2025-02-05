package core.domain.fileUnpackagerComponent;

import org.apache.poi.ss.usermodel.*;

public class AttendanceDirector{

    public void makeWorkAttendance(AttendanceBuilder builder, Row row){
        builder.reset();
        builder.employeeAttendanceGeneration(row);
    }

}
