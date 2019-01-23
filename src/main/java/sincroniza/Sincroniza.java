package sincroniza;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sincroniza {

	public static void main(String[] args) throws InterruptedException {
		List<Contato> contatosToSend = new ArrayList<>();
	    
		Contato helena = new Contato("Helena", "88272503");
		Contato jacira = new Contato("Jacira", "99279405");
		Contato giovana = new Contato("Giovana", "98543876");
		contatosToSend.add(helena);
		contatosToSend.add(giovana);
		contatosToSend.add(jacira);
		
		SendMessage send = new SendMessage("Oi eu estou testando ...", contatosToSend);
		send.sendMessage();
	}

}
