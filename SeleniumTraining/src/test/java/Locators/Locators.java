package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Locators
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
        driver.get("https://demo.guru99.com/test/newtours/");
    }

    @Test
    public void Locators() throws InterruptedException {
        //***************Localizador por "ID"
        WebElement demoSite = driver.findElement(By.id("site-name"));
        demoSite.click();
        Thread.sleep(3000);

        //****************Localizador por "Name"
        /*WebElement userName = driver.findElement(By.name("userName"));
        userName.sendKeys("Automation23");
        Thread.sleep(3000);*/

        //**************Localizador por "Class"
        /*WebElement logo = driver.findElement(By.className("logo"));
        logo.click();
        Thread.sleep(3000);*/

        //***************Localizador por "linktext"
        /*WebElement demoSite = driver.findElement(By.linkText("Demo Site"));
        demoSite.click();
        Thread.sleep(3000);*/

        //**************Localizador por "partialLinkText"
        /*WebElement demoSite = driver.findElement(By.partialLinkText("Demo"));
        demoSite.click();
        Thread.sleep(3000);*/

        //************Localizador por "cssSelector"
        //WebElement userName = driver.findElement(By.cssSelector("input[name='userName']"));
        //WebElement demoSite = driver.findElement(By.cssSelector("div#site-name"));
        //WebElement demoSite = driver.findElement(By.cssSelector("#site-name"));
       /* WebElement userName = driver.findElement(By.cssSelector("input[type='text'][name='userName']"));
        userName.click();
        userName.sendKeys(("Automation23"));
        Thread.sleep(3000);*/

        //**************X P H A T S*************************************
        //Existen dos tipos de xpaths que son : absoluto y relativo
        //el xphat absoluto por buenas practicas no se debe utilizar o bien no abusar de el
        //Diferencias
        //El xphat absoluto es toda la ruta del elemento es decir la ibicacion del mismo y su sintaxis inicia con una diagonal


        //***********
        //WebElement userName = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
       // userName.sendKeys(("Automation23"));
       // Thread.sleep(3000);
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
