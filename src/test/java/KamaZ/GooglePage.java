package KamaZ;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.time.Duration;
public class GooglePage extends BasePage{
    private final String googlePage = "https://www.google.ru/";
    private final String searchWord = "камаз";
    private final By searchFieldGoogle = By.xpath("//*[@name = 'q']");
    private final By linkKamaz = By.xpath("//*[@href='https://kamaz.ru/']");
    public void tearDown(){
        driver.quit();
    }
    public void timeWaitsLoadPage(){
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
    }
    public void openWebSiteSearchGoogle(){
        driver.get(googlePage);
    }
    public void insertSearchWord(){
        WebElement element = driver.findElement(searchFieldGoogle);
        element.sendKeys(searchWord);
        element.sendKeys(Keys.ENTER);
    }
    public void findLinkKamaz(){
        String parentHandle = driver.getWindowHandle();

        // driver.findElement(By.linkText("https://kamaz.ru/")).click();
        WebElement element = driver.findElement(linkKamaz);
        element.click();
        for(String childHandle : driver.getWindowHandles()){
            if (!childHandle.equals(parentHandle)){
                driver.switchTo().window(childHandle);
            }
        }
    }
    public void findNewTab(){
        String parentHandle = driver.getWindowHandle(); // запоминаем родительское окно
        //действие
        for(String childHandle : driver.getWindowHandles()){ // выбираем окно наследника
            if (!childHandle.equals(parentHandle)){
                driver.switchTo().window(childHandle);
            }
        }
    }
}


