package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Scroll {
    private WebDriver driver;
    @BeforeTest
    public void Setup()
    {

        //System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();


        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

    }

    @Test
    public void Scroll() throws InterruptedException
    {


    }


    @AfterTest
    public void TearDown()
    {
        //cierra el navegador
        driver.close();
        //para cerra la instancia de chorme desde administrador de tareas
        driver.quit();

    }


}
