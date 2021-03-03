package selenium;

import java.io.IOException;

public class Excel1 {

	public static void main(String[] args) throws IOException {
		//Path
		String dirPath=System.getProperty("user.dir");
		String filePath=dirPath+"\\src\\selenium\\";
				String fileName="ExcelTestData.xls";
		//fileName
		String sheetName="Data1";
		ReadExcel.getExcelRowCount(filePath,fileName,sheetName);
	}

}
