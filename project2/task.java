package project2;



import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class task {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://book.theautomatedtester.co.uk/chapter1");
		System.out.println("pass");
		radiobutton(driver);
		drop(driver);
		checkbox(driver);
		home(driver);
		chapter2(driver);
		verifyButton(driver);
		verify2(driver);
		HOMEPAGE2(driver);
		HOMEPAGE4(driver);
		hov(driver);
		//alertbox(driver);
		
		

	}
	public static void radiobutton(WebDriver driver)
	{
		taskPom task=new taskPom();
		driver.findElement(task.radio).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void drop(WebDriver driver)
	{
		taskPom task=new taskPom();
		Select sel=new Select(driver.findElement(task.dropdown));
		sel.selectByVisibleText("Selenium Core");
		
	}
	public static void checkbox(WebDriver driver)
	{
		taskPom task=new taskPom();
		if(driver.findElement(task.cbox).isDisplayed()) 
		{
			driver.findElement(task.cbox).click();
		
		}
		
	}
	public static void home(WebDriver driver)
	{
		taskPom task=new taskPom();
		if(driver.findElement(task.homepage).isEnabled())
		{
			driver.findElement(task.homepage).click();
			System.out.println("pass2");
		}
	}
	public static void chapter2(WebDriver driver)
	{
		taskPom task=new taskPom();
		if(driver.findElement(task.chap2).isEnabled())
		{
			driver.findElement(task.chap2).click();
		}
	}
	public static void verifyButton(WebDriver driver)
	{
		taskPom task=new taskPom();
		if(driver.findElement(task.verifybuton).isEnabled())
		{
			driver.findElement(task.verifybuton).click();
			System.out.println("pass3");
		}else 
		{
			System.out.println("Fail");
		}
	}
	public static void verify2(WebDriver driver)
	{
		taskPom task=new taskPom();
		if(driver.findElement(task.verifybutton2).isEnabled())
		{
			driver.findElement(task.verifybutton2).click();
			System.out.println("pass. Retrun:" +driver.findElement(task.verifybutton2).isEnabled() );
		}else 
		{
			System.out.println("Fail");
		}
	}
	public static void HOMEPAGE2(WebDriver driver)
	{
		taskPom task=new taskPom();
		driver.findElement(task.homepage2).click();
		
	}
	public static void HOMEPAGE4(WebDriver driver)
	{
		taskPom task=new taskPom();
		driver.findElement(task.chap4).click();
		
	}
	
//	public static void alertbox(WebDriver driver)
//	{
//		taskPom task=new taskPom();
//		
//		if(driver.findElement(task.alertbox).isEnabled())
//		{
//			driver.findElement(task.alertbox).sendKeys("Gopi");	
//			Alert alert=driver.switchTo().alert();
//			String alertMessage=driver.switchTo().alert().getText();
//			System.out.println("alertMessage");
//			alert.accept();
//		}
//	}
	
	public static void hov(WebDriver driver) throws InterruptedException
	{
		taskPom task=new taskPom();		
		if(driver.findElement(task.hover).isEnabled())
		{
			Actions actions = new Actions(driver);
			WebElement act=driver.findElement(task.hover);
			actions.moveToElement(act).perform();
			Thread.sleep(3000);
			Alert alert=driver.switchTo().alert();
			alert.accept();
			System.out.println("pass4");
			
		}else 
		{
			System.out.println("fail");
		}
		
	}

}


//no such element: Unable to locate element:
//Exception in thread "main" org.openqa.selenium.NoAlertPresentException: no such alert
