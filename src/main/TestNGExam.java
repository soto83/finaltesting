import org.testng.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;


public class TestNGExam {
	
	WebDriver driver;

	public TestNGExam() {
		//System.writeln("Hello")
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
        this.driver = new ChromeDriver();

        driver.get("https://techfios.com/test/102/");
       
	}
  // Question 1
  //@Test
	public void validate_remove() {
		WebElement e = driver.findElement(By.cssSelector("input[value=\"Add category\"]"));
		//toggle_all_checkbox.click();
		e.click();
		System.out.print("Will be printed");
	}
	
  //@BeforeTest
  public void sendQuestion1Data() {
	  WebElement e = driver.findElement(By.cssSelector("input[name=categorydata]"));
	  e.sendKeys("SOTO");
  
  }
  // Question 2
  //@Test
 	public void category_duplicate() {
 		WebElement e = driver.findElement(By.cssSelector("input[value=\"Add category\"]"));
 		//toggle_all_checkbox.click();
 		e.click();
 	}
 	
   //@BeforeTest
   public void sendQuestion2Data() {
 	  WebElement e = driver.findElement(By.cssSelector("input[name=categorydata]"));
 	  e.sendKeys("SOTO");
   
   }
   
   // Question 3
   @Test
  	public void validate_month() {
  		WebElement e = driver.findElement(By.cssSelector("select[name=due_month]"));
  		//toggle_all_checkbox.click();
  		e.click();
  	}
  	
}
