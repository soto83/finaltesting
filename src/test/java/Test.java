import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;

public class Test {
	WebDriver driver;

	public Test() {
		//System.writeln("Hello")
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
        this.driver = new ChromeDriver();

        driver.get("https://techfios.com/test/105/");
       
	}
	
	public void TestTitle() {
		Assert.assertEquals("Software Test Academy", driver.getTitle(), "Title check failed!");
	}
	
	
}