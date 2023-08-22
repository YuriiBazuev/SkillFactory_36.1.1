package KamaZ;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductPage extends BasePage {
    private final String openWebSite = "https://kamaz.ru/";
    private final By productBus = By.xpath("//*[text()='Автобусы']");
    private final By productDropDown = By.xpath("//a[@class = 'main-section'][text() = 'Продукция']");
    private final By productSpecTruck = By.xpath("//*[text()='Спецавтотехника']");
    private final By productSpecTruckForAirport = By.xpath("//*[text()='Аэродромная техника']");
    private final By truckForAirport= By.xpath("//*[text()='Машина комбинированная MРР 8200']");

    public void openTruckMPP8200(){
        WebElement element = driver.findElement(truckForAirport);
        element.click();
    }
    public void opentTruckForAirport(){
        WebElement element = driver.findElement(productSpecTruckForAirport);
        element.click();
    }
    public void seeProductBus(){
        WebElement element = driver.findElement(productBus);
        element.click();
    }
    public void seeSpecFireTruck(){
        WebElement element = driver.findElement(productSpecTruck);
        element.click();
    }
    public void moveCursor(){
        WebElement element = driver.findElement(productDropDown);
        new Actions(driver).moveToElement(element).perform();
    }
    public void openWebSiteKamaz(){
        driver.get(openWebSite);
    }

}