package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPages {

	static WebDriver driver;	
	
	public CadastroPages(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void preencherFirstName() {
		WebElement primeiroNome = driver.findElement(By.id("firstName"));
		primeiroNome.sendKeys("Sol");
	}
	
	public void preencherLastName() {
		WebElement ultimoNome = driver.findElement(By.id("lastName"));
		ultimoNome.sendKeys("Mazzarolo");
	}
	public void clicarBotaoProximo() {
		WebElement proxima = driver.findElement(By.xpath("//span[contains(text(), 'Próxima')]"));
		proxima.click();
	}
	
	public String validarMensagemErro() {
		return driver.findElement(By.xpath("//span[contains(text(), 'Digite o nome')]")).getText();
		
	}
	public void preencherTudo() {
		this.preencherFirstName();
		this.preencherLastName();
		this.clicarBotaoProximo();
	}
	
	
	public void forcarErro() {
		this.preencherLastName();
		this.clicarBotaoProximo();
	}
	
	
}
