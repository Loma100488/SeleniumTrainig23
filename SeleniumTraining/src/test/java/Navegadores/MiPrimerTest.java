package Navegadores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MiPrimerTest

{
    private WebDriver driver;

    @BeforeTest
    public void Setup()
    {
        //se coloca en dirección del driver, segun corresponda (chrome, mozilla, edge...)
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");

        //se crea la instancia u objeto del Navegador
        driver = new ChromeDriver();

        //Maximiza el navegador
        driver.manage().window().maximize();

        //Enviamos la url al navegador
        driver.get("https://www.amazon.com.mx/");
    }

    @Test
    public void MiPrimerTest() throws InterruptedException {

        WebElement inputSearch = driver.findElement(By.id("twotabsearchtextbox"));
        Thread.sleep(3000);
        inputSearch.click();
        Thread.sleep(3000);


        inputSearch.sendKeys("Alexa");
        Thread.sleep(3000);
        inputSearch.submit();
        Thread.sleep(3000);


    }
    @AfterTest
    public void TearDown()
    {
        //cierra el navegador
        driver.close();
        driver.quit();

    }
}
