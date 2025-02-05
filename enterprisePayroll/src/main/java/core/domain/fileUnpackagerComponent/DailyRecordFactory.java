package core.domain.fileUnpackagerComponent;

import java.time.LocalTime;
import java.util.Date;

public class DailyRecordFactory implements RecordFactory{
    @Override
    public Record createRecord(Date date, LocalTime checkInTime, LocalTime checkOutTime){
        return new DailyRecord(date, checkInTime, checkOutTime);
    }
}
