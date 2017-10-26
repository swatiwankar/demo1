package demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

		@Test
		public void searchongooge() throws Exception
		{

		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", " C:\\Users\\hp\\Desktop\\Jar\\Driver\\chromedriver_win32\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("http://www.google.com");
		    driver.findElement(By.name("q")).sendKeys("Selenium");
		    /*Thread.sleep(1500L);
		    driver.findElement(By.className("lsb")).click();
		    Thread.sleep(1500L);
		    List<WebElement> linkElements = driver.findElements(By.xpath("//h3[@class='r']/a"));
		    System.out.print(linkElements.size());
		     for(int i=0;i<linkElements.size();i++)
		        {
		            String text = linkElements.get(i).getText();
		            driver.findElement(By.linkText(text)).click();
		            Thread.sleep(2000L);
		            System.out.println("Title of link\t:\t" + driver.getTitle());
		            Thread.sleep(2000L);
		            driver.navigate().back();
		           linkElements = driver.findElements(By.xpath("//h3[@class='r']/a"));*/
		//}
		     driver.close();
		     
		     
		}

}
