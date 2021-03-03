package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
 public static void getExcelRowCount(String filePath,String fileName,String sheetName) throws IOException
 {
	 FileInputStream fis=new FileInputStream(filePath+fileName);
	 XSSFWorkbook workBook= new XSSFWorkbook(fis);
	 XSSFSheet sheet=workBook.getSheet(sheetName);
	 int rowCount=sheet.getLastRowNum();
	 System.out.println(rowCount);
	 fis.close();
	 workBook.close();
	 
 }
}
