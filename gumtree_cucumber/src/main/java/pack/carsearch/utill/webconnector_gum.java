package pack.carsearch.utill;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class webconnector_gum {

	Properties OR = null;
	Properties Config = null;
	WebDriver driver = null;
	
	
	public webconnector_gum()
	{
		if(OR == null)
		{
			
			try 
			{
				OR = new Properties();
				FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "\\main\\java\\pack\\carsearch\\config\\OR.properties");
				OR.load(fs);
				
				Config = new Properties();
				fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\pack\\carsearch\\config\\"+OR.getProperty("env")+"_config.properties");
				Config.load(fs);
				
				System.out.println(OR.getProperty("env"));
				System.out.println(Config.getProperty("LogingURL"));
			}
			catch (Exception e) 
			{
				System.out.println("Initialization failure");
			}
			
		}
	
		
	}
	
	public void openbrowser(String browsertype)
	
	{
		if(browsertype == "Mozilla")
		{
			driver = new FirefoxDriver();
		}
		else if(browsertype == "Chrome")
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	public void navigate(String url)
	{
		driver.get(Config.getProperty(url));
	}
	
	public void pass_param(String Obct, String text)
	{
		driver.findElement(By.xpath(OR.getProperty(Obct))).sendKeys(text);
	}
	
	public void click_on(String done){
		driver.findElement(By.xpath(OR.getProperty(done))).click();
	}
}
