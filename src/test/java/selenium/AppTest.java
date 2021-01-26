package selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    private WebDriver driver;

    @Before
    public void setUp(){
        System.out.println("Iniciando configuración...");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.google.com");
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println("Iniciando Pruebas...");
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("Libros DevOps");
        searchbox.submit();
        //assertEquals("Libros DevOps", driver.getTitle());
    }

    @Test
    public void compraLibroAmazon() {
        driver.get("https://www.google.com/");
        driver.manage().window().setSize(new Dimension(1227, 560));
        driver.findElement(By.name("q")).sendKeys("Libros de Devop");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".ct5Ked:nth-child(3) .keP9hb")).click();
        {
          WebElement element = driver.findElement(By.cssSelector(".s1SShd .keP9hb"));
          Actions builder = new Actions(driver);
          builder.moveToElement(element).perform();
        }
        {
          WebElement element = driver.findElement(By.tagName("body"));
          Actions builder = new Actions(driver);
          builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".qrShPb > span")).click();
        driver.findElement(By.cssSelector(".tF2Cxc:nth-child(2) .LC20lb > span")).click();
        {
          WebElement element = driver.findElement(By.id("add-to-cart-button-ubb"));
          Actions builder = new Actions(driver);
          builder.moveToElement(element).perform();
        }
        driver.findElement(By.id("add-to-cart-button-ubb")).click();
        {
          WebElement element = driver.findElement(By.tagName("body"));
          Actions builder = new Actions(driver);
          builder.moveToElement(element, 0, 0).perform();
        }
        {
          WebElement element = driver.findElement(By.id("nav-link-accountList"));
          Actions builder = new Actions(driver);
          builder.moveToElement(element).perform();
        }
      }
}
