package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement checkbox= driver.findElement(By.xpath("//*[@id=\"vfb-6-0\"]"));
		checkbox.click();
		Thread.sleep(2000);
		if(checkbox.isSelected()) {
			System.out.println("toggle on");
		}
		checkbox.click();
		Thread.sleep(2000);
		if(!checkbox.isSelected()) {
			System.out.println("toggle off");
		}
		else 
		{
			System.out.println("toggle on");
		}
		Thread.sleep(2000);
		
		WebElement radio1=driver.findElement(By.xpath("//*[@id=\"vfb-7-1\"]"));
		radio1.click();
		Thread.sleep(2000);
		WebElement radio2=driver.findElement(By.xpath("//*[@id=\"vfb-7-3\"]"));
		radio2.click();
		Thread.sleep(2000);
		driver.quit();

	}

}
