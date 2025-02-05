package core.domain.employeePaymentCalculationComponent;

import core.domain.employeeCreationComponent.Employee;

public class PaysheetCalculatorFacade {

    private PaysheetCalculator paysheetCalculator = new WorkPaysheetCalculator();

    public double calculatePaysheet(String identificator){

        // -------------- TO BE DONE ----------- With searchEmployee method we bring its attendance record
        // paysheetCalculator.calculateHoursRecord(attendanceRecord);

        return paysheetCalculator.calculatePayment();

    }

    private Employee searchEmploye(String identificator){
        // --------- TO BE DONE ---------- Search for user in database
        return null;
    }

}
