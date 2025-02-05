package core.domain.payrollInformGenerator;

public class PaysheetInformFacade {

    private PaysheetInformGenerator paysheetInformGenerator = new ExcelInformGenerator();

    public String generatePaysheetInform(String fileName, String filePath){

        try{
            paysheetInformGenerator.generateReport(fileName, filePath);
            return String.format("Report generated at %s", filePath);
        }catch (Exception exception){
            exception.printStackTrace();
        }

        return "Inform couldn't be generated";

    }

}
