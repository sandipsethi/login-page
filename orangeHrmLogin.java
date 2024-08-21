package practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHrmLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement element=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		element.sendKeys("Admin");
		Thread.sleep(500);
		WebElement element1=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		element1.sendKeys("admin123");
		Thread.sleep(400);
		WebElement element11=driver.findElement(By.xpath("//button[contains(., 'Login')]"));
		element11.click();

	}

}
