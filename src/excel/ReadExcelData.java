package excel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		FileInputStream io=new FileInputStream("F:\\Templets\\Data_25.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(io);
		XSSFSheet sheet=book.getSheet("dec_25");
		int rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		for(int i=0;i<=rowcount;i++)
		{
			int cellcount=sheet.getRow(i).getLastCellNum();
			for(int j=0;j<cellcount;j++)
			{
				XSSFRow row=sheet.getRow(i);
				XSSFCell cell=row.getCell(j);
				switch(cell.getCellType())
				{
				case STRING:System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");break;
				case NUMERIC:System.out.print(sheet.getRow(i).getCell(j).getNumericCellValue()+" ");break;
				default:
					break;
				}
				
			}
			System.out.println();
		}
		book.close();

	}

}
