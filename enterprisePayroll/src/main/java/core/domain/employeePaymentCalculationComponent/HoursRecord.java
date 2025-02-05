package core.domain.employeePaymentCalculationComponent;

public abstract class HoursRecord{

    protected int ordinaryDaytimeHour;
    protected int ordinaryNighttimeHour;
    protected int overtimeDaytimeHour;
    protected int overtimeNighttimeHour;
    protected int holidayDaytimeHour;
    protected int holidayNighttimeHour;
    protected int overtimeHolidayDaytimeHour;
    protected int overtimeHolidayNighttimeHour;

    public abstract int calculateTotalHours();
}
