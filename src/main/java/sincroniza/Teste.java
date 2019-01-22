package sincroniza;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Teste {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
	    driver.get("https://web.whatsapp.com/");
	    driver.manage().window().maximize();
	    
	    WebDriverWait wait = new WebDriverWait(driver, 60);
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='jN-F5 copyable-text selectable-text']")));
	    
	    WebElement element = driver.findElement(By.cssSelector("input[class='jN-F5 copyable-text selectable-text']"));
	    element.click();
	    element.sendKeys("98249570");
	    
	    TimeUnit.SECONDS.sleep(2);
	    
	    WebElement element3 = driver.findElement(By.cssSelector("div[class='_2EXPL']"));
	    element3.click();
	  
	    TimeUnit.SECONDS.sleep(2);
	    
	    WebElement element2 = driver.findElement(By.cssSelector("div[class='_1Plpp']"));
	    element2.click();
	    element2.sendKeys("Testando Whatsapp Boot TOP TOP");
	    
	    TimeUnit.SECONDS.sleep(2);
	    
	    WebElement element4 = driver.findElement(By.cssSelector("button[class='_35EW6']"));
	    element4.click();
	}

}
