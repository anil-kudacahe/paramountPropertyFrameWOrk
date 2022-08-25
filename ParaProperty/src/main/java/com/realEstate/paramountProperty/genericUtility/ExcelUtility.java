package com.realEstate.paramountProperty.genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	/**
	 * it is used to read the data from excel workbook based on below 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Throwable
	 */
	
    public String getExcelData(String sheetName,int rowNum, int cellNum  )throws Throwable
     {
    	//String IConstants_EXCELPATH = "C:\\Users\\DELL\\eclipse-workspace\\ParaMountProperty_SeleniumFramework\\ConnanData\\ProjectTestData.xlsx";
	   FileInputStream fis= new FileInputStream(IConstants.EXCELPATH);
			   Workbook wb= WorkbookFactory.create(fis);
	             Sheet sh = wb.getSheet(sheetName);
	             Row row = sh.getRow(rowNum);
	             Cell cell = row.getCell(cellNum);
	             String data = cell.toString();
	             return data;          
     }
    
    /**
     * used to get the last used row number on specified on specified sheet
     * @param sheetName
     * @param rowNum
     * @param cellNum
     * @return
     * @throws Throwable
     */

    public int getRowCount(String sheetName, int rowNum, int cellNum )throws Throwable
     {
    	//String IConstants_EXCELPATH = "C:\\Users\\DELL\\eclipse-workspace\\ParaMountProperty_SeleniumFramework\\ConnanData\\ProjectTestData.xlsx";
	   FileInputStream fis= new FileInputStream(IConstants.EXCELPATH);
			   Workbook wb= WorkbookFactory.create(fis);
	             Sheet sh = wb.getSheet(sheetName);
	            wb.close();
	             return sh.getLastRowNum();          
      }
    
    /**
     * used to write data into Excel based on below parameter
     * @param sheetName
     * @param rowNum
     * @param cellNum
     * @param data
     * @throws Throwable
     */
    
    public void setDataExcel(String sheetName, int rowNum, int cellNum, String data )throws Throwable
    {
    	//String IConstants_EXCELPATH = "C:\\Users\\DELL\\eclipse-workspace\\ParaMountProperty_SeleniumFramework\\ConnanData\\ProjectTestData.xlsx";
	   FileInputStream fis= new FileInputStream(IConstants.EXCELPATH);
			   Workbook wb= WorkbookFactory.create(fis);
	             Sheet sh = wb.getSheet(sheetName);
	             Row row = sh.createRow(rowNum);
	             Cell cell = row.createCell(cellNum);
	             cell.setCellValue(data);
	             FileOutputStream fos= new FileOutputStream(IConstants.EXCELPATH);
	             wb.write(fos);
	             wb.close();
	                   
    }

    
}
