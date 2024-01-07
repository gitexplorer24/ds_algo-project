package StepDefinitions1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pom.Dslogin;
import pom.Dsstartpom;
import pom.Graphpom;
import pom.loginvalid;
import pom.maindriver;

public class graph_SD {
	    WebDriver driver;
		public static WebDriver stack;
		public Dslogin ds;
		public Dsstartpom st;
		public Graphpom gp;
		public maindriver dd;
		public loginvalid lv;

		@Given("user is in Homepage after logged in")
		public void user_is_in_homepage_after_logged_in() throws IOException {
			
			dd=new maindriver();
			driver=dd.driver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			st=new Dsstartpom(driver);
			st.start();
			lv=new loginvalid(driver);
			lv.signin_btn();
			lv.signin_username();
			lv.signin_password();
			lv.login_btn();
		   
		}

		@When("The user selects Graph item from the drop down menu and should be directed to {string} Page")
		public void the_user_selects_graph_item_from_the_drop_down_menu_and_should_be_directed_to_page(String string) {
			gp =new Graphpom(driver);
			gp.graphstart();
			gp.selectgraph();
		   
		}

		@Then("The user clicks {string} button")
		public void the_user_clicks_button(String string) throws IOException, InterruptedException {
		    gp.graphtryhere();
		    gp.graphrun();
		    gp.graphoutput();
		   
		}

		@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
		public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		    
		   
		}

		@When("The user navigates back and clicks {string} button on the GR page")
		public void the_user_navigates_back_and_clicks_button_on_the_gr_page(String string) {
		    
		   
		}

		@Then("The user clicks {string} button on GraphRepresentations page")
		public void the_user_clicks_button_on_graph_representations_page(String string) {
		    gp.graphrep();
		   
		}

		@Then("The user should be redirected to tryEditor with a Run button to test")
		public void the_user_should_be_redirected_to_try_editor_with_a_run_button_to_test() throws IOException, InterruptedException {
			 gp.graphtryhere();
			    gp.graphrun();
			    gp.graphoutput();
		   
		}



}
