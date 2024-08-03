package fitpeo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_Fitpeo {

	public static void main(String[] args) throws Throwable {
		
		//Task 1--> Navigate to the FitPeo Homepage
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.fitpeo.com/");
		
		//Task 2--> Navigate to the Revenue Calculator Page
		
		WebElement select = driver.findElement(By.xpath("//div[text()='Revenue Calculator']"));
		select.click();
		Thread.sleep(3000);
		
		
		//Task 3--> Scroll Down to the Slider section
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(3000);
		
		//Task 4--> Adjust the Slider
		Actions action = new Actions(driver);
		WebElement slider = driver.findElement(By.cssSelector("span[class=\"MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-duk49p\"]"));
		action.moveToElement(slider).clickAndHold().moveByOffset(100, 0).release().build().perform();
		action.moveToElement(slider).clickAndHold().moveByOffset(-26, 0).release().build().perform();
		Thread.sleep(5000);
		
		//Task 5--> Update the Text Field
		WebElement input01 = driver.findElement(By.cssSelector("input[class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"]"));
		input01.click();
		Thread.sleep(2000);
		input01.clear();
		Thread.sleep(2000);
		input01.sendKeys("560");
		
		//Task 7--> Select CPT Codes
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")).click();
		driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]")).click();
		driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[8]")).click();
		
		
		

	}

}
