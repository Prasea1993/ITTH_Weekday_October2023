package utilities;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {


    public static void main(String[] args) throws IOException {

        // read the file path
        FileInputStream input =new FileInputStream
                (System.getProperty("user.dir")+"/src/test/resources/testData/TestDataSample.xlsx");


        // supply file path to workbook as a reference
        XSSFWorkbook workbook= new XSSFWorkbook(input);

        // read sheet

        XSSFSheet sheet=workbook.getSheetAt(0);

        XSSFRow row=sheet.getRow(0);

        System.out.println("Number of rows in excel data::"+sheet.getPhysicalNumberOfRows());
        System.out.println("Number of columns::"+row.getPhysicalNumberOfCells());


        for(int i=0; i< sheet.getPhysicalNumberOfRows(); i++ ){

            for(int j=0; j< row.getPhysicalNumberOfCells(); j++){

                System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());

            }

        }





    }


}
