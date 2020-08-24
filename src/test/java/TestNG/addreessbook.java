package TestNG;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addreessbook {

	ChromeDriver driver;
	
	@BeforeMethod
	public void launch()
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\users\\hp\\Downloads\\cd\\chromedriver.exe");
   	    driver = new ChromeDriver();		
		driver.manage().window().maximize();
	    driver.get("http://34.87.45.231:8081/addressbook/");	
	}
  @Test
  public void veifySaveMethod() 
  {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.xpath(("//div[@class='v-button v-widget']"))).click();
	  driver.findElement(By.id(("gwt-uid-5"))).sendKeys("Sandeep");
	  driver.findElement(By.id(("gwt-uid-7"))).sendKeys("Beniwal");
	  driver.findElement(By.id(("gwt-uid-9"))).sendKeys("7777777777");
	  driver.findElement(By.id(("gwt-uid-11"))).sendKeys("sandeep@gyf.com");
	  driver.findElement(By.id(("gwt-uid-13"))).sendKeys("6/12/1978");
	  driver.findElement(By.xpath(("//div[@class='v-button v-widget primary v-button-primary']"))).click();
	  
  }

  @AfterMethod
  public void Close()
  {
	  //driver.close();
  }
}
