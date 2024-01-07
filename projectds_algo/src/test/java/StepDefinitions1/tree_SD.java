package StepDefinitions1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Dsstartpom;
import pom.loginvalid;
import pom.maindriver;
import pom.pom_tree;

public class tree_SD{
	WebDriver driver;
	public static WebDriver tree;
	public loginvalid lv;
	public Dsstartpom st;
	public pom_tree tp;
	public maindriver dd;
	
	@Given("logged into home screen")
	public void logged_into_home_screen() throws IOException, InterruptedException {
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

	@When("clicks to trees from dropdownlist")
	 public void clicks_to_trees_from_dropdownlist() {
		 tp = new pom_tree(driver);
	     tree=tp.treestart();
	}

	@Then("enters into tree page")
	public void enters_into_tree_page() {
	    
	}

	@Then("user navigates to  {string}")
	public void user_navigates_to(String string) {
	    tp=new pom_tree(tree);
		tp.overviewoftrees();
	}

	@Then("The user clicks Try Here button on the Overview of Trees page and Run the phythoncode to test")
	public void the_user_clicks_try_here_button_on_the_overview_of_trees_page_and_run_the_phythoncode_to_test() throws IOException, InterruptedException {
		tp.tryhere();
		tp.TextEditor();
		tp.treeoutput();
		
	}

	@Given("The user is in the Tree page after logged in")
	public void the_user_is_in_the_tree_page_after_logged_in() {
	   
	}

	@When("The user clicks Terminologies button")
	public void the_user_clicks_terminologies_button() {
	    tp= new pom_tree(tree);
		tp.Terminologies();
	}

	@Then("The user clicks Try Here button on the Terminologies Page and Run button to test")
	public void the_user_clicks_try_here_button_on_the_terminologies_page_and_run_button_to_test() throws IOException, InterruptedException {
		tp.tryhere();
		tp.TextEditor();
		tp.treeoutput();
	}

	@When("The user clicks Types of Trees button")
	public void the_user_clicks_types_of_trees_button() {
		tp= new pom_tree(tree);
		tp.Typesoftrees();
	}

	@Then("The user clicks Try Here button on the Typesoftrees Page and Run button to test")
	public void the_user_clicks_try_here_button_on_the_typesoftrees_page_and_run_button_to_test() throws IOException, InterruptedException {
		tp.tryhere();
		tp.TextEditor();
		tp.treeoutput();
	}

	@Given("The user is in the Types of Trees page after logged in")
	public void the_user_is_in_the_types_of_trees_page_after_logged_in() {
	    tp=new pom_tree(tree);
	    
	}

	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() throws IOException, InterruptedException {
		tp.tryhere();
		tp.TextEditor();
		tp.treeoutput();
	}

	@Given("The user clicks Tree Traversals button")
	public void the_user_clicks_tree_traversals_button() {
		  tp= new pom_tree(tree);
		tp.Treetraversals();
	}

	@Then("The user should be directed to Tree Traversals Page")
	public void the_user_should_be_directed_to_tree_traversals_page() {
	   
	}

	@Then("The user clicks Try Here button on the tree traversals page and clicks  Run button to test")
	public void the_user_clicks_try_here_button_on_the_tree_traversals_page_and_clicks_run_button_to_test() throws IOException, InterruptedException {
		tp.tryhere();
		tp.TextEditor();
		tp.treeoutput();
	}

	@Given("The user clicks Traversals-Illustration button")
	public void the_user_clicks_traversals_illustration_button() {
		  tp= new pom_tree(tree);
		tp.TraversalsIllustration();
	}

	@Then("The user should be directed to Traversals-Illustration Page")
	public void the_user_should_be_directed_to_traversals_illustration_page() {
	   
	}

	@When("The user clicks {string} button Traversals-Illustration and Run the code to test")
	public void the_user_clicks_button_traversals_illustration_and_run_the_code_to_test(String string) throws IOException, InterruptedException {
		tp.tryhere();
		tp.TextEditor();
		tp.treeoutput();
	}

	@When("The user clicks Binary Trees button")
	public void the_user_clicks_binary_trees_button() {
		  tp= new pom_tree(tree);
		tp.Binarytrees();
	}

	@Then("The user clicks Try Here button on binarytree page and run the code to test")
	public void the_user_clicks_try_here_button_on_binarytree_page_and_run_the_code_to_test() throws IOException, InterruptedException {
		tp.tryhere();
		tp.TextEditor();
		tp.treeoutput();
	   
	}

	@Given("The user is in the Tree page after logged in	and clicks Types of Binary Trees button")
	public void the_user_is_in_the_tree_page_after_logged_in_and_clicks_types_of_binary_trees_button() throws IOException, InterruptedException {
		  tp= new pom_tree(tree);
		tp.TypesofBinaryTrees();
	}

	@Then("The user clicks Try Here button	on the binarytrees page having an tryEditor with a Run button to test")
	public void the_user_clicks_try_here_button_on_the_binarytrees_page_having_an_try_editor_with_a_run_button_to_test() throws IOException, InterruptedException {
		tp.tryhere();
		tp.TextEditor();
		tp.treeoutput();
	}

	@Given("The user clicks Implementation in Python button")
	public void the_user_clicks_implementation_in_python_button() {
		  tp= new pom_tree(tree);
		tp.ImplementationinPython();
	}

	@Then("The user clicks {string} button and enter thecode in tryEditor to test")
	public void the_user_clicks_button_and_enter_thecode_in_try_editor_to_test(String string) throws IOException, InterruptedException {
		tp.tryhere();
		tp.TextEditor();
		tp.treeoutput();
	}

	@Given("The user clicks Binary Tree Traversals button")
	public void the_user_clicks_binary_tree_traversals_button() {
		  tp= new pom_tree(tree);
		tp.Binarytreetraversals();
	}

	@Then("The user clicks Try Here\" button	on BinaryTreepage having an tryEditor with a Run button to test")
	public void the_user_clicks_try_here_button_on_binary_treepage_having_an_try_editor_with_a_run_button_to_test() throws IOException, InterruptedException {
		tp.tryhere();
		tp.TextEditor();
		tp.treeoutput();
	}

	@When("The user clicks Implementation of Binary Trees button")
	public void the_user_clicks_implementation_of_binary_trees_button() {
		  tp= new pom_tree(tree);
		tp.ImplementationofBinaryTrees();
	}

	@Then("The user clicks {string} button implementation page having an tryEditor with a Run button to test")
	public void the_user_clicks_button_implementation_page_having_an_try_editor_with_a_run_button_to_test(String string) throws IOException, InterruptedException {
		tp.tryhere();
		tp.TextEditor();
		tp.treeoutput();
	}

	@When("The user clicks Applications of Binary trees button and enters the page")
	public void the_user_clicks_applications_of_binary_trees_button_and_enters_the_page() {
		  tp= new pom_tree(tree);
		tp.ApplicationsofBinarytrees();
	}

	@Then("The user clicks Try Here button on applications of BTpage having an tryEditor with a Run button to test")
	public void the_user_clicks_try_here_button_on_applications_of_b_tpage_having_an_try_editor_with_a_run_button_to_test() throws IOException, InterruptedException {
		tp.tryhere();
		tp.TextEditor();
		tp.treeoutput();
	}

	@When("The user clicks Binary Search Trees button")
	public void the_user_clicks_binary_search_trees_button() {
		  tp= new pom_tree(tree);
		tp.BinarySearchTrees();
	}

	@Then("The user clicks Try Here button and redirected to a Binarysearch page having an tryEditor with a Run button to test")
	public void the_user_clicks_try_here_button_and_redirected_to_a_binarysearch_page_having_an_try_editor_with_a_run_button_to_test() throws IOException, InterruptedException {
		tp.tryhere();
		tp.TextEditor();
		tp.treeoutput();
	}

	@When("The user clicks Implementation Of BST button	and enters the page")
	public void the_user_clicks_implementation_of_bst_button_and_enters_the_page() {
		  tp= new pom_tree(tree);
		tp.implementationofbst();
	}

	@Then("The user clicks Try Here button on the page")
	public void the_user_clicks_try_here_button_on_the_page() throws IOException, InterruptedException {
		tp.tryhere();
		
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test the code")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_the_code() throws IOException, InterruptedException {
		tp.TextEditor();
		tp.treeoutput();
	}

	@Then("user clicks Practice Questions button")
	public void user_clicks_practice_questions_button() {
		
		
	}
	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		tp= new pom_tree(tree);
		tp.practicequestions();
		
	}
}
