package core.domain.fileUnpackagerComponent;

import java.time.LocalTime;
import java.util.Date;

public interface RecordFactory{

    public Record createRecord(Date date, LocalTime checkInTime, LocalTime checkOutTime);

}
