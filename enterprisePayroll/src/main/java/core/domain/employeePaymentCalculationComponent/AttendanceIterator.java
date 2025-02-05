package core.domain.employeePaymentCalculationComponent;

import core.domain.fileUnpackagerComponent.Record;

public interface AttendanceIterator {
    public Record getNext();
    public boolean hasNext();
}
