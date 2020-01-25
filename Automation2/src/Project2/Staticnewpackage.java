package Project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staticnewpackage {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/tanseeqx/,,,,,,,,,,,,,,,,,,,,,/demo.html");
		//WebElelment e = driver.findElement(By.tagName("a"));
		 driver.findElement(By.id("d1")).click();
		 driver.findElement(By.name(""));
		
		
		driver.close();
		
		
		
		

	}

}
