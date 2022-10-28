package com.apexit.Excel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

public class ReadExcelData {
	public ReadExcelData() throws Exception{
		super();
	}
	private InputStream oFileReader;
	private Workbook oExcelWorkbook;
	private String sExcelFileName;
	ExcelApiFile file1=new ExcelApiFile("Keurig.xlsx");

	public  Object[][] createArrayData(String sFileName,String sSheetName){

		String dataArray[][]=null;
		openExcelWorkbook(sFileName);
		int rows=getRowCountOfSheet(sSheetName);
		int cells=getCellCount(sSheetName,1);
		dataArray=new String[rows][cells];		
		for (int i=1;i<=rows;i++) {
		
		for (int j=1;i<=cells;j++) {
	   dataArray[i][j]=getCellDatawithoutcol(sSheetName,i,j);
        System.out.print(dataArray[i][j]);
		}
	    }
           return dataArray;
        }
	
	public void openExcelWorkbook(String sFileName) {
		try {
			oFileReader =new FileInputStream(sFileName);
			oExcelWorkbook=WorkbookFactory.create(oFileReader);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    }
	
	public int getRowCountOfSheet(String sSheetName) {
		
		try {
			Sheet oSheet;
			oSheet=oExcelWorkbook.getSheet(sSheetName);
				return oSheet.getPhysicalNumberOfRows();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	    }
	
	public int getCellCount(String sSheetName,int iRow) {
		try {
		Sheet oSheet;
		oSheet=oExcelWorkbook.getSheet(sSheetName);
        Row oRow;
        oRow=oSheet.getRow(iRow);
        return oRow.getLastCellNum();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}
		public String getCellDatawithoutcol(String sSheetName, int iRow, int iCell)
	    {
	        try
	        {
	        	Sheet oSheet;
	    		oSheet=oExcelWorkbook.getSheet(sSheetName);
	            Row oRow;
	            oRow=oSheet.getRow(iRow);
	            Cell oCell;
	            oCell=oRow.getCell(iCell);
	          /* if(oCell==null) {
	          return "";
	           } else {
	        	   if(oCell.getCellType() == CellType.NUMERIC) {
	           
	                return  String.valueOf((long) oCell.getNumericCellValue());
	           }   else {
	                return oCell.getStringCellValue();
	           }*/
	            if(oCell.getCellType() == CellType.STRING)
	                return oCell.getStringCellValue();
	            else if(oCell.getCellType() == CellType.NUMERIC || oCell.getCellType() == CellType.FORMULA)
	            {
	                String cellValue = String.valueOf(oCell.getNumericCellValue());
	                if(DateUtil.isCellDateFormatted(oCell))
	                {
	                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	                    Date date = oCell.getDateCellValue();
	                    cellValue = df.format(date);
	                }
	                return cellValue;
	            }else if(oCell.getCellType() == CellType.BLANK)
	                return "";
	            else
	                return String.valueOf(oCell.getBooleanCellValue());
	           
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	            Assert.fail("row "+iRow+" or column "+iCell +" does not exist in Excel");
	            return "row "+iRow+" or column "+iCell +" does not exist  in Excel";
	        }
	    
	 
	    }
}
        
        
        
		
		
	
             

	
	
	 