package testng1file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestBase {

	WebDriver driver;
@Test
public void Login() throws IOException, InterruptedException
{
	Properties prop =new Properties();
	
	FileInputStream fis=new FileInputStream("C:/Users/abhishek.goyal2/workspace/RuFramework/src/datadriven.properties");
	prop.load(fis);
	System.out.println(prop.getProperty("email"));
	
	if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
	{
		 driver=new FirefoxDriver();
		 System.out.println("pass");
	}
	
	if(prop.getProperty("browser")=="chrome")
	{
	 driver=new ChromeDriver();
	}
	
	driver.get(prop.getProperty("url"));
	
	if (prop.getProperty("browser")=="IE")
{
	 driver=new InternetExplorerDriver();
	}
	Thread.sleep(200);

	
	driver.quit();
	
}

}
