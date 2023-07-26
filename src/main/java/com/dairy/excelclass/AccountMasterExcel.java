package com.dairy.excelclass;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.dairy.model.mainMaster.AccountMaster;
 

public class AccountMasterExcel {
	
	private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<AccountMaster> listUsers;
     
    public AccountMasterExcel(List<AccountMaster> listUsers) {
        this.listUsers = listUsers;
        workbook = new XSSFWorkbook();
    }
 
 
    private void writeHeaderLine() {
        sheet = workbook.createSheet("AccountMaster");
         
        Row row = sheet.createRow(0);
         
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
         
        createCell(row, 0, "Account Id", style);      
        createCell(row, 1, "Account Name", style);       
        createCell(row, 2, "Account Type", style);    
        createCell(row, 3, "Group", style);
        createCell(row, 4, "Main Legger", style);
        createCell(row, 5, "Opening Balance", style);
        createCell(row, 6, "Opening Type", style);
        createCell(row, 7, "GST No", style);
        createCell(row, 8, "PAN card No", style);
        createCell(row, 9, "Aadhar Card No", style);
        createCell(row, 10, "Account Group", style);
        createCell(row, 11, "Cost Center", style);
        createCell(row, 12, "Enabled", style);
        
         
    }
     
    private void createCell(Row row, int columnCount, Object value, CellStyle style) {
        sheet.autoSizeColumn(columnCount);
        Cell cell = row.createCell(columnCount);
        if (value instanceof Integer) {
            cell.setCellValue((Integer) value);
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        }else {
            cell.setCellValue((String) value);
        }
        cell.setCellStyle(style);
    }
     
    private void writeDataLines() {
        int rowCount = 1;
 
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(14);
        style.setFont(font);
                 
        for (AccountMaster accountMaster : listUsers) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
             
            createCell(row, columnCount++, accountMaster.getId(), style);
            createCell(row, columnCount++, accountMaster.getAccountName(), style);
            createCell(row, columnCount++, accountMaster.getAccountType(), style);
            createCell(row, columnCount++, accountMaster.getAccountGroup(), style);
            createCell(row, columnCount++, accountMaster.getMainLegger(), style);
            createCell(row, columnCount++, accountMaster.getOpeningBalance(), style);
            createCell(row, columnCount++, accountMaster.getOpeningType(), style);
            createCell(row, columnCount++, accountMaster.getGstNo(), style);
            createCell(row, columnCount++, accountMaster.getPanCardNo(), style);
            createCell(row, columnCount++, accountMaster.getAadharcardNo(), style);
            createCell(row, columnCount++, accountMaster.getAccountGroup(), style);
            createCell(row, columnCount++, accountMaster.getIsCostCenterAllocated().toString(), style);
            createCell(row, columnCount++, accountMaster.isEnabled(), style);             
        }
        System.out.println();
    }
     
    public void export(HttpServletResponse response) throws IOException {
        writeHeaderLine();
        writeDataLines();
         
        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
         
        outputStream.close();
         
    }

}
