package core.domain.payrollInformGenerator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelInformGenerator extends PaysheetInformGenerator{

    private Workbook workbook;
    private Sheet sheet;

    @Override
    protected void initializeDocument(String fileName){
        workbook = new XSSFWorkbook();
        sheet = workbook.createSheet(fileName);
    }

    @Override
    protected void addHeader(){
        Row headerRow = sheet.createRow(0);
        String[] headers = {"Employee", "EmployeeID", "JobTitle", "Salary", "Total"};
        for (int i = 0; i < headers.length; i++){
            headerRow.createCell(i).setCellValue(headers[i]);
        }
    }

    @Override
    protected void addPaysheetData(){
        //------------- TO BE DONE ------------- Get info from database and set it in the sheet
    }

    @Override
    protected void finalizeDocument(String filePath){
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

























