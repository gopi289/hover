package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class searchhover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cardekho.com/");
		Actions act=new Actions(driver);
		WebElement search=driver.findElement(By.xpath("//*[@id=\"cardekhosearchtext\"]"));
		search.click();
		search.sendKeys("Audi");
		search.click();
		//WebElement hover= driver.findElement(By.xpath("//*[@data-value=\"Audi<b> Q8</b>\"]"));
		 //act.moveToElement(hover).build().perform();
	     //hover.click();
		//Actions act=new Actions(driver);
		
		//driver.quit();
		System.out.println("Hi All");

	}

}
