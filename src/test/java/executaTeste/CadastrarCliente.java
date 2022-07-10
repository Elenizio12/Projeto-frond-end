package executaTeste;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastrarCliente {

	WebDriver browser ;
	
	
	@SuppressWarnings("deprecation")
	@Before
	public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	browser=new ChromeDriver();
	browser.get("https://www.advantageonlineshopping.com/#/");
	browser.manage().window().maximize();
	browser.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void cadastroCliente() throws InterruptedException {
		
		//************* Criando uma conta *****************
		//clicar User menu usuario
		browser.findElement(By.id("menuUser")).click();
		/*Thread.sleep(5000);
		//criar novo usuario
		browser.findElement(By.xpath("//a[text()='CREATE NEW ACCOUNT']")).click();
		//criar nome
		browser.findElement(By.name("usernameRegisterPage")).sendKeys("elenizio");
		//criar e-mail
		browser.findElement(By.name("emailRegisterPage")).sendKeys("elenizio@teste.com.br");
		//criar senha
		browser.findElement(By.name("passwordRegisterPage")).sendKeys("Elenizio@123");
		//confirmar senha
		browser.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Elenizio@123");
		//aceitar termos de privacidade
		browser.findElement(By.name("i_agree")).click();
		//confirmar registro
		browser.findElement(By.id("register_btnundefined")).click();*/
		
		//*************** Acessando a conta ********************
		Thread.sleep(3000);
		browser.findElement(By.name("username")).sendKeys("elenizio");
		browser.findElement(By.name("password")).sendKeys("Elenizio@123");
		browser.findElement(By.id("sign_in_btnundefined")).click();
		//************ Deletando a conta ************************
		Thread.sleep(3000);
		browser.findElement(By.xpath("//*[@id=\"menuUserLink\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"loginMiniTitle\"]/label[1]")).click();
		browser.findElement(By.cssSelector("#myAccountContainer > div:nth-child(6) > button")).click();
		browser.findElement(By.xpath("//*[@id=\"deleteAccountPopup\"]/div[3]/div[1]")).click();
		
	
	}

}
