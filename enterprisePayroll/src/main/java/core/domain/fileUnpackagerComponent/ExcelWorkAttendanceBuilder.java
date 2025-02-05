package core.domain.fileUnpackagerComponent;

import org.apache.poi.ss.usermodel.*;
import java.util.Date;

public class ExcelWorkAttendanceBuilder implements AttendanceBuilder{

    private WorkAttendance result = new WorkAttendance();

    @Override
    public void reset(){
        this.result = new WorkAttendance();
    }

    @Override
    public void employeeAttendanceGeneration(Row row){
        int rowIndexCounter = 2;

        while(row.getCell(rowIndexCounter).getLocalDateTimeCellValue() != null){
            Record dailyRecord = new DailyRecord(row.getCell(rowIndexCounter).getDateCellValue(), row.getCell(rowIndexCounter+1).getLocalDateTimeCellValue().toLocalTime(), row.getCell(rowIndexCounter+2).getLocalDateTimeCellValue().toLocalTime());
            result.getAttendanceRecord().add(dailyRecord);
            rowIndexCounter += 3;
        }
    }

    @Override
    public WorkAttendance getResult(){
        return result;
    }



}
