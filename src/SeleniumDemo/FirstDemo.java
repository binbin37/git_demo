package SeleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.testng.Assert;


public class FirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.firefox.bin","D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
				WebDriver driver = new FirefoxDriver();
		//´ò¿ª360ËÑË÷
				driver.get("http://www.haosou.com/");
				//ÕÒµ½ËÑË÷¿òÔªËØ
				WebElement searchInput = driver.findElement(By.name("q"));
				searchInput.sendKeys("selenium");
				WebElement searchButton = driver.findElement(By.id("search-button"));
				searchButton.click();
				try{
					Thread.sleep(2000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				WebElement keywordInput = driver.findElement(By.id("keyword"));
				Assert.assertEquals(keywordInput.getAttribute("value"),"selenium");
				driver.quit();
		
		
	}

}
