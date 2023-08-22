package KamaZ;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.Instant;
import static org.slf4j.MDC.get;

public class StudyPage extends BasePage{
    String fio = "Иванов Петр Сидорович";
    String numberHisPhone = "9999999999";
    String nameUniv = "Сельская школа";
    String profession = "Потребитель";
    String course = "9";
    String midScore = "9.9";
    String email = "test@test.test";
    String themeDiplom = "Потребление всего";
    String skill = "хитросистематищеское";
    String information = "never";
    String placePractice = "Нефтебаза";

    private final String webSiteKamaz = "https://kamaz.ru/";
    private final By dropDownMenu = By.xpath("//*[text()='Карьера']");
    private final By dropDownMenuPractice = By.xpath("//*[text()='Практика']");
    private final By buttonFillOutForm = By.xpath("//*[text()='ЗАПОЛНИТЬ АНКЕТУ']");
    private final By formName  = By.xpath("//input [@type = 'text'][@name='PROPERTY[636][n0]']");
    private final By formNumberPhone = By.xpath("//*[@name='PROPERTY[638][n0][VALUE]']");
    private final By formEMail = By.xpath("//*[@name = 'PROPERTY[639][n0][VALUE]']");
    private final By formProfSpecStudy = By.xpath("//*[@name = 'PROPERTY[642][n0]']");
    private final By formNameUniversity = By.xpath("//*[@name = 'PROPERTY[641][n0]']");
    private final By formCourseStudy = By.xpath("//*[@name = 'PROPERTY[643][n0]']");
    private final By FormMidScore = By.xpath("//*[@name = 'PROPERTY[646][n0]']");
    private final By formNameThemeDiplom = By.xpath("//*[@name = 'PROPERTY[651][n0]']");
    private final By formPlacePractice = By.xpath("//*[@name ='PROPERTY[652][n0]']");
    private final By formPlacePracticePlus = By.xpath("//*[@value='Добавить']");
    private final By formSkill = By.xpath("//*[@name ='PROPERTY[653][n0]']");
    private final By formTextField = By.xpath("//*[@name ='PROPERTY[DETAIL_TEXT][0]']");

    /**
     * date born
     */
    private final By formDateBorn = By.xpath("//*[@name = 'PROPERTY[637][n0][VALUE]']");
    private final By formDateBornYear = By.xpath("//*[contains (text(),'2023')][@class='bx-calendar-top-year']");
    private final By formDateBornYearInputField = By.xpath("//input [@data-bx-year-input = 'Y'][@type='text']");
    private final String dateBornYear = "1999";
    private final By formDateBornMonth = By.xpath("//a[@class ='bx-calendar-top-month']");
    private final By formDateBornMonthFebruary = By.xpath("//*[@class='bx-calendar-month'][@data-bx-month = '1']");
    private final By dateBornDay = By.xpath("//*[@data-date ='918777600000']");
    private final By nameEducation = By.xpath("//*[@name = 'PROPERTY[640]']");
    private final By nameEducationHigh = By.xpath("//*[@value= '293']");
    private final By typePractice = By.xpath("//*[contains(text(),'Вид практики')]");
    private final By nameTypePracticeEnt = By.xpath("//*[contains(text(),'Производственная (преддипломная)')][@value = '300']");
    private final By formStudy = By.xpath("//*[@name ='PROPERTY[644]']");
    private final By formStudyName = By.xpath("//*[@value='296']");
    private final By makePlant = By.xpath("//*[@name='PROPERTY[654]']");
    private final By choiceMakePlant = By.xpath("//*[@name='PROPERTY[654]']/*[@value='302']");
    private final By checkBox = By.xpath("//*[@class = 'forms_checkbox_icon']");
    private final String yearPractice2023 = "2023";
    private final By dateBeginPractice = By.xpath("//*[@name='PROPERTY[649][n0][VALUE]']");
    private final By yearPractice = By.xpath("//*[@class='bx-calendar-top-year'][text()='2023']");
    private final By yearPracticeField = By.xpath("//*[@data-bx-year-input = 'Y'][@class='bx-calendar-year-input']");
    private final By monthPracticeJune = By.xpath("//*[@data-bx-month='5']");
    private final By selectMonthPractice = By.xpath("//*[@class='bx-calendar-top-month']");
    private final By selectPracticeDay = By.xpath("//*[@data-date='1687219200000']");
    private final By findDateEndPractice = By.xpath("//*[@name='PROPERTY[650][n0][VALUE]']");
    private final By dateEndPracticeMonth = By.xpath("//a[@class = 'bx-calendar-top-month']");
    private final By selectDateEndPracticeMonth = By.xpath("//*[@data-bx-month= '7']");
    private final By selectDateEndPracticeDay = By.xpath("//*[@data-date='1693353600000']");
    private final By DateEndPracticeYear = By.xpath("//*[@class='bx-calendar-top-year']");
    private final By DateEndPracticeYearField = By.xpath("//*[@data-bx-year-input='Y']");


    public void openWebSite(){
        driver.get(webSiteKamaz);
    }
    public void openDropDownMenu(){
        WebElement element = driver.findElement(dropDownMenu);
        new Actions(driver).moveToElement(element).perform();
    }
    public void openCareer(){
        WebElement element = driver.findElement(dropDownMenuPractice);
        element.click();
    }
    public void clickButton(){
        WebElement element = driver.findElement(buttonFillOutForm);
        element.click();
    }
    public void enterName(){
        WebElement element = driver.findElement(formName);
        element.click();
        element.sendKeys(fio);
    }
    public void enterNumberPhone(){
        WebElement element = driver.findElement(formNumberPhone);
        element.click();
        element.sendKeys(numberHisPhone);
    }
    public void enterDataBorn(){
        WebElement element = driver.findElement(formDateBorn);
        element.click();
    }
    public void enterYearBorn1999(){
        WebElement element = driver.findElement(formDateBornYear);
        element.click();
    }
    public void enterYearBorn() {
        WebElement element = driver.findElement(formDateBornYearInputField);
        element.sendKeys(dateBornYear);
    }
    public void enterMonthBorn()  {
        WebElement element = driver.findElement(By.xpath ("//a[@class ='bx-calendar-top-month']"));
        new Actions(driver).moveToElement(element).perform();
        element.click();
    }
    public void enterMonthBornMonth(){
        WebElement element = driver.findElement(formDateBornMonthFebruary);
        new Actions(driver).moveToElement(element).perform();
        element.click();

    }
    public void enterDayBorn(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement element = driver.findElement(dateBornDay);
        element.click();
    }
    public void enterEmail(){
        WebElement element = driver.findElement(formEMail);
        element.click();
        element.sendKeys(email);
    }
    public void enterNameUniv(){
        WebElement element = driver.findElement(formNameUniversity);
        element.click();
        element.sendKeys(nameUniv);
    }
    public void enterCourse(){
        WebElement element= driver.findElement(formCourseStudy);
        element.click();
        element.sendKeys(course);
    }
    public void enterYourProfession(){
        WebElement element = driver.findElement(formProfSpecStudy);
        element.click();
        element.sendKeys(profession);
    }
    public void enterMidScore(){
        WebElement element = driver.findElement(FormMidScore);
        element.click();
        element.sendKeys(midScore);
    }
    public void enterThemeDiplom(){
        WebElement element = driver.findElement(formNameThemeDiplom);
        element.click();
        element.sendKeys(themeDiplom);
    }
    public void addNewField (){
        WebElement element = driver.findElement(formPlacePracticePlus);
        element.click();
    }
    public void formFieldInvite(){
        WebElement element = driver.findElement(formPlacePractice);
        element.click();
        element.sendKeys(placePractice);
    }
    public void enterFormSkill(){
        WebElement element = driver.findElement(formSkill);
        element.click();
        element.sendKeys(skill);
    }
    public void enterTextField(){
        WebElement element = driver.findElement(formTextField);
        element.click();
        element.sendKeys(information);
    }
    public void clickChekBox(){
        WebElement element = driver.findElement(checkBox);
        element.click();
    }
    public void waitLoadPage(){

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
    }
    public void waitsImplict(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
    }
    public  void  waitsExplict(){

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
    }
    public void enterFillEducation(){
        WebElement element = driver.findElement(nameEducation);
        element.click();
    }
    public void enterFillEducationHigh(){
        WebElement element = driver.findElement(nameEducationHigh);
        element.click();
    }
    public void enterFormPractice(){
        WebElement element = driver.findElement(typePractice);
        element.click();
    }
    public void enterFormPracticeType(){
        WebElement element = driver.findElement(nameTypePracticeEnt);
        element.click();
    }
    public void enterFormEducation(){
        WebElement  element = driver.findElement(formStudy);
        element.click();
    }
    public void enterFormEducationSelect(){
        WebElement element = driver.findElement(formStudyName);
        element.click();
    }
    public void findYearPracticeBefore(){
        WebElement element = driver.findElement(dateBeginPractice);
        element.click();
    }
    public void enterYearPracticeBefore(){
        WebElement element = driver.findElement(yearPractice);
        element.click();
    }
    public void enterYearPractice2023(){
        WebElement element = driver.findElement(yearPracticeField);
        element.sendKeys(yearPractice2023);
    }
    public void entersSelectMonthPractice()  {
        WebElement element = driver.findElement(selectMonthPractice);
        new Actions(driver).moveToElement(element).perform();
        element.click();
    }
    public void enterMonthPracticeJune(){
        WebElement element = driver.findElement(monthPracticeJune);
        new Actions(driver).moveToElement(element).perform();
        element.click();
    }
    public void enterSelectPracticeDay(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement element = driver.findElement(selectPracticeDay);
        element.click();
    }
    public void findYearPracticeAfter(){
        WebElement element = driver.findElement(findDateEndPractice);
        element.click();
    }
    public void enterYearPracticeAfter(){
        WebElement element = driver.findElement(DateEndPracticeYear);
        element.click();
    }
    public void enterYearPracticeAfter2023(){
        WebElement element = driver.findElement(DateEndPracticeYearField);
        element.sendKeys(yearPractice2023);
    }
    public void entersSelectMonthPracticeAfter()  {
        WebElement element = driver.findElement(dateEndPracticeMonth);
        new Actions(driver).moveToElement(element).perform();
        element.click();
    }
    public void enterMonthPracticeAfterAugust(){
        WebElement element = driver.findElement(selectDateEndPracticeMonth);
        new Actions(driver).moveToElement(element).perform();
        element.click();
    }
    public void enterSelectPracticeAfterDay(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement element = driver.findElement(selectDateEndPracticeDay);
        element.click();
    }

    //enter check box
    public void enterMakePlantChoice(){
        WebElement element = driver.findElement(choiceMakePlant);
        element.click();
    }

    /**Check value field to form

     */
    public String getAttributePartOne(){
        String attributeValueName = driver.findElement(formName).getAttribute("value");
        return attributeValueName;
    }
    public String getAttributePartPhone(){
        String attributeValuePhone = driver.findElement(formNumberPhone).getAttribute("value");
        return attributeValuePhone;
    }
    public String getAttributePartDateBorn(){
        String attributeValueBorn = driver.findElement(formDateBorn).getAttribute("value");
        return attributeValueBorn;
    }
    public String getAttributePartEmail(){
        String attributeValueEmail = driver.findElement(formEMail).getAttribute("value");
        return attributeValueEmail;
    }
    public String getAttributeEdication(){
        String attributeValueEdication = driver.findElement(nameEducationHigh).getAttribute("textContent");
        return attributeValueEdication;
    }
    public String getAttributeNameEduc(){
        String attributeValueEdication = driver.findElement(formNameUniversity).getAttribute("value");
        return attributeValueEdication;
    }
    public String getAttributeCourse(){
        String attributeValueEdication = driver.findElement(formCourseStudy).getAttribute("value");
        return attributeValueEdication;
    }
    public String getAttributeProfession(){
        String attributeValueEdication = driver.findElement(formProfSpecStudy).getAttribute("value");
        return attributeValueEdication;
    }
    public String getAttributeMidScore(){
        String attributeValueEdication = driver.findElement(FormMidScore).getAttribute("value");
        return attributeValueEdication;
    }
    public String getAttributeFormStudy(){
        String attributeValueEdication = driver.findElement(formStudyName).getAttribute("textContent");
        return attributeValueEdication;
    }
    public String getAttributeOtherFieldSkill(){
        String valueAttribute = driver.findElement(nameTypePracticeEnt).getAttribute("textContent");
        return valueAttribute;
    }
    public String getAttributeOtherFieldBefore(){
        String valueAttribute = driver.findElement(dateBeginPractice).getAttribute("value");
        return valueAttribute;
    }
    public String getAttributeOtherFieldBeforeEnd(){
        String valueAttribute = driver.findElement(findDateEndPractice).getAttribute("value");
        return valueAttribute;
    }
    public String getAttributeOtherFieldThemeDiplom(){
        String valueAttribute = driver.findElement(formNameThemeDiplom).getAttribute("value");
        return valueAttribute;
    }
    public String getAttributeOtherFieldPlacePractice(){
        String valueAttribute = driver.findElement(formPlacePractice).getAttribute("value");
        return valueAttribute;
    }
    public String getAttributeOtherFieldYouSkill(){
        String valueAttribute = driver.findElement(formSkill).getAttribute("value");
        return valueAttribute;
    }
    public String getAttributeOtherFielYouWork(){
        String valueAttribute = driver.findElement(choiceMakePlant).getAttribute("textContent");
        return valueAttribute;
    }
    public String getAttributeOtherFieldText(){
        String valueAttribute = driver.findElement(formTextField).getAttribute("value");
        return valueAttribute;
    }
//    public String getAttributeOtherFieldSkill(){
//        String valueAttribute = driver.findElement(nameTypePracticeEnt).getAttribute("textContent");
//        return valueAttribute;
//    }



























}