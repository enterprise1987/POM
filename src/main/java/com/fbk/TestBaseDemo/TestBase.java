package com.fbk.TestBaseDemo;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
public static WebDriver driver;					// webDriver is a interface
public static Properties prop;					//properties is a class helps in  fetching data from properties class

public TestBase()
{
	try {
		FileInputStream ip = new FileInputStream("E:\\java\\Pom\\src\\main\\java\\com\\fbk\\configuration\\config.properties");
		prop = new Properties();
		prop.load(ip);							// to  load the file
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}

	public static void initialisation()
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty(prop.getProperty("systemproperty_1"),prop.getProperty("systemproperty_2"));
		}
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
	}

}
