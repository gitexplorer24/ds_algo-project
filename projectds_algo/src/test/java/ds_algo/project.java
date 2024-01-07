package ds_algo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class project {
public static void main(String[] args) {
	WebDriver d=new EdgeDriver();

	//Invalid1
	
	//String pwd2val;
	d.navigate().to("https://dsportalapp.herokuapp.com/home");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	d.findElement(By.xpath("//div[2]/ul/a[2]")).click();
	WebElement usrname=d.findElement(By.id("id_username"));
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	usrname.sendKeys("");
	WebElement pwd1 = d.findElement(By.id("id_password1"));
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	pwd1.sendKeys(" ");
	usrname.getAttribute("value");
	pwd1.getAttribute("value");
	System.out.println("The value in username textbox is "+usrname.getAttribute("value"));
	System.out.println("The value in password textbox is "+pwd1.getAttribute("value"));
	d.findElement(By.xpath("//*[@value='Register']")).click();
	   
	   
	   //Invalid2
	   if(usrname.getAttribute("value").isEmpty()|| pwd1.getAttribute("value").isEmpty()) {
		   WebElement activeElement = d.switchTo().activeElement();
		   String msgStr=activeElement.getAttribute("validationMessage");
		   System.out.println("Error message appeared on webpage is:"+msgStr);
	   }
			
	 //Invalid3
	   usrname.sendKeys("Siri1234");
		pwd1.sendKeys("    ");
		pwd1.getAttribute("value");
		System.out.println("The value in username textbox is "+usrname.getAttribute("value"));
		System.out.println("The value in the password textbox is "+pwd1.getAttribute("value")); 
			if((usrname.getAttribute("value"))!=null || (pwd1.getAttribute("value"))==null) {
				d.findElement(By.xpath("//*[@value='Register']")).click();
				WebElement activeElement1 = d.switchTo().activeElement();
				String msgStr1=activeElement1.getAttribute("validationMessage");
				System.out.println("Error message displayed on webpage is"+msgStr1);
             }
	//invalid4--user_enters_username_and_password()and gets active element error for password confirmation
			usrname.clear();
			usrname.sendKeys("siri1234");
			pwd1.sendKeys("@abc1234");
			WebElement pwd2=d.findElement(By.id("id_password2"));
			pwd2.sendKeys(" ");
			if((usrname.getAttribute("value"))!=null &&
					(pwd1.getAttribute("value")!=null)&&
					(pwd2.getAttribute("value")==null)) {
				d.findElement(By.xpath("//*[@value='Register']")).click();
			WebElement activeElement2 = d.switchTo().activeElement();
			String msgStr2=activeElement2.getAttribute("validationMessage");
			System.out.println("Error message displayed on webpage is"+msgStr2);
			}

	//invalid5---user enters user name with invalid characters
			usrname.clear();
		    usrname.sendKeys("siri*$123");
		    String usrval=usrname.getAttribute("value");
		    String specialcharacters="[^a-zA-Z0-9]";
		    if(usrval.matches(specialcharacters)) {
		    	System.out.println("Username must not allow any special characters");
}
		    //Invalid 6---error:password less than {int} characters
		    pwd1.clear();
		    pwd1.sendKeys("abc12");
		    String pwd1val=pwd1.getAttribute("value");
		    if(pwd1val.length()< 8) {
		    	System.out.println("password must have atleast 8 characters");
		    }
   //invalid7---user enters user name and password with only numbers
		    pwd1.clear();
			pwd1.sendKeys("01234567");
		    if(pwd1.getAttribute("value").matches("\\d+")) {
		    	System.out.println("Password cant have only numeric values");
		    }
		    //invalid8---error: user enters different password and password confirmation
		    usrname.clear();
		    pwd1.clear();
		    pwd2.clear();
		    pwd1.sendKeys("@abc123");
		    pwd2.sendKeys("@abc123456");
		    if(pwd1.getAttribute("value")!=pwd2.getAttribute("value")) {
		    	System.out.println("Password Mismatch");
		    }
		    
//valid-----user enters the user name password and enters the password confirmation
		    usrname.clear();
		    pwd1.clear();
		    pwd2.clear();
		    usrname.sendKeys("siri1234");
		    pwd1.sendKeys("@abc1234");
		    pwd2.sendKeys("@abc1234");
		    d.findElement(By.xpath("//*[@value='Register']")).click();
		    System.out.println("Account Created");
}
}
