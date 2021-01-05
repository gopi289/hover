package project2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tcktbooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		POMSpice spice= new POMSpice();
		driver.findElement(spice.from).sendKeys("coi");
		driver.findElement(spice.Fchoose);
	    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(spice.To).sendKeys("ba");
		driver.findElement(spice.Tchoose).click();
		//driver.findElement(spice.radio).click();
		//driver.findElement(spice.dates).click();
		//driver.findElement(spice.date).click();
		driver.findElement(spice.mutipleradio).click();
		driver.findElement(spice.pop).click();
		driver.findElement(spice.passenger).click();
		WebElement adult=driver.findElement(By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT\"]"));
		Select sel= new Select(adult);
		sel.selectByVisibleText("4");
		WebElement infant=driver.findElement(spice.infant);
		Select sel1= new Select(infant);
		sel1.selectByVisibleText("4");
		WebElement curr=driver.findElement(spice.currency);
		Select cur=new Select(curr);
		cur.selectByValue("AED");
		WebElement check=driver.findElement(spice.cbox);
//		check.click();
		
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//driver.quit();
		for(int i=0; i<2; i++) {
			check.click();
			System.out.println("Facebook Persists Checkbox Status is -  "+check.isSelected());
			
		}
		
		
	}
	

}
