package ds_algo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class tree111 {
	WebDriver d2=new EdgeDriver();
	 String url="https://dsportalapp.herokuapp.com/home";
	 String url1="https://dsportalapp.herokuapp.com/graph/graph/";
	 By sign_in_username = By.id("id_username");
	 By sign_in_password = By.id("id_password");
	 By sign_in_button = By.xpath("//a[text()='Sign in']");
	 By Login = By.xpath("//input[@value='Login']");
	 By Dropdown = By.xpath("//div[@class='dropdown-menu show']");
	 
	 By selecttree =By.xpath("//a[text()='Tree']");
	public  void main(String[] args) throws InterruptedException {
		
	
	  d2.get(url);
	  d2.manage().window().maximize();
	    d2.findElement(sign_in_button).click();
	    d2.findElement(sign_in_username).sendKeys("phoenixteam");
	    d2.findElement(sign_in_password).sendKeys("phoenix123/");
	    d2.findElement(Login).click();
	    Thread.sleep(2000);
	    d2.findElement(Dropdown).click();
	    
	    d2.findElement(selecttree).click();
}
}
