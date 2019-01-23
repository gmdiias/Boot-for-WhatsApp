package sincroniza;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendMessage {
	
	private WebDriver driver;
	private String mensagem;
	private List<Contato> contatosToSend = new ArrayList<>();
	
	public SendMessage(String mensagem, List<Contato> contatosToSend) {
		super();
		this.mensagem = mensagem;
		this.contatosToSend = contatosToSend;
	}

	public void sendMessage() throws InterruptedException {
		connect();
		waitLogin();
		for(Contato contato : contatosToSend) {
			trySelectUser(contato.getTelefone());
			trySendMessage(mensagem);
		}
	}
	
	public void connect() {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe" );
		driver = new ChromeDriver();
	    driver.get("https://web.whatsapp.com/");
	    driver.manage().window().maximize();
	}
	
	public void waitLogin() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='jN-F5 copyable-text selectable-text']")));
	}
	
	public void trySelectUser(String telefoneNumero) throws InterruptedException {
		WebElement element = driver.findElement(By.cssSelector("input[class='jN-F5 copyable-text selectable-text']"));
	    element.click();
	    element.sendKeys(telefoneNumero);
	    
	    TimeUnit.SECONDS.sleep(2);
	    
	    WebElement element3 = driver.findElement(By.cssSelector("div[class='_2EXPL']"));
	    element3.click();
	    
	    TimeUnit.SECONDS.sleep(2);
	}
	
	public void trySendMessage(String mensagem) throws InterruptedException {
		WebElement element2 = driver.findElement(By.cssSelector("div[class='_1Plpp']"));
	    element2.click();
	    element2.sendKeys(mensagem);
	    
	    TimeUnit.SECONDS.sleep(2);
	    
	    WebElement element4 = driver.findElement(By.cssSelector("button[class='_35EW6']"));
	    element4.click();
	}
	
}
