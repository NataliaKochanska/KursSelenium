package pl.coderslab.przyklad1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormTest {

    private WebDriver driver;

    @Before

    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }
    @Test
    public void testGoogleSearch() {
        WebElement element = driver.findElement(By.id("first-name"));
        element.clear();
        element.sendKeys("Karol");
        element.submit();

        WebElement element2 = driver.findElement(By.id("last-name"));
        element2.clear();
        element2.sendKeys("Kowalski");
        element2.submit();

        WebElement element3 = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]/input"));
        element3.click();
        element2.submit();

        WebElement element4 = driver.findElement(By.id("dob"));
        element4.clear();
        element4.sendKeys("05/22/2010");
        element4.submit();

        WebElement element5 = driver.findElement(By.id("address"));
        element5.clear();
        element5.sendKeys("Prosta 51");
        element5.submit();

        WebElement element6 = driver.findElement(By.id("email"));
        element6.clear();
        element6.sendKeys("karol.kowalski@mailinator.com");
        element6.submit();

        WebElement element7 = driver.findElement(By.id("password"));
        element7.clear();
        element7.sendKeys("Pass123");
        element7.submit();

        WebElement element8 = driver.findElement(By.id("company"));
        element8.clear();
        element8.sendKeys("Coders Lab");
        element8.submit();

        WebElement element9 = driver.findElement(By.id("comment"));
        element9.clear();
        element9.sendKeys("To jest mój pierwszy automat testowy");
        element9.submit();


    }
    @After
    public void tearDown() throws Exception {

        //driver.quit();
    }
}
