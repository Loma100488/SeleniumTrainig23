package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CheckBox_RadioButton {

    private WebDriver driver;
    @BeforeTest
    public void Setup()
    {
        //se coloca en dirección del driver, segun corresponda (chrome, mozilla, edge...)
        //System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        //se crea la instancia u objeto del Navegador
        driver = new ChromeDriver();

        //Maximiza el navegador
        driver.manage().window().maximize();

        //Enviamos la url al navegador
        driver.get("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");

       /* Thread.sleep(3000);
        driver.manage().deleteAllCookies();*/
    }

    //validar
    //1.verificar que se muestre el elemento con el cual vamos a interactuar, antes de cualquier operación
    //2.Verificar que los radio button o check box esten habilitados
    //3. Verificar que la seleccion predeterminada del boton ya sea radio o check

    @Test
    public void CheckAndRadio() throws InterruptedException {
        WebElement radioButtonMale = driver.findElement (By.xpath("//input[@name='optradio' and @value='Male']"));
        //isDisplayed() : lo que nos regresa es una valor booleano, si devuelve verdadero , entonces
        //dicho boton esta presente, si es falso entonces el botón no esta presente.
        /*boolean status = radioButtonMale.isDisplayed();
        System.out.println("estatus :" +status);
        radioButtonMale.click();
        Thread.sleep(3000);*/

        //isEnabled() : Lo que nos regresa es un valor booleano, si devuelve verdadero, entonces,
        // el boton esta habilitado, si regresa falso entonces el boton no esta presente.
       /* boolean statusDisplayed = radioButtonMale.isDisplayed();
        boolean statusEnabled = radioButtonMale.isEnabled();
        System.out.println("status Dispalyed :" + statusDisplayed);
        System.out.println("status enabled :" + statusEnabled);
        radioButtonMale.click();
        Thread.sleep(3000);*/

        //isSelected() : lo que nos regresa es un valor booleano, si devuelve verdadero entonces,
        //el boton esta seleccionado , si regresa falso el boton no esta presente


        boolean statusDisplayed = radioButtonMale.isDisplayed();
        Thread.sleep(3000);

        boolean statusEnabled = radioButtonMale.isEnabled();
        Thread.sleep(3000);

        radioButtonMale.click();
        boolean statusSelected = radioButtonMale.isSelected();
        Thread.sleep(3000);

        System.out.println("status Dispalyed :" + statusDisplayed);
        System.out.println("status enabled :" + statusEnabled);
        System.out.println("Status selected " + statusSelected);
        radioButtonMale.click();
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
