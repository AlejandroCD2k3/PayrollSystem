package core.domain.payrollInformGenerator;

public abstract class PaysheetInformGenerator{

    public void generateReport(String fileName, String filePath){
        initializeDocument(fileName);
        addHeader();
        addPaysheetData();
        finalizeDocument(filePath);
    }

    protected abstract void initializeDocument(String fileName);
    protected abstract void addHeader();
    protected abstract void addPaysheetData();
    protected abstract void finalizeDocument(String filePath);

}
