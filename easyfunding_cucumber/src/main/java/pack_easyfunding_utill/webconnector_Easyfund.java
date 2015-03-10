package pack_easyfunding_utill;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class webconnector_Easyfund {

	
	
	Properties OR = null; 
	Properties Config = null;
	WebDriver driver = null;
	
	public webconnector_Easyfund()
	{
		
			if(OR == null)
			{
				
				try 
				{
					OR = new Properties();
					FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\pack_easyfunding_config\\OR.properties");
					OR.load(fs);
					System.out.println(OR.getProperty("env"));
					Config = new Properties();
					fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\pack_easyfunding_config\\"+OR.getProperty("env")+"_config.properties");
					Config.load(fs);
					System.out.println(Config.getProperty("LoginURL"));
					} 
				
				catch (Exception e) {
					System.out.println("failure in Intialization");
				}
			}
		}
	
	public void browsertype(String browser)
	{
		if(browser.equals("Mozilla"))
		{
			ProfilesIni allprofiles = new ProfilesIni();
			FirefoxProfile myprof = allprofiles.getProfile("bheema");
			driver = new FirefoxDriver(myprof);
			
		}
		else if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
		
	}
	
	public void navigate(String url){
		
		driver.get(Config.getProperty("LoginURL"));
	}
	
	public void link(String objct)
	{
		String retail =OR.getProperty(objct);
		System.out.println(retail);
		driver.findElement(By.xpath(retail)).click();
	}
	public void clicking(String objct)
	{
		driver.findElement(By.xpath(OR.getProperty(objct))).click();
		System.out.println(driver.getTitle());
	}
	
/*	public void swift(String object)
	{
		Set<String> windowsid = driver.getWindowHandles();
		Iterator<String> iter = windowsid.iterator();
		String mainwindow = iter.next();
		String tabbedwindow = iter.next();
		driver.switchTo().window(tabbedwindow);
		String tabtile = driver.getTitle();
	System.out.println(driver.getTitle());
	System.out.println(OR.getProperty(object));
		if (tabtile.contains(OR.getProperty(object))) {
			System.out.println("success");
		}
		else {
			Assert.fail();
		}
	}*/
	
	public void I_enter(String object, String text) throws InterruptedException
	{
		System.out.println(OR.getProperty(object));
		String x = OR.getProperty(object);
		Thread.sleep(5000L);
		WebElement input = driver.findElement(By.xpath(x));
		Thread.sleep(5000L);
		//input.click();
		
		input.sendKeys(OR.getProperty(text));
	}
	
	public void submit(String objct)
	{
		driver.findElement(By.xpath(OR.getProperty(objct))).click();
	}
}
