package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Maven_testclass {
	
	@Test
	public void openGoogleMeet() throws InterruptedException
	{
		WebDriver d=new ChromeDriver();
		d.get("https://meet.google.com/");
		d.manage().window().maximize();
		System.out.println("Google meet");
		Thread.sleep(2000);
		d.quit();
	}

}
