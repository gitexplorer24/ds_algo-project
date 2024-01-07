package pom;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;

	

	public class maindriver {
		public static WebDriver edriver=new EdgeDriver();
		 WebDriver driver;
	public maindriver() {
		driver= edriver ; 
	}
	public WebDriver driver() {
		driver.get("https://dsportalapp.herokuapp.com/"); 
		return driver;
	}
		
	}

