package core.domain.fileUnpackagerComponent;

import java.time.LocalTime;
import java.util.Date;

public class DailyRecord extends Record{

    public DailyRecord(Date date, LocalTime checkInTime, LocalTime checkOutTime){
        super(date, checkInTime, checkOutTime);
    }

}
