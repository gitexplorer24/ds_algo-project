package pom;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dslogin {
	public WebDriver driver;

	  By signin = By.xpath("//*[text()='Sign in']");
	  By usernamesign= By.xpath("//*[@id=\"id_username\"]");
	  By passwordsign= By.xpath("//*[@id=\"id_password\"]");
	  By login=By.xpath("//div[2]/div/div[2]//input[4]");
public Dslogin(WebDriver driver) {
		this.driver=driver;
		
	 }
public void login() {
		 driver.findElement(signin).click();

	 }
public void user(String sheetname) throws IOException {
	
	FileInputStream exc= new FileInputStream(".//src/test/resources/excelfile/logincred.xlsx");
	XSSFWorkbook work= new XSSFWorkbook(exc);
	XSSFSheet sheet =work.getSheetAt(0);
	int row= sheet.getLastRowNum();
	String pwd;
	for(int r=0;r<row;r++) 
	{
		System.out.println("*****************");
	XSSFRow rr=sheet.getRow(r);
	

	XSSFCell usr=rr.getCell(0);
	try {
if(usr.getCellType() != null) {

	driver.findElement(usernamesign).sendKeys(usr.getStringCellValue());
	System.out.println("Given Username is::::::"+usr);
}

	}
	catch(Exception e)
	{

	   System.out.println("Given Username is::::::  NULL");
	   WebElement au= driver.switchTo().activeElement();
	    String d=au.getAttribute("validationMessage");
		System.out.println("*****"+d+"*** is the message screen shows in Empty field"); 
		e.getMessage();
	}
XSSFCell password=rr.getCell(1);
try {
if(password.getCellType() !=null ) {


		 pwd=password.getStringCellValue();
		 driver.findElement(passwordsign).sendKeys(pwd);
		 System.out.println("Given Password is::::::"+pwd);
}
		
		

}
catch(Exception e) {
	    e.getMessage();
	
		System.out.println("Given Password is::::::  NULL");
		WebElement au= driver.switchTo().activeElement();
	    String d=au.getAttribute("validationMessage");
		System.out.println("*****"+d+"*** is the message screen shows in Empty field"); 
}
		
		    XSSFCell message=rr.getCell(2);
	        
			System.out.println("Warning Message is::::::"+message);
			driver.findElement(login).click();
			
			}
			work.close();
 

 
}
public void signin() throws IOException {
	
	FileInputStream exc= new FileInputStream(".//src/test/resources/excelfile/logincred.xlsx");
	XSSFWorkbook work= new XSSFWorkbook(exc);
	XSSFSheet sheet =work.getSheetAt(0);
	int row= sheet.getLastRowNum();
	String pwd;
	
		System.out.println("*****************");
	XSSFRow rr=sheet.getRow(row);
  XSSFCell usr=rr.getCell(0);
	driver.findElement(usernamesign).sendKeys(usr.getStringCellValue());
	System.out.println("Given Username is::::::"+usr);
  XSSFCell password=rr.getCell(1);
	pwd=password.getStringCellValue();
	driver.findElement(passwordsign).sendKeys(pwd);
	System.out.println("Given Password is::::::"+pwd);
  
	driver.findElement(login).click();
			work.close();
 
}
}


