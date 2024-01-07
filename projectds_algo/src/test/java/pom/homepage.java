package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage {

	WebDriver driver;
	String url= "https://dsportalapp.herokuapp.com/";
	By getstartbtn=By.xpath("//*[(text( )='Get Started')]");
    By register = By.xpath("//a[text()=' Register ']");
    
    public void webpage(String url) {
    	driver.get(url);
    }
    public void getstartbtn() {
    	driver.findElement(getstartbtn).click();
    }
    public void registertab() {
    	driver.findElement(register).click();
    }
}
