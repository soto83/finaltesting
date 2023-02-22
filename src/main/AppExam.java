import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;
import java.util.*;

public class AppExam {
	WebDriver driver;

	public AppExam() {
		//System.writeln("Hello")
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
        this.driver = new ChromeDriver();

        driver.get("https://techfios.com/test/102/");
       
	}
	
	//@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[3]"
	//@FindBy(how = How.XPATH, using = "/html/body/form/ul/input[0]")
	WebElement toggle_all_checkbox;

	@FindBy(how = How.XPATH, using = "/html/body/form/ul/input[0]")
	WebElement REMOVE_CHECKBOX;

	// Question 2 validate remove part
	@Test
	public void validate_remove() {
		WebElement e = driver.findElement(By.cssSelector("input[type=checkbox]"));
		//toggle_all_checkbox.click();
		e.click();
		System.out.print("Will be printed");
	}
	
	// Question 1 --clearing on that question
	
	// Question 2
	@Test
	public void remove_item() {
		WebElement e = driver.findElement(By.cssSelector("input[value=Remove]"));
		//toggle_all_checkbox.click();
		List<WebElement> lst = driver.findElements(By.cssSelector("input[type=checkbox]"));
		// check all content
		for(WebElement v : lst) {
			v.click();
		}
		// remove all content
		for(WebElement d : lst) {
			if(d.isSelected()) {
				e.click();
				System.out.println("it is cleared");
			}
		}
	}
	
	// Question 3 -- remove all items when toggled is set for all
	@Test
	public void toggle_removal() {
		WebElement e = driver.findElement(By.cssSelector("input[name=allbox]"));
		WebElement r = driver.findElement(By.cssSelector("input[value=Remove]"));

		// enable toggle
		
		List<WebElement> lst = driver.findElements(By.cssSelector("input[type=checkbox]"));
		// if toggle is checked delete everything
		e.click();
		// remove all content
		for(WebElement d : lst) {
			if(d.isSelected()) {
				r.click();
			}
		}
		System.out.println("Toggle ran and cleared");
	}
	
	
}