package Edit.Proyect123mvd;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abercrombie1 {
	String url = "https://brooksfield.com.uy/";
	String driverPath = "..\\Proyect123mvd\\Drivers\\chromedriver.exe";
	WebDriver driver;
	@BeforeSuite
	public void abrirPagina() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("https://brooksfield.com.uy/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	@Test
	public void RegistroUsuarioCorrecto() {
		driver.findElement(By.id("headerProfile")).click();
		driver.findElement(By.cssSelector("#changeToRegisterButton")).click();
		driver.findElement(By.id("registerName")).click();
		driver.findElement(By.id("registerName")).sendKeys("Maximo");
		driver.findElement(By.id("registerSurname")).sendKeys("Lopez");
		driver.findElement(By.id("registerEmail")).sendKeys("autom3775@gmail.com");
		driver.findElement(By.cssSelector("#registerPassword")).sendKeys("mat@3775");
		driver.findElement(By.cssSelector("#registerPasswordRepeat")).sendKeys("mat@3775");
		//driver.findElement(By.id("registerButton")).click();
		
	}
	
	
	
	
	// ingreso de usuario registrado
	@Test(description= "CP01 - Ingresar Usuario Existente", priority=2)
	public void IngresoUsuario(){
		driver.findElement(By.id("headerProfile")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("signInEmail")));
		driver.findElement(By.id("signInEmail")).sendKeys("autom3775@gmail.com");
		driver.findElement(By.cssSelector("#signInPassword")).sendKeys("mat@3775");
		driver.findElement(By.cssSelector("#registerPasswordRepeat")).click();
		}
	
	@Test
	public void BuscarArticulo() {
		driver.findElement(By.xpath( "//a[contains(@class,'headerOption headerOptionMenuOpen')]")).click();
		
		
	}
	
	
	/*
	@AfterSuite
	public void cerrarPagina() {
		driver.close();
	}
	*/
}