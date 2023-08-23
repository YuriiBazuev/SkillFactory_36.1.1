package KamaZ;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

abstract class Base {
    WebDriver driver;

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().setSize(new Dimension(1600, 1024));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        BasePage.setDriver(driver);
    }
    @BeforeTest()
    public void init (){
        setUp();
    }

//    @AfterTest()
//    public void tearDown() {
//        driver.close();
//   }
}

