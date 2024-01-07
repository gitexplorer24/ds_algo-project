package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registerpage {
          WebDriver driver;
          String registerurl="https://dsportalapp.herokuapp.com/register";
          By username =By.name("username");
          By passwd=By.name("password");
          By password_confirm=By.name("password2");
          By registerbtn=By.xpath("//*[@value='Register']");
          
          public Registerpage(WebDriver driver) {
        	  this.driver=driver;
          }
          public void username() {
        	  driver.findElement(username);
          }
          public void passwd() {
        	  driver.findElement(passwd);
          }
          public void password_confirm() {
        	  driver.findElement(password_confirm);
          }
          public void registerbtn() {
        	  driver.findElement(registerbtn);
          }
}
