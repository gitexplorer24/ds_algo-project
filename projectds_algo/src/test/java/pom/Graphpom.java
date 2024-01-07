package pom;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Graphpom {
	WebDriver d1;
	By dslist=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a");
	 By Dropdown = By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[6]");
	 By select_graph = By.linkText("Graph");
	 By graphtab=By.linkText("Graph Representations");
	
	 By graphtryhere= By.className("btn-info");
	 By graphtext= By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");
	 By graphrun =By.xpath("//*[text()='Run']");
	 By graphoutput=By.xpath("//*[@id=\"output\"]");
	public Graphpom(WebDriver driver) {
		this.d1=driver;
	}
	public void graphstart() {
		d1.findElement(dslist).click();
		d1.findElement(Dropdown).click();
	}
	public void  selectgraph() {
		d1.findElement(select_graph).click();
	}
	public void graphtryhere() {
		d1.findElement(graphtryhere).click();
		
	}
	public void graphrun() throws IOException, InterruptedException {
        FileInputStream exc= new FileInputStream(".//src/test/resources/excelfile/graph(1).xlsx");
		XSSFWorkbook work= new XSSFWorkbook(exc);
		XSSFSheet sheet =work.getSheetAt(0);
		int row= sheet.getLastRowNum();
	
		for(int r=0;r<=row;r++) 
		{
			
		XSSFRow rr=sheet.getRow(r);
		XSSFCell usr=rr.getCell(0);
		d1.findElement(graphtext).sendKeys(usr.getStringCellValue());
		d1.findElement(graphtext).sendKeys("\n");
	}
	work.close();
	}	

	public void graphoutput() {
		d1.findElement(graphrun).click();
		System.out.println("*****Output:: "+d1.findElement(graphoutput).getText());
		d1.get("https://dsportalapp.herokuapp.com/graph/");
		
	}
	public void graphrep() {
		d1.findElement(graphtab).click();
	}
}
