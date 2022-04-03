package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Admin_Login {
	@Test
	public void Login () throws Throwable {
		System.out.println("Hello");
	
	
	
		
/*	
//	public static void main(String[] args) throws Throwable {
//		// TODO Auto-generated method stub
//		
//		//invoking Browser
//		//Chrome-Chromedriver  ->> Methods close get
//		//Webdriver close get
//		//Webdriver methods + class methods
//		//chromedriver.exe->>Invoke Chrome browser
*///		
		System.setProperty("webdriver.chrome.driver", "D:\\SUREBOT_AN\\Surebot Selenium\\Selenium 2020-12\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://shlok-uat.surebotdev.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("superadmin@gmail.com");
	    driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin@123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//p[normalize-space()='Manage Sub-Admin']")).click();
	    Thread.sleep(2000);
	    //driver.findElement(By.xpath("//input[@name='image']")).clear();
	    WebElement browse = driver.findElement(By.xpath("//input[@name='image']"));
	    //click on ‘Choose file’ to upload the desired file
	    browse.sendKeys("C:\\Users\\AnupaKumar\\Desktop\\teacher.jpg"); //Uploading the file using sendKeys
	    System.out.println("File is Uploaded Successfully");
	    Thread.sleep(5000);
	    //driver.findElement(By.xpath("//input[@name='image']")).click();
	    driver.quit();
	    /*driver.findElement(By.xpath("//a[@href='/manageStudents/']//p")).click();
	    driver.findElement(By.xpath("//a[normalize-space()='View Student']")).click();
	    Thread.sleep(5000);
	    // driver.findElement(By.xpath("//body/div/div/section/div/div/div/div/div/div/div/div/div[1]/select[1]")).click();
		 //driver.findElement(By.xpath("(//select)[1]")).click();
			//String url=driver.getCurrentUrl();
			WebElement staticdropdown=driver.findElement(By.xpath("//body/div/div/section/div/div/div/div/div/div/div/div/div[1]/select[1]"));		
			staticdropdown.click();	
			
			Select dropdown=new Select(staticdropdown);
			//String url1=driver.getCurrentUrl();
		    dropdown.selectByIndex(1);
		    Thread.sleep(20000);
			System.out.println(dropdown.getFirstSelectedOption().getText());
			
			WebElement Classdropdown=driver.findElement(By.xpath("//select[@name='Class_ID']"));
			
			Classdropdown.click();
			Thread.sleep(12000);
			Select classdrop=new Select(Classdropdown);
		    classdrop.selectByIndex(5);
		    System.out.println(classdrop.getFirstSelectedOption().getText());
		    Thread.sleep(30000);
		    
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,400)", "");
		    //driver.findElement(By.xpath("//tbody/tr[3]/td[9]/a[1]/i[1]")).click();
		    //driver.findElement(By.xpath("//section//li[6]//a[1]")).click();
		    System.out.println("o1k");
		   // Thread.sleep(20000);
	    	//driver.findElement(By.xpath("//li[@id='example3_next']//a[@href='#']")).click();
	    	//System.out.println("o2k");
	    	//driver.findElement(By.xpath("//li[@id='example3_next']//a[@href='#']")).click();
	    	//Thread.sleep(20000);
		    for (int i = 1; i <=  driver.findElements(By.xpath("//i[@class='fa fa-edit']")).size() ; i++) {
		    	
				
		    	
		    	driver.findElement(By.xpath("//a[text()=' View Student']")).click();
		    	Thread.sleep(5000);
		    	 JavascriptExecutor js1 = (JavascriptExecutor) driver;
				 js1.executeScript("window.scrollBy(0,300)", "");
		    //	driver.findElement(By.xpath("//a[@data-dt-idx=\"2\"]")).click();
		    	
		    	//Thread.sleep(20000);
		    	
		    	driver.findElement(By.xpath("(//i[@class='fa fa-edit'])["+i+"]")).click();
		    	
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//input[@id='Edit_Father_Check']")).click();
		    	System.out.println("Checkbox is clickable");
		    	Thread.sleep(15000);
				
				
				 * Point hoverItem
				 * =driver.findElement(By.xpath("//input[@key='relationship_name']")).
				 * getLocation();
				 * 
				 * //
				 * driver.findElement(By.xpath(" //input[@key='relationship_name']")).click();
				 * 
				 * ((JavascriptExecutor)driver).executeScript("return window.title;");
				 * 
				 * Thread.sleep(6000);
				 * 
				 * ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,"+(hoverItem.
				 * getY())+");");
				 * 
				 * // Adjust your page view by making changes right over here (hoverItem.getY()
				 * -400);
				 
		
		    	
		    
				 
				
				  
				  
	
		    	driver.findElement(By.xpath("//input[@key='relationship_name']")).sendKeys("sohail");
		    	System.out.println("Father Name Added Successfully");
		    	//Thread.sleep(2000);
		    	driver.findElement(By.xpath("//input[@key='email']")).clear();
		    	driver.findElement(By.xpath("//input[@key='email']")).sendKeys("soh@gmail.com");
		    	System.out.println("Father Email Added Successfully");
		    	//Thread.sleep(2000);
		   
		    	driver.findElement(By.xpath("//input[@key='contact_number']")).sendKeys("8882229155");
		    	System.out.println("Father Contact Added Successfully");
		    	
		    	
		    	
				
				 * if(i==1)
				 * driver.findElement(By.xpath("//input[@key='contact_number']")).sendKeys(
				 * "8882229990"); else if(i==2)
				 * driver.findElement(By.xpath("//input[@key='contact_number']")).sendKeys(
				 * "35453"); else if(i==3)
				 * driver.findElement(By.xpath("//input[@key='contact_number']")).sendKeys(
				 * "435334434");
				 
		    	
		    	
		    	Thread.sleep(2000);
		    	WebElement selectPrimaryContactDD = driver.findElement(By.xpath("//select[@id='Edit_Primary_List_ID']"));
		    	Select s = new Select(selectPrimaryContactDD);
		    	s.selectByValue("Father");
		    	Thread.sleep(5000);
                driver.findElement(By.xpath("//button[normalize-space(text())='Update']")).click();
		    	
		    	Thread.sleep(30000);
				
				 * driver.findElement(By.xpath("//section//li[6]//a[1]")).click();
				 * System.out.println("o3k");
				 * driver.findElement(By.xpath("//li[@id='example3_next']//a[@href='#']")).click
				 * (); System.out.println("o4k");
				 * driver.findElement(By.xpath("//li[@id='example3_next']//a[@href='#']")).click
				 * ();
				 
		    	Thread.sleep(5000);
		    }
		   // 	driver.findElement(By.xpath("//a[@data-dt-idx=\"2\"]")).click();
		    	 for (int e = 1; e <=  driver.findElements(By.xpath("//i[@class='fa fa-edit']")).size() ; e++) {
						
		    		 driver.findElement(By.xpath("//a[@data-dt-idx=\"2\"]")).click();
				    //	driver.findElement(By.xpath("//a[text()=' View Student']")).click();
				    	Thread.sleep(3000);
				    	driver.findElement(By.xpath("(//i[@class='fa fa-edit'])["+e+"]")).click();
				    	driver.findElement(By.xpath("//input[@id='Edit_Father_Check']")).click();
				    	Thread.sleep(10000);
	                    String fname= driver.findElement(By.xpath("//input[@key='relationship_name']")).getAttribute("value");
				    	
				    	System.out.println("Ftaher name is " + fname);
				
				    	Thread.sleep(2000);
				    	
				    	String fmail=driver.findElement(By.xpath("//input[@key='email']")).getAttribute("value");
				    	System.out.println("Ftaher email is " + fmail);
				    	Thread.sleep(2000);
				    	String fconact=driver.findElement(By.xpath("//input[@key='contact_number']")).getAttribute("value");
				    	System.out.println("Ftaher email is " + fconact);
				    	driver.findElement(By.id("closemodal")).click();
				    	Thread.sleep(2000);
				    	
				    	 Thread.sleep(2000);
				 		 driver.quit();
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
					
					 * if (
					 * driver.findElement(By.xpath("//input[@id='Edit_Father_Check']")).isEnabled())
					 * {
					 * 
					 * driver.findElement(By.xpath("//input[@id='Edit_Father_Check']")).click();
					 * Thread.sleep(10000);
					 * driver.findElement(By.xpath("//input[@key='relationship_name']")).sendKeys(
					 * "Anoop"); Thread.sleep(2000);
					 * driver.findElement(By.xpath("//input[@key='email']")).sendKeys(
					 * "Anoop@gmail.com"); Thread.sleep(2000);
					 * 
					 * if(i==1)
					 * driver.findElement(By.xpath("//input[@key='contact_number']")).sendKeys(
					 * "8882229990"); else if(i==2)
					 * driver.findElement(By.xpath("//input[@key='contact_number']")).sendKeys(
					 * "35453"); else if(i==3)
					 * driver.findElement(By.xpath("//input[@key='contact_number']")).sendKeys(
					 * "435334434");
					 * 
					 * 
					 * Thread.sleep(2000); WebElement selectPrimaryContactDD =
					 * driver.findElement(By.xpath("//select[@id='Edit_Primary_List_ID']")); Select
					 * s = new Select(selectPrimaryContactDD); s.selectByValue("Father");
					 * Thread.sleep(5000); }
					 
		    	
					
					 * driver.findElement(By.xpath("//button[normalize-space(text())='Update']")).
					 * click();
					 * 
					 * Thread.sleep(15000);
					 
			
		
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
			
			
			  driver.findElement(By.xpath("//i[@class='fa fa-edit']")).click();
			  
			  Point hoverItem
			  =driver.findElement(By.xpath("(//input[@value='Father'])[2]")).getLocation();
			  
			  driver.findElement(By.xpath(" //input[ @id='Edit_Father_Check']")).click();
			  
			  ((JavascriptExecutor)driver).executeScript("return window.title;");
			  
			  Thread.sleep(6000);
			  
			  ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,"+(hoverItem.
			  getY())+");");
			  
			  // Adjust your page view by making changes right over here
			  (hoverItem.getY()-400)
			  driver.findElement(By.xpath("//form[@role='form']//input[@value='Father']")).
			  click(); Thread.sleep(2000);
			  driver.findElement(By.xpath("(//input[@key='relationship_name'])[1]")).
			  sendKeys("Rahul");
			  driver.findElement(By.xpath("//input[@key='email']")).sendKeys(
			  "Rahul@mail.com"); driver.findElement(By.xpath(
			  "//form[@role='form']//div//div//div//input[@type='tel']")).sendKeys(
			  "9658695845"); WebElement pcontactdropdown=driver.findElement(By.xpath(
			  "//body/div/div[contains(@data-toggle,'modal')]/div/div/div/div/form[contains(@role,'form')]/div/select[1]"
			  )); Thread.sleep(13000); pcontactdropdown.click(); Select pcontdrop=new
			  Select(pcontactdropdown); pcontdrop.selectByIndex(1);
			  System.out.println(pcontdrop.getFirstSelectedOption().getText());
			  driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
			 
			 
		    
		    
	    
//	    driver.findElement(By.xpath(" //body/div/div/aside/div/nav[@id='superadmin']/ul[@role='menu']/li[7]/a[1]/p[1]")).click();
//	    Thread.sleep(3000);
//	    driver.findElement(By.xpath("//a[@href='/managepayment/']//p")).click();
//	    System.out.println(driver.getTitle());
//	   // driver.findElement(By.xpath("//select[@id='Branch_ID']")).click();
//	  //  driver.findElement(By.xpath("(//select)[1]")).click();
//		String url=driver.getCurrentUrl();
//		WebElement staticdropdown=driver.findElement(By.xpath("(//select)[1]"));		
//		staticdropdown.click();		
//		Select dropdown=new Select(staticdropdown);
//		String url1=driver.getCurrentUrl();
//		dropdown.selectByIndex(3);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		WebElement Classdropdown=driver.findElement(By.xpath("//select[@id='Class_List']"));
//		Thread.sleep(3000);
//		Classdropdown.click();
//		Select classdrop=new Select(Classdropdown);
//	    classdrop.selectByIndex(9);
//	    System.out.println(classdrop.getFirstSelectedOption().getText());
//	    driver.findElement(By.xpath("//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div[3]//input[1]")).sendKeys("Automation std");
//	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Automation std");
//	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sb@mail.com");
//	    driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("6532548548");
//	    WebElement categorydropdown=driver.findElement(By.xpath("//div[7]//select[1]"));
//		Thread.sleep(3000);
//		categorydropdown.click();
//		Select ctgdrdwn=new Select(categorydropdown);
//		ctgdrdwn.selectByIndex(4);
//	    System.out.println(ctgdrdwn.getFirstSelectedOption().getText());
//	    JavascriptExecutor js = (JavascriptExecutor)driver;
//	    js.executeScript("window.scrollBy(0,600)");

	  //
	    
	 
		
	    Thread.sleep(5000);
		driver.quit();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("input[placeholder=' Email ']")).sendKeys("superadmiwwn@gmail.com");
//		driver.findElement(By.linkText("Forgot Password?")).click();
//		driver.findElement(By.id("Email")).clear();
//		driver.findElement(By.id("Email")).sendKeys("driver.findElement(By.id(\"Email\"))");
//	
//		driver.findElement(By.xpath("//button[@class='genarateOtp btn btn-primary  btn-flat']")).click();
	}*/
}
}
