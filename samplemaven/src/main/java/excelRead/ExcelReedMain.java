package excelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReedMain {
	
	
	static FileInputStream f;//inbuilt class used to input a file
	static XSSFWorkbook w;//inbuilt class used to input a workbook
	static XSSFSheet s;//inbuilt class used to input a sheet
	
	public static String getStringData(int a,int b) throws 
IOException
	{
		f=new FileInputStream("C:\\Users\\user\\Downloads\\ObsquraExcelBook.xlsx");// go to the location were file is saved->shift+mouse right button copy as path to copy the path after that paste the same here and chang all single slashes to double slash.
		w=new XSSFWorkbook(f);//for inputing the workbook
		s=w.getSheet("Sheet1");//getsheet  is an inbuiltmethod used to get a sheet.
		XSSFRow r=s.getRow(a);//XSSFRow -inbuilt class used to input a row., getRow is an inbuilt method used to get a row,a-row index
		XSSFCell c=r.getCell(b);//XSSFCELL-inbuilt class used to input a cell,getCell is an inbuilt method to get a cell.;b-index of cell
		return c.getStringCellValue();//getStringCellValue-used to get a string value in a cell.
	}
	
	public static int getIntegerData(int a,int b) throws IOException 
		{
			f=new FileInputStream("C:\\Users\\user\\Downloads\\ObsquraExcelBook.xlsx");// go to the location were file is saved->shift+mouse right button copy as path to copy the path after that paste the same here and chang all single slashes to double slash.
			w=new XSSFWorkbook(f);//for inputing the workbook
			s=w.getSheet("Sheet1");//getsheet  is an inbuiltmethod used to get a sheet.
			XSSFRow r=s.getRow(a);//XSSFRow -inbuilt class used to input a row., getRow is an inbuilt method used to get a row,a-row index
			XSSFCell c=r.getCell(b);
			//type casting -conversion of the datatype into anonther one.Since by default java provides double values from cell.
			int y=(int) c.getNumericCellValue();//c.getNumericCellValue()-will get the value from c and (int) will do the conversion from double to int)
			return y;
		}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println(ExcelReedMain.getStringData(1, 0));
		System.out.println(ExcelReedMain.getIntegerData(1, 1));

	}

}
