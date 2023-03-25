package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DropDown {
    private WebDriver driver;
    @BeforeTest
    public void Setup()
    {

        //System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
        //para firefox
        //driver = new FirefoxDriver();
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        driver = new ChromeDriver();


        driver.manage().window().maximize();


        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

    }
    @Test@Ignore
    public void DropDownWhitClick() throws InterruptedException {
        //*****No se recomienda utilizar dar clicks en las listas desplegables *****

        WebElement selectDay = driver.findElement(By.className("form-control"));
        selectDay.click();
        Thread.sleep(2000);
        String day = "Saturday";
        String opcionBuscar = String.format("//option[text()='%s']",day);
        WebElement option = driver.findElement(By.xpath(opcionBuscar));
        option.click();
        Thread.sleep(3000);



    }
    @Test@Ignore
    public void DropDownWithSendKeys() throws InterruptedException {
        //Esta opcion es aceptable y de la misma manera recomendable
        WebElement selectDay = driver.findElement(By.className("form-control"));
        String day = "Friday";
        selectDay.sendKeys(day);
        Thread.sleep(3000);
    }
        @Test
        public void DropDownWithClaseSelect() throws InterruptedException {
        String day = "Monday";
        WebElement selectDay = driver.findElement(By.className("form-control"));
        Select selectList = new Select(selectDay);
        //selectList.selectByValue("Tuesday");
        //selectList.selectByVisibleText(day);
            selectList.selectByIndex(5);
            Thread.sleep(3000);

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
