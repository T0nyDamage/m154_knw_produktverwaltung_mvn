import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {
	public void testCreateCustomer() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Dev_Tools\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:5555/");
		String title = driver.getTitle();
		assertTrue(title.contains("CRM App"));

		WebElement prodName = driver.findElement(By.xpath("/html/body/form[1]/input[1]"));
		prodName.sendKeys("Michael");

		//WebElement name = driver.findElement(By.xpath("/html/body/form[1]/input[2]"));
		//name.sendKeys("Hauck");

		WebElement button = driver.findElement(By.xpath("/html/body/form[1]/p/input"));
		
		Thread.sleep(5000);
		
		button.click();

		WebElement username = driver.findElement(By.xpath("/html/body/span"));

		assertTrue(username.getText().trim().contains("Michael Hauck"));
	}
}