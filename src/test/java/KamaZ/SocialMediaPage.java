package KamaZ;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SocialMediaPage extends BasePage{
    String nameWebSite = "https://kamaz.ru/";
    By vkontakte = By.xpath("//*[@alt='ВКонтакте']");
    By youTube = By.xpath("//*[@alt='Youtube']");
    By dZen = By.xpath("//*[@alt='Дзен']");
    By odnoklasniki = By.xpath("//*[@alt='Одноклассники']");
    By telegram = By.xpath("//*[@alt='Телеграм']");
    By tikTok = By.xpath("//*[@alt='TikTok']");
    By ruTube = By.xpath("//*[@alt='rutube']");

    public void openWebSite(){
        driver.get(nameWebSite);
    }
    public void openLinkVkontakte(){
        String parentHandle = driver.getWindowHandle();
        WebElement element = driver.findElement(vkontakte);
        element.click();
        for(String childHandle : driver.getWindowHandles()){
            if (!childHandle.equals(parentHandle)){
                driver.switchTo().window(childHandle);
            }
        }
    }
    public void openLinkYouTube(){
        String tab = driver.getWindowHandle();
        WebElement element = driver.findElement(youTube);
        element.click();
        for(String childHandele : driver.getWindowHandles()){
            if (!childHandele.equals(tab)){
                driver.switchTo().window(childHandele);
            }
        }
    }
    public void openLinkDzen(){
        String tab = driver.getWindowHandle();
        WebElement element = driver.findElement(dZen);
        element.click();
        for(String childHandele : driver.getWindowHandles()){
            if (!childHandele.equals(tab)){
                driver.switchTo().window(childHandele);
            }
        }
    }
    public void openLinkOdnoklasniki(){
        String tab = driver.getWindowHandle();

        WebElement element = driver.findElement(odnoklasniki);
        element.click();
        for(String childHandele : driver.getWindowHandles()){
            if (!childHandele.equals(tab)){
                driver.switchTo().window(childHandele);
            }
        }
    }
    public void openLinkTelegram(){
        String tab = driver.getWindowHandle();
        WebElement element = driver.findElement(telegram);
        element.click();
        for(String childHandele : driver.getWindowHandles()){
            if (!childHandele.equals(tab)){
                driver.switchTo().window(childHandele);
            }
        }
    }
    public void openLinkTikTok(){
        String tab = driver.getWindowHandle();
        WebElement element = driver.findElement(tikTok);
        element.click();
        for(String childHandele : driver.getWindowHandles()){
            if (!childHandele.equals(tab)){
                driver.switchTo().window(childHandele);
            }
        }
    }
    public void openLinkruTube(){
        String tab = driver.getWindowHandle();
        WebElement element = driver.findElement(ruTube);
        element.click();
        for(String childHandele : driver.getWindowHandles()){
            if (!childHandele.equals(tab)){
                driver.switchTo().window(childHandele);
            }
        }
    }

    By elementVkontakte = By.xpath("// body");
    By elementYouTube = By.xpath("// body");
    public String checkLinkVkontakte(){
        String  element = driver.findElement(elementVkontakte).getAttribute("baseURI");
        return element;
    }
    public String checkLinkYouTube(){
        String  element = driver.findElement(elementYouTube).getAttribute("baseURI");
        return element;
    }
    public String checkLinkOdniklasniki(){
        String  element = driver.findElement(elementYouTube).getAttribute("baseURI");
        return element;
    }
    public String checkLinkDzen(){
        String element = driver.findElement(elementYouTube).getAttribute("baseURI");
        return element;
    }
    public String checkLinkTelegram(){
        String element = driver.findElement(elementYouTube).getAttribute("baseURI");
        return element;
    }
    public String checkLinkTikTok(){
        String element = driver.findElement(elementYouTube).getAttribute("baseURI");
        return element;
    }
    public String checkLinkRuTube(){
        String element = driver.findElement(elementYouTube).getAttribute("baseURI");
        return element;
    }
}




