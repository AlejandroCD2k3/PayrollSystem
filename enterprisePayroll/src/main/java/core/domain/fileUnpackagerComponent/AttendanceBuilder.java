package core.domain.fileUnpackagerComponent;

import org.apache.poi.ss.usermodel.*;

public interface AttendanceBuilder{

    public void reset();
    public void employeeAttendanceGeneration(Row row);
    public AttendanceRecord getResult();

}
