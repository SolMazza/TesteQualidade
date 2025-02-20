package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CadastroPages;

public class CadastroTestErros {

	static WebDriver driver;
	static CadastroPages cadastroPages; 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp?hl=pt");
		driver.manage().window().maximize();
		cadastroPages = new CadastroPages(driver);
	}

	@Test
	public void test() {
		cadastroPages.forcarErro();
		assertEquals(cadastroPages.validarMensagemErro(), "Digite o nome");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
