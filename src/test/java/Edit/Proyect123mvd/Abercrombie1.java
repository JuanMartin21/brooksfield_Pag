package Edit.Proyect123mvd;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abercrombie1 {
	String url = "https://brooksfield.com.uy/";
	String driverPath = "..\\Proyect123mvd\\Drivers\\chromedriver.exe";
	@Test
	public void registrarUsuario(){
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://brooksfield.com.uy/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.findElement(By.id("headerProfile")).click();
		driver.findElement(By.id("signInEmail")).sendKeys("autom3775@gmail.com");
		driver.findElement(By.cssSelector("#signInPassword")).sendKeys("mat@3775");
		driver.findElement(By.cssSelector("#signInPassword")).sendKeys("mat@3775");
		
		
	}
	
}