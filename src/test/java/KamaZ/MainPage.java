package KamaZ;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.time.Duration;

public class MainPage extends BasePage{
    private final String webSiteKamaz = "https://kamaz.ru/";
    private final By aboutCompanyLink = By.xpath("");
    private final By generalInformationLink = By.xpath("//*[@href='/about/general-information/'][text() ='Общая информация']");
    private final By historyInformationLink = By.xpath("//*[@href = '/about/history/'][text() = 'История']");
    private final By configModel = By.xpath("//*[@title='Конфигуратор модели']");
    private final By modelKMY = By.xpath("//*[@href='/production/serial/configurator/?model=avtomobil-s-kmu']");
    private final By headerColor = By.xpath("//*[@class = 'header-top-b']");
    private final String fieldFind = "продукция завода Камаз";
    private final By inputField = By.xpath("//*[@name='q']");
    private final By inputFieldResult = By.xpath("//*[@class = 'search-block input']/*");

    //Общая информация
    public String getheaderColor(){
        WebElement element = driver.findElement(headerColor);
        String Color = element.getCssValue("background-color");
        return Color;
    }
    public void findInputField() {
        WebElement element = driver.findElement(inputField);
        element.click();
        element.sendKeys(fieldFind, Keys.ENTER);
    }
    public String inputFieldResult(){
        String value = driver.findElement(inputFieldResult).getAttribute("value");
        return value;
    }
    public void openWebSite(){
        driver.get(webSiteKamaz);
    }
    public void dropDownMenuFindAboutCompany(){
        WebElement hoverable = driver.findElement(By.xpath("//*[@href = '/about/'][text()='О компании']")); //движение мышки на элемент
        new Actions(driver)
                .moveToElement(hoverable)
                .perform();
    }
    public void dropDownMenuFindGeneralInfomation(){
        WebElement element = driver.findElement(generalInformationLink);
        element.click();
    }
    public void dropDownMenuFindHistoryInfomation(){
        WebElement element = driver.findElement(historyInformationLink);
        element.click();
    }
    public void openConfigModel (){
        WebElement element = driver.findElement(configModel);
        element.click();
    }
    public void openModelKMY(){
        WebElement element = driver.findElement(modelKMY);
        element.click();
    }
}







