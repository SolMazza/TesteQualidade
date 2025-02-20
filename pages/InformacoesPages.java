package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InformacoesPages {
static WebDriver driver;	
    
     
	public InformacoesPages(WebDriver driver) {
		this.driver = driver;
	}
	
	public void preencherDia() {
		WebElement dia = driver.findElement(By.id("day"));
		dia.sendKeys("25");
	}
	public void preencherMes() {
		WebElement mes = driver.findElement(By.id("month"));
		mes.sendKeys("Janeiro");
	}
	public void preencherAno() {
		WebElement ano = driver.findElement(By.id("year"));
		ano.sendKeys("2005");
	}
	public void preencherGenero() {
		WebElement genero = driver.findElement(By.id("gender"));
		genero.sendKeys("Prefiro não dizer");
	}
	
	public void clicarBotaoProximo() {
		WebElement proxima = driver.findElement(By.xpath("//span[contains(text(), 'Próxima')]"));
		proxima.click();
	}
	
	public void preencherTudo() {
		this.preencherDia();
		this.preencherMes();
		this.preencherAno();
		this.preencherGenero();	
		this.clicarBotaoProximo();
	}
	
}
