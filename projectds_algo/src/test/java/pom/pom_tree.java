package pom;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;


	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class pom_tree {
		 WebDriver d2;
		
			String url="https://dsportalapp.herokuapp.com/home";
			 String url2="https://dsportalapp.herokuapp.com/tree/implementation-of-bst/";
			 By sign_in_username = By.id("id_username");
			 By sign_in_password = By.id("id_password");
			 By sign_in_button = By.xpath("//a[text()='Sign in']");
			 By Login = By.xpath("//input[@value='Login']");
			 By Dropdown = By.xpath("//div[@class='nav-item dropdown show']/a[@class='nav-link dropdown-toggle']");
			 By select_tree = By.xpath("//a[@href='tree']");
			 By Overviewoftrees= By.xpath("//a[.='Overview of Trees']");
			 By Terminologies=By.linkText("Terminologies");
			 By Typesoftrees=By.xpath("//a[text()='Types of Trees']");
			 By treetraversals = By.xpath("//a[text()='Tree Traversals']");
	    	 By TraversalsIllustration= By.xpath("//a[text()='Traversals-Illustration']");
	    	 By binarytrees=By.xpath("//div[2]/ul[6]/a");
	    	 By TypesofBinaryTrees = By.xpath("//a[text()='Types of Binary Trees']");
	    	 By ImplementationinPython=By.linkText("Implementation in Python");
	    	 By Binarytreetraversals = By.xpath("//a[text()='Binary Tree Traversals']");
	    	 By ImplementationofBinaryTrees = By.xpath("//a[text()='Implementation of Binary Trees']");
	    	 By ApplicationsofBinarytrees = By.linkText("Applications of Binary trees");
	    	 By BinarySearchTrees = By.xpath("//a[text()='Binary Search Trees']");
	    	 By Implementation_Of_BST = By.linkText("Implementation Of BST");
	    	 By Practicequestions=By.xpath("//a[.='Practice Questions']");
	    	 By Tryhere = By.xpath("//a[text()='Try here>>>']");
			 By textarea=By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");
			 By run_button= By.xpath("//button[text()='Run']");
			 By treeoutput=By.xpath("//*[@id=\"output\"]");
			 
			
			 public pom_tree(WebDriver driver){
					this.d2=driver;
				}	
				
				public WebDriver treestart() {
					
					d2.findElement(select_tree).click();
					return d2;
			
					
				}
				
				public void overviewoftrees() {
					d2.findElement(Overviewoftrees).click();
				}
				public void tryhere() {
					d2.findElement(Tryhere).click();
				}
			 public void TextEditor() throws IOException, InterruptedException {
			     String excelpath= System.getProperty("user.dir")+"/src/test/resources/excelfile/tree.xlsx";
			     File excel_file=new File(excelpath);
			     FileInputStream fis1 = new FileInputStream(excel_file);
			     try(XSSFWorkbook workbook1= new XSSFWorkbook(fis1)){
			    	 XSSFSheet excel_sheet= workbook1.getSheetAt(0);
			    	 for(int i=0;i<excel_sheet.getPhysicalNumberOfRows();i++) {
			    		 Row row= excel_sheet.getRow(i);
			    		 Cell cell= row.getCell(0);
			    		 String cellvalue11=cell.getStringCellValue();
			    		 System.out.println("The cell value is "+cellvalue11);
			    		d2.findElement(textarea).sendKeys(cell.getStringCellValue());
			    		 Thread.sleep(3000);
			    		 d2.findElement(run_button).click();
			    	 }	
			    	 workbook1.close();
			     }
			 }
			     public void treeoutput() {
			    	 d2.findElement(run_button).click();
			    	 System.out.println(" Output ::"+d2.findElement(treeoutput));
			         d2.get("https://dsportalapp.herokuapp.com/tree/");
			     }
			     public void Terminologies() {
			    	 d2.findElement(Terminologies).click();
			     }
			     public void Typesoftrees() {
			    	d2.findElement(Typesoftrees).click();
			     }
			     public void Treetraversals() {
			    	 d2.findElement(treetraversals).click();
			     }
			     public void TraversalsIllustration() {
			    	 d2.findElement(TraversalsIllustration).click();
			     }
			     public void Binarytrees() {
			    	 d2.findElement(binarytrees).click();
			     }
			     public void TypesofBinaryTrees() {
			         d2.findElement(TypesofBinaryTrees).click();
			     }
			     public void ImplementationinPython() {
			    	 d2.findElement(ImplementationinPython).click();
			     }
			     public void Binarytreetraversals() {
			    	 d2.findElement(Binarytreetraversals).click();
			     }
			     public void ImplementationofBinaryTrees() {
			    	d2.findElement(ImplementationofBinaryTrees).click(); 
			     }
			     public void ApplicationsofBinarytrees() {
			    	 d2.findElement(ApplicationsofBinarytrees).click();
			     }
			     public void BinarySearchTrees() {
			    	d2.findElement(BinarySearchTrees).click(); 
			     }
			     public void implementationofbst() {
			    	 d2.findElement(Implementation_Of_BST).click();
			     
				}
			     public void practicequestions() {
			    	 d2.get(url2);
			    	 d2.findElement(Practicequestions).click();
			     }
	}

