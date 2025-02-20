package test;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.CadastroPages;
import pages.InformacoesPages;

public class CadastroTest {

	static WebDriver driver;
	static CadastroPages cadastroPages; 
	static InformacoesPages informacoesPages;
	Wait<WebDriver> esperarUmPouco = new WebDriverWait(driver, Duration.ofSeconds(6));
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp?hl=pt");
		driver.manage().window().maximize();
		cadastroPages = new CadastroPages(driver);
		informacoesPages = new InformacoesPages(driver);
	}

	@Test
	public void test() throws InterruptedException {
		cadastroPages.preencherTudo();
		esperarUmPouco.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Informações básicas')]")));
		informacoesPages.preencherTudo();                           
		
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}



}
