package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginvalid {
	WebDriver driver;
	 String url="https://dsportalapp.herokuapp.com/home";
	 By sign_in_username = By.id("id_username");
	 By sign_in_password = By.id("id_password");
	 By sign_in_button = By.xpath("//a[text()='Sign in']");
	 By Login = By.xpath("//input[@value='Login']");
	 
	 public loginvalid(WebDriver driver) {
		 this.driver=driver;
	 }
	 public void signin_btn()
	 {
		 driver.findElement(sign_in_button).click();
	 }
	 public void signin_username() throws IOException {
		 String excelfilepath=System.getProperty("user.dir") + "/src/test/resources/excelfile/logincred.xlsx";
			File Excelfile = new File(excelfilepath);
			FileInputStream fis=new FileInputStream(Excelfile);
			try (//create a workbook object for .xlsx files
			XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
				// Get the first sheet from the workbook
				XSSFSheet sheet = workbook.getSheetAt(0);
				
				for(int i=0;i<(sheet.getPhysicalNumberOfRows())-1;i++) {
					Row row= sheet.getRow(i);
					Cell cell=row.getCell(0);
					String cellvalue =cell.getStringCellValue();
					System.out.println("The cell value is "+cellvalue);
					
				    driver.findElement(sign_in_username).sendKeys(cellvalue);	
				}
				
	 }
	 }
	public void signin_password() throws IOException {
		 String excelfilepath=System.getProperty("user.dir") + "/src/test/resources/excelfile/logincred.xlsx";
			File Excelfile = new File(excelfilepath);
			FileInputStream fis=new FileInputStream(Excelfile);
			try (//create a workbook object for .xlsx files
			XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
				// Get the first sheet from the workbook
				XSSFSheet sheet = workbook.getSheetAt(0);
				
				for(int i=1;i<sheet.getPhysicalNumberOfRows();i++) {
					Row row= sheet.getRow(i);
					Cell cell=row.getCell(0);
					String cellvalue =cell.getStringCellValue();
					System.out.println("The cell value is "+cellvalue);
					
				    driver.findElement(sign_in_password).sendKeys(cellvalue);	
				}
			}
	 }
	 public void login_btn() {
		 
		    driver.findElement(Login).click();
		 }
}
