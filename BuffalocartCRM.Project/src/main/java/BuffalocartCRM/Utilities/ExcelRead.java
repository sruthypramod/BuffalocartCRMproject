package BuffalocartCRM.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {
	public static Object[][] getDataFromExcel(String filepath,String sheetname) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		Object[][] data;
		FileInputStream input=new FileInputStream(new File(filepath));
		Workbook w=WorkbookFactory.create(input);
		Sheet s=w.getSheet(sheetname);
		int rowcount=s.getLastRowNum();
		int colomcount=s.getRow(0).getLastCellNum();
		data =new Object[rowcount][colomcount];
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<=colomcount-1;j++)
			{
				
			
			if(!getCellValue(s,0,j).equals(""))
			{
				data[i-1][j]=getCellValue(s,i,j);
			}
				
			}
		}
		return data;
	}


	public static String getCellValue(Sheet sheet, int row, int col) {
		String value="";
		if(sheet.getRow(row).getCell(col)==null)
		{
			value="";
		}else if(sheet.getRow(row).getCell(col).getCellType()==Cell.CELL_TYPE_STRING)
		{
			value=sheet.getRow(row).getCell(col).getStringCellValue();
		}
	else
	{
		sheet.getRow(row).getCell(col).setCellType(Cell.CELL_TYPE_STRING);
		value=sheet.getRow(row).getCell(col).getStringCellValue();
	}
		
	return value;
	}
}


