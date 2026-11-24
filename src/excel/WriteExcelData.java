package excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static void main(String[] args) throws IOException {
		// for .xlsx XSSFWorkbook and for .xls used HSSFWorkbook
		XSSFWorkbook book =new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("dec_25");
		XSSFRow rowhead=sheet.createRow(0);
		rowhead.createCell(0).setCellValue("Serial No.");
		rowhead.createCell(1).setCellValue("Student Name");
		rowhead.createCell(2).setCellValue("Course Name");
		rowhead.createCell(3).setCellValue("Contact No.");
		rowhead.createCell(4).setCellValue("Fees paid");
		XSSFRow row1=sheet.createRow(1);
		row1.createCell(0).setCellValue("1");
		row1.createCell(1).setCellValue("Raj K");
		row1.createCell(2).setCellValue("Fullstack");
		row1.createCell(3).setCellValue("9869616219");
		row1.createCell(4).setCellValue("Fees Paid");
		XSSFRow row2=sheet.createRow(2);
		row2.createCell(0).setCellValue("2");
		row2.createCell(1).setCellValue("Puja Ray");
		row2.createCell(2).setCellValue("cyber security");
		row2.createCell(3).setCellValue("9869616219");
		row2.createCell(4).setCellValue("EMI");
		XSSFRow row3=sheet.createRow(3);
		row3.createCell(0).setCellValue("3");
		row3.createCell(1).setCellValue("Vani P");
		row3.createCell(2).setCellValue("Fullstack");
		row3.createCell(3).setCellValue("9869616219");
		row3.createCell(4).setCellValue("Balance");
		FileOutputStream io=new FileOutputStream("F:\\Templets\\Data_25.xlsx");
		book.write(io);
		book.close();
		System.out.println("done!!");
		
		
		
		
	}

}
