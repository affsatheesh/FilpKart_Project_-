package commonFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pageObjectFile.EveryIdems_Functions;
import testCase.Electronics_Item;

public class CommonFunction 
{
	public static Properties properties=null;
	public static WebDriver driver=null;
	public static String fatherwindow=null;

	public Properties fitchProperty() throws IOException
	{
		FileInputStream fileinputstream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileinputstream);
		return properties;
	}
	@BeforeSuite
	public void Browserlauncher() throws IOException
	{
		fitchProperty();
		String browser  =	properties.getProperty("Browser");
		String url      =	properties.getProperty("Url");
		String driverlocation = properties.getProperty("DriverLocation");

		if (browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",driverlocation);
			driver=new ChromeDriver();
			fatherwindow = driver.getWindowHandle();
		}
		else if (browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", driverlocation);
			driver=new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void Browserclose()
	{
		//driver.quit();
	}

}