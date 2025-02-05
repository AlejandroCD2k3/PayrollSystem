package core.domain.fileUnpackagerComponent;

import java.time.LocalTime;
import java.util.Date;

public abstract class Record {

    private Date date;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;

    public Record(Date date, LocalTime checkInTime, LocalTime checkOutTime){
        this.date = date;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }

}
