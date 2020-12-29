package project1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qtreetechnologies.in/");
		Actions act=new Actions(driver);
		WebElement usecars=driver.findElement(By.xpath("//li[@class=\"has-children\"]//*[contains(text(),'Courses')]"));                    //driver.findElement(By.xpath("//ul[@data-track-section='MainMenu']//*[contains(text(),'USED CAR')]"));
        act.moveToElement(usecars).build().perform();
        Thread.sleep(3000);
        WebElement job=driver.findElement(By.xpath("//a[@href=\"#\"]//*[contains(text(),'Job Assured Training')]"));                    //driver.findElement(By.xpath("//ul[@data-track-section='MainMenu']//*[contains(text(),'USED CAR')]"));
        act.moveToElement(job).build().perform();
        Thread.sleep(3000);
        WebElement meanstack=driver.findElement(By.xpath("//ul[@class=\"sub-category is-hidden\"]//*[@href=\"course/mean-stack-developer-training-in-coimbatore.php\"]"));                    //driver.findElement(By.xpath("//ul[@data-track-section='MainMenu']//*[contains(text(),'USED CAR')]"));
        act.moveToElement(meanstack).build().perform();
        meanstack.click();
        //driver.quit();
		System.out.println("gopi");
		
	}

}

//a[@href="#"]//*[contains(text(),'Job Assured Training')]
//ul[@class="sub-category is-hidden"]//*[@href="course/mean-stack-developer-training-in-coimbatore.php"]
