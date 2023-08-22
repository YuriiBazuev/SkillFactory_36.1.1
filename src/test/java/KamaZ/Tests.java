package KamaZ;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class Tests extends Base {
    @Test(priority = 0, description = "Test number 1 - Find official web site 'Kamaz'")
    public void openGoogleSearchWord() {
        GooglePage googlePage = new GooglePage();

        googlePage.openWebSiteSearchGoogle();
        googlePage.timeWaitsLoadPage();
        googlePage.insertSearchWord();
        googlePage.timeWaitsLoadPage();
        googlePage.findLinkKamaz();
        googlePage.timeWaitsLoadPage();

        System.out.println(driver.getTitle());
        Assert.assertEquals("Официальный сайт ПАО \"КАМАЗ\"", driver.getTitle());

    }

    @Test(priority = 1, description = "Test number 2 - I want read infomation about company")
    public void openPageInfomation() {

        MainPage mainPage = new MainPage();
        mainPage.openWebSite();
        mainPage.dropDownMenuFindAboutCompany();
        mainPage.dropDownMenuFindGeneralInfomation();

        System.out.println(driver.getTitle());
        Assert.assertEquals("Общая информация", driver.getTitle());
    }

    @Test(priority = 2, description = "Test number 3 - I want read historical infomation about plant")
    public void openPageHistoryInfomation() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite();
        mainPage.dropDownMenuFindAboutCompany();
        mainPage.dropDownMenuFindHistoryInfomation();

        System.out.println(driver.getTitle());
        Assert.assertEquals("История", driver.getTitle());
    }

    @Test(priority = 3, description = "Test number 4 - I want see bus Kamaz")
    public void iSeeNewBus() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite();

        ProductPage productPage = new ProductPage();
        productPage.moveCursor();
        productPage.seeProductBus();

        System.out.println(driver.getTitle());
        Assert.assertEquals("Автобусы", driver.getTitle());
    }

    @Test(priority = 4, description = "Test number 5 - Use search field, and find text 'продукция завода Камаз'")
    public void useSearchField() {

        MainPage mainPage = new MainPage();
        mainPage.openWebSite();
        mainPage.findInputField();
        System.out.println(mainPage.inputFieldResult());

        Assert.assertEquals("продукция завода Камаз", mainPage.inputFieldResult());
    }

    @Test(priority = 5, description = "Test number 6 - I want  truck modification for me, and i want to buy this truck in diller 'OOO Aвтодом' in the region Пермский край")
    public void buyTrack() {

        MainPage mainPage = new MainPage();
        mainPage.openWebSite();
        mainPage.openConfigModel();
        mainPage.openModelKMY();

        ConfigPages configPages = new ConfigPages();
        configPages.moveCursor();
        configPages.clickElementThree();
        configPages.clickElement7400();
        configPages.findClickButton();
        configPages.waitLoadPage();
        configPages.findClickButtonFindDillers();
        configPages.selectRegionDillers();
        configPages.waitLoadPage();
        configPages.enterRegion();
        configPages.clickOnButtonSeeAll();
        configPages.getNameDillers();
        String actualText = configPages.getNameDillers();

        System.out.println(actualText);
        Assert.assertEquals("ООО \"АВТОДОМ\"", actualText);
    }

    @Test(priority = 6, description = "Test number 7 - How color have header web site")
    public void howLogoColor() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite();
        String logoColor = mainPage.getheaderColor();

        System.out.println(logoColor);
        Assert.assertTrue(true, logoColor);

    }

    @Test(priority = 7, description = "Test number 8 - Filling out the form practice part 1")
    public void fillFormPracticeSmallInformation() {
        StudyPage studyPage = new StudyPage();
        studyPage.openWebSite();
        studyPage.openDropDownMenu();
        studyPage.openCareer();
        studyPage.clickButton();

        studyPage.enterName();
        studyPage.enterNumberPhone();
        studyPage.enterDataBorn();
        studyPage.enterYearBorn1999();
        studyPage.enterYearBorn();
        studyPage.enterMonthBorn();
        studyPage.enterMonthBornMonth();
        studyPage.enterDayBorn();
        studyPage.enterEmail();

        System.out.println(studyPage.getAttributePartOne());
        System.out.println(studyPage.getAttributePartPhone());
        System.out.println(studyPage.getAttributePartDateBorn());
        System.out.println(studyPage.getAttributePartEmail());

        Assert.assertEquals("Иванов Петр Сидорович", studyPage.getAttributePartOne());
        Assert.assertEquals("(999) 999-99-99", studyPage.getAttributePartPhone());
        Assert.assertEquals("12.02.1999", studyPage.getAttributePartDateBorn());
        Assert.assertEquals("test@test.test", studyPage.getAttributePartEmail());
    }

    @Test(priority = 8, description = "Test number 9 - Filling out the form practice part 2")
    public void fillFormPracticeYouGetEducation() {
        StudyPage studyPage = new StudyPage();
        studyPage.openWebSite();
        studyPage.openDropDownMenu();
        studyPage.openCareer();
        studyPage.clickButton();

        studyPage.enterFillEducation();
        studyPage.enterFillEducationHigh();
        studyPage.enterNameUniv();
        studyPage.enterCourse();
        studyPage.enterYourProfession();
        studyPage.enterMidScore();
        studyPage.enterFormEducation();
        studyPage.enterFormEducationSelect();

        System.out.println(studyPage.getAttributeEdication());
        System.out.println(studyPage.getAttributeNameEduc());
        System.out.println(studyPage.getAttributeCourse());
        System.out.println(studyPage.getAttributeProfession());
        System.out.println(studyPage.getAttributeMidScore());
        System.out.println(studyPage.getAttributeFormStudy());

        Assert.assertEquals("Cреднее профессиональное", studyPage.getAttributeEdication());
        Assert.assertEquals("Сельская школа", studyPage.getAttributeNameEduc());
        Assert.assertEquals("9", studyPage.getAttributeCourse());
        Assert.assertEquals("Потребитель", studyPage.getAttributeProfession());
        Assert.assertEquals("9.9", studyPage.getAttributeMidScore());
        Assert.assertEquals("Заочная", studyPage.getAttributeFormStudy());
    }

    @Test(priority = 9, description = "Test number 10 - Filling out the form practice part 3")
    public void fillFormPracticePractice() {

        StudyPage studyPage = new StudyPage();
        studyPage.openWebSite();
        studyPage.openDropDownMenu();
        studyPage.openCareer();
        studyPage.clickButton();

        studyPage.enterFormPractice();
        studyPage.enterFormPracticeType();

        studyPage.findYearPracticeBefore();
        studyPage.enterYearPracticeBefore();
        studyPage.enterYearPractice2023();
        studyPage.entersSelectMonthPractice();
        studyPage.enterMonthPracticeJune();
        studyPage.enterSelectPracticeDay();

        studyPage.findYearPracticeAfter();
        studyPage.enterYearPracticeAfter();
        studyPage.enterYearPracticeAfter2023();
        studyPage.entersSelectMonthPracticeAfter();
        studyPage.enterMonthPracticeAfterAugust();
        studyPage.enterSelectPracticeAfterDay();
        studyPage.enterThemeDiplom();
        studyPage.addNewField();
        studyPage.formFieldInvite();
        studyPage.enterFormSkill();
        //studyPage.enterMakePlant();
        studyPage.enterMakePlantChoice();
        studyPage.enterTextField();
        studyPage.clickChekBox();

        System.out.println(studyPage.getAttributeOtherFieldSkill());
        System.out.println(studyPage.getAttributeOtherFieldBefore());
        System.out.println(studyPage.getAttributeOtherFieldBeforeEnd());
        System.out.println(studyPage.getAttributeOtherFieldThemeDiplom());
        System.out.println(studyPage.getAttributeOtherFieldPlacePractice());
        System.out.println(studyPage.getAttributeOtherFieldYouSkill());
        System.out.println(studyPage.getAttributeOtherFielYouWork());


        Assert.assertEquals("Производственная (преддипломная)", studyPage.getAttributeOtherFieldSkill());
        Assert.assertEquals("20.06.2023", studyPage.getAttributeOtherFieldBefore());
        Assert.assertEquals("30.08.2023", studyPage.getAttributeOtherFieldBeforeEnd());
        Assert.assertEquals("Потребление всего", studyPage.getAttributeOtherFieldThemeDiplom());
        Assert.assertEquals("Нефтебаза", studyPage.getAttributeOtherFieldPlacePractice());
        Assert.assertEquals("хитросистематищеское", studyPage.getAttributeOtherFieldYouSkill());
        Assert.assertEquals("Да", studyPage.getAttributeOtherFielYouWork());
        Assert.assertEquals("never", studyPage.getAttributeOtherFieldText());


    }

    @Test(priority = 10, description = "Test number 11 - I want see airport fire truck ")
    public void iWantSeeSpecFireTruck() {
        ProductPage productPage = new ProductPage();
        productPage.openWebSiteKamaz();
        productPage.moveCursor();
        productPage.seeSpecFireTruck();
        productPage.opentTruckForAirport();
        productPage.openTruckMPP8200();

        Assert.assertEquals("Машина комбинированная MРР 8200", driver.getTitle());


    }


    @Test(priority = 11, description = "Test number 12 - I find dealer ООО \"Архангельский автоцентр КАМАЗ\", г. Архангельск in my region ")
    public void iWantFindDealerInMyRegionOne() {
        DealerPage dealerPage = new DealerPage();
        dealerPage.setOpenWebSite();
        dealerPage.setOpenLinkDealer();
        dealerPage.setChoiceRegionDealer();
        dealerPage.setChoiceRegionDealerArhangelsk();
        dealerPage.findFieldEnterRegionName();
        dealerPage.pushDealer();

        System.out.println(dealerPage.setNameDealerOne());
        System.out.println(dealerPage.setNameDealerTwo());

        Assert.assertEquals("ООО \"Архангельский автоцентр КАМАЗ\", г. Архангельск", dealerPage.setNameDealerOne());

    }

    @Test(priority = 12, description = "Test number 13 - I find dealer ООО \"ЗТ Арктика\", г. Архангельск in my region ")
    public void iWantFindDealerInMyRegionTwo() {
        DealerPage dealerPage = new DealerPage();
        dealerPage.setOpenWebSite();
        dealerPage.setOpenLinkDealer();
        dealerPage.setChoiceRegionDealer();
        dealerPage.setChoiceRegionDealerArhangelsk();
        dealerPage.findFieldEnterRegionName();
        dealerPage.pushDealer();

        System.out.println(dealerPage.setNameDealerTwo());


        // test down because - expected result use space" "(...ельск "...)
        Assert.assertEquals("ООО \"ЗТ Арктика\", г. Архангельск", dealerPage.setNameDealerTwo());
    }

    @Test(priority = 13, description = "Test number 14 - I want see information about Kamaz on Vkontakte")
    public void iSeeInformationToVkontakte(){
        SocialMediaPage socialMediaPage = new SocialMediaPage();
        socialMediaPage.openWebSite();
        socialMediaPage.openLinkVkontakte();

        System.out.println(socialMediaPage.checkLinkVkontakte());
        Assert.assertEquals("https://vk.com/public1191183", socialMediaPage.checkLinkVkontakte());
    }

    @Test(priority = 14, description = "Test number 15 - I want see information about Kamaz on YouTube")
    public void iSeeInformationToYouTube(){
        SocialMediaPage socialMediaPage = new SocialMediaPage();
        socialMediaPage.openWebSite();
        socialMediaPage.openLinkYouTube();

        System.out.println(socialMediaPage.checkLinkYouTube());
        Assert.assertEquals("https://www.youtube.com/c/%D0%9A%D0%BE%D0%BC%D0%BF%D0%B0%D0%BD%D0%B8%D1%8F%D0%9A%D0%90%D0%9C%D0%90%D0%971969"
                , socialMediaPage.checkLinkYouTube());
    }

    @Test(priority = 15, description = "Test number 16 - I want see information about Kamaz on Odnoklasniki")
    public void iSeeInformationToOdnoklasniki(){
        SocialMediaPage socialMediaPage = new SocialMediaPage();
        socialMediaPage.openWebSite();
        socialMediaPage.openLinkOdnoklasniki();

        System.out.println(socialMediaPage.checkLinkYouTube());
        Assert.assertEquals("https://ok.ru/kamazgroup"
                , socialMediaPage.checkLinkOdniklasniki());
    }

    @Test(priority = 16, description = "Test number 17 - I want see information about Kamaz on Dzen")
    public void iSeeInformationToDzen(){
        SocialMediaPage socialMediaPage = new SocialMediaPage();
        socialMediaPage.openWebSite();
        socialMediaPage.openLinkDzen();

        System.out.println(socialMediaPage.checkLinkYouTube());
        Assert.assertEquals("https://dzen.ru/vestikamaza?utm_referer=kamaz.ru"
                , socialMediaPage.checkLinkDzen());
    }

    @Test(priority = 16, description = "Test number 18 - I want see information about Kamaz on Telegram")
    public void iSeeInformationToTelegram(){
        SocialMediaPage socialMediaPage = new SocialMediaPage();
        socialMediaPage.openWebSite();
        socialMediaPage.openLinkTelegram();

        System.out.println(socialMediaPage.checkLinkTelegram());
        Assert.assertEquals("https://t.me/pao_kamaz"
                , socialMediaPage.checkLinkTelegram());
    }

    @Test(priority = 16, description = "Test number 19 - I want see information about Kamaz on TikTok")
    public void iSeeInformationToTikTok(){
        SocialMediaPage socialMediaPage = new SocialMediaPage();
        socialMediaPage.openWebSite();
        socialMediaPage.openLinkTikTok();

        System.out.println(socialMediaPage.checkLinkTikTok());
        Assert.assertEquals("https://www.tiktok.com/@kamaz_official"
                , socialMediaPage.checkLinkTikTok());
    }
    @Test(priority = 16, description = "Test number 20 - I want see information about Kamaz on RuTube")
    public void iSeeInformationToRuTube(){
        SocialMediaPage socialMediaPage = new SocialMediaPage();
        socialMediaPage.openWebSite();
        socialMediaPage.openLinkruTube();

        System.out.println(socialMediaPage.checkLinkRuTube());
        Assert.assertEquals("https://rutube.ru/u/kamaz/"
                , socialMediaPage.checkLinkRuTube());
    }
}








