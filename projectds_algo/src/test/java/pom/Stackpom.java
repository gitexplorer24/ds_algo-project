package pom;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Stackpom {
	 WebDriver driver;
		WebDriverWait wait;
		By dslist=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a");
		By sstack=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[3]");
	    //By sstart= By.xpath("/html/body/div[2]/div[4]/div/div/a");
		By opt1=By.linkText("Operations in Stack");
		By opt2=By.linkText("Implementation");
		By opt3=By.linkText("Applications");
		By opt4=By.xpath("//*[text()='Practice Questions']");
		By stacktryhere= By.xpath("//*[text()='Try here>>>']");
		By stacktext= By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");
		By stackrun=By.xpath("//*[text()='Run']");
		By stackoutput=By.xpath("//*[@id=\"output\"]");
		public Stackpom(WebDriver driver) {
			this.driver=driver;
			
		}
		public WebDriver stackstart() {
			
			//wait =new WebDriverWait(driver,Duration.ofSeconds(30));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(sstart)).click();
		driver.findElement(dslist).click();	
		driver.findElement(sstack).click();
		return driver;
		}
		public void subtopics(String option) {
			String o="Operations in Stack";
			if(o.equals(option)) {
				
			driver.findElement(opt1).click();
			}
			String o1="Implementation";
			if(o1.equals(option))  {
				
				driver.findElement(opt2).click();
			}
			String o2="Applications";
			if(o2.equals(option)) {
			driver.findElement(opt3).click();
			}
			o="Practice Questions";
	if(o.equals(option)) {
		    driver.findElement(opt1).click();
			driver.findElement(opt4).click();
	}
		}
		
		public void stacktryhere() {
			driver.findElement(stacktryhere).click();
		}
		public void stackrun() throws IOException {
			FileInputStream exc= new FileInputStream(".//src/test/resources/Excel/square.xlsx");
			XSSFWorkbook work= new XSSFWorkbook(exc);
			XSSFSheet sheet =work.getSheetAt(0);
			int row= sheet.getLastRowNum();
		
			for(int r=0;r<=row;r++) 
			{
				
			XSSFRow rr=sheet.getRow(r);
			

			XSSFCell usr=rr.getCell(0);
			
		

			driver.findElement(stacktext).sendKeys(usr.getStringCellValue());
			driver.findElement(stacktext).sendKeys("\n");
			
			 }
			
			driver.findElement(stackrun).click();
			work.close();
			}
			
		
		public void stackoutput() {
			
			System.out.println("***** "+driver.findElement(stackoutput).getText());
			driver.get("https://dsportalapp.herokuapp.com/stack/");
		}
		
	}

