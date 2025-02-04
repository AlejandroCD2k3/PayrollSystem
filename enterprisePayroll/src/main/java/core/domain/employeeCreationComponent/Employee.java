package core.domain.employeeCreationComponent;

import java.util.List;

public abstract class Employee {

    protected int identityDocument;
    protected String fullName;
    protected String email;
    //private List<AttendanceRecord> attendanceRecord;
    protected double payment;

    public Employee(int identityDocument, String fullName, String email){
        this.identityDocument = identityDocument;
        this.fullName = fullName;
        this.email = email;
    }

    /*
    public setAttendanceRecord(List<AttendanceRecord> attendanceRecord){
        this.attendanceRecord = attendanceRecord;
    }
    */

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public String getEmail(){
        return this.email;
    }
}
