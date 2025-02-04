package core.domain.contractManagementComponent;

import core.domain.contractCreationComponent.Contract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ContractManagementFacade {

    public Contract manageContractCreation(String request, String contractType, String jobTitleType, String jobTitleDepartment, String employee, String startDate, String endDate, double salary, String checkInTime, String checkOutTime, int identityDocument, String fullName, String email, String type) {
        ContractCreationHandler newEmployeeContract = new NewEmployeeContract();
        ContractCreationHandler renewDifferentContract = new RenewDifferentContract();
        ContractCreationHandler renewSameContract = new RenewSameContract();

        newEmployeeContract.setNextHandler(renewDifferentContract);
        renewDifferentContract.setNextHandler(renewSameContract);

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        try {
            Date formattedStartDate = dateFormatter.parse(startDate);
            Date formattedEndDate = dateFormatter.parse(endDate);

            LocalTime formattedCheckInTime = LocalTime.parse(checkInTime, timeFormatter);
            LocalTime formattedCheckOutTime = LocalTime.parse(checkOutTime, timeFormatter);

            return newEmployeeContract.handleRequest(request, contractType, jobTitleType, jobTitleDepartment, employee, formattedStartDate, formattedEndDate, salary, formattedCheckInTime, formattedCheckOutTime, identityDocument, fullName, email, type);
        } catch (ParseException exception) {
            exception.printStackTrace();
        }

        return null;
    }
}
