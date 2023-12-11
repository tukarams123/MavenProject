package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Maven_testclass2 {
	
	@Test
	public void openJioCinema() throws InterruptedException
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.jiocinema.com/");
		d.manage().window().maximize();
		System.out.println("Jio Cinema");
		Thread.sleep(2000);
		d.quit();
	}

}
