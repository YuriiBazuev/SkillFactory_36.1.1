package KamaZ;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class DealerPage extends BasePage{
    String openWebSite = "https://kamaz.ru/";
    String Arhangelsk = "Архангельская область";
    By openLinkDealer = By.xpath("//*[@title ='Найти дилера в своем регионе'][@class = 'dealer']");
    By choiceRegionDealer = By.xpath("//*[@class = 'select2-selection select2-selection--single']");
    By choiceRegionDealerArhangelsk = By.xpath("//*[@data-select2-id='1']");
    By choiceRegionDealerField = By.xpath("//*[@type='search']");
    By buttonDealers = By.xpath("//*[@name='dealer']/*/*/button[@class='apply-filter']");
    By nameDealersOne = By.xpath("//*[@class='dealers-title-b'][contains (text(), 'Архангельский')]");
    By nameDealersTwo = By.xpath("//*[@class='dealers-title-b'][contains (text(), 'Арктика')]");

    public void setOpenWebSite(){
        driver.get(openWebSite);
    }
    public void setOpenLinkDealer(){
        WebElement element = driver.findElement(openLinkDealer);
        element.click();
    }
    public void setChoiceRegionDealer(){
        WebElement element = driver.findElement(choiceRegionDealer);
        element.click();
    }
    public void setChoiceRegionDealerArhangelsk(){
        WebElement  element = driver.findElement(choiceRegionDealerArhangelsk);

    }
    public void findFieldEnterRegionName(){
        WebElement element = driver.findElement(choiceRegionDealerField);
        element.click();
        element.sendKeys(Arhangelsk, Keys.ENTER);
    }
    public void pushDealer(){
        WebElement element = driver.findElement(buttonDealers);
        element.click();
    }
    public String setNameDealerOne(){
        String element = driver.findElement(nameDealersOne).getAttribute("textContent");
        return element;
    }
    public String setNameDealerTwo(){
        String element = driver.findElement(nameDealersTwo).getAttribute("textContent");
        return element;
    }
}


