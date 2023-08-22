package KamaZ;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class ConfigPages extends BasePage {
    private final By checkFormula6x6 = By.xpath("//*[@class = 'forms forms_radio']/*");
    private final By infoStep = By.xpath("//*[@class = 'trigger']");
    private final By infoStep7400 = By.xpath("//li[@data-raw-value ='7400']");
    private final By infoButton = By.xpath("//*[text() ='Сконфигурировать']");
    private final By infoButtonFindDillers = By.xpath("//*[text() ='Найти дилера']");
    private final By dropDoewnMenu = By.xpath("//*[@title='Все']");
    private final By dropDoewnMenuSearchString = By.xpath("//*[@type='search']");
    private final By buttonSeeYou = By.xpath("//*[text()='Показать']");
    public final By nameDiller = By.xpath("//*[text()='ООО \"АВТОДОМ\"']");
    private final String nameRegion = "Пермский край";

    public String getNameDillers (){
        String name = driver.findElement(nameDiller).getText();
        return name;
    }
    public void selectRegionDillers (){
        WebElement element = driver.findElement(dropDoewnMenu);
        element.click();
    }
    public void enterRegion(){
        WebElement element = driver.findElement(dropDoewnMenuSearchString);
        element.click();
        element.sendKeys(nameRegion, Keys.ENTER);
    }
    public void clickOnButtonSeeAll(){
        WebElement element = driver.findElement(buttonSeeYou);
        element.click();
    }
    public void waitLoadPage(){
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }
    public void findClickButton(){
        WebElement element = driver.findElement(infoButton);
        element.click();
    }
    public void findClickButtonFindDillers(){
        WebElement element = driver.findElement(infoButtonFindDillers);
        element.click();
    }
    public void moveCursor(){
        WebElement element = driver.findElement(checkFormula6x6);
        new Actions(driver).moveToElement(element).perform();
        element.click();
    }
    public void clickElementThree(){
        WebElement element = driver.findElement(infoStep);
        element.click();
    }
    public void clickElement7400(){
        WebElement element = driver.findElement(infoStep7400);
        element.click();
    }
}