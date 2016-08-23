package SeleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.testng.Assert;


public class migu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.bin","D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://10.1.70.149:9012/login.html");
		WebElement NameInput = driver.findElement(By.name("username"));
		WebElement PwdInput = driver.findElement(By.name("password"));
		//WebElement YzmInput = driver.findElement(By.name("j_captchacode"));
		NameInput.sendKeys("admin");
		PwdInput.sendKeys("123456");
		//WebDriverWait wait = WebDriverWait(driver, 15);
	
		WebElement login = driver.findElement(By.id("login-panel"));
		login.click();
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	driver.quit();
		
	}

}
