package utility;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
    XSSFWorkbook wb;
	
	public ExcelDataProvider() {
	
		try {
			FileInputStream fis=new FileInputStream("F:\\velocity-pune\\2021\\guru\\Testdata\\Excel.xlsx");
			wb=new XSSFWorkbook(fis);
		} catch (Exception e) {
		System.out.println("unable to read excel data"+e.getMessage());
			
		}
	}
	
	
	public String getStringData(String sheetName, int row, int cell) {
		try {
			String value = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
			System.out.println(value);
			return value;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
