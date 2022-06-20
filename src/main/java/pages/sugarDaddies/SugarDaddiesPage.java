package pages.sugarDaddies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.Urls.QUIZ_PAGE_URL;

public class SugarDaddiesPage extends BasePage {

    public SugarDaddiesPage (WebDriver driver) {super(driver);}

    private final By startButton = By.xpath("//a[@class='w35VPf ihmuP']");

    public SugarDaddiesPage visitSiteRegButtonClick (int numButton) {
        By visitSiteRegButton = By.xpath("(//a[@class[contains(.,'w35VPf bEjy3gioTm')]])[" + numButton + "]");
        driver.findElement(visitSiteRegButton).click();
        return this;
    }

    public SugarDaddiesPage visitSiteRegButtonInTopSitesForSugarDatingClick (int numButton) {
        By visitSiteRegButtonInTopSitesForSugarDating = By.xpath("(//a[@class[contains(.,'w35VPf Ij1M03qrlU')]])[" + numButton + "]");
        driver.findElement(visitSiteRegButtonInTopSitesForSugarDating).click();
        return this;
    }

    public SugarDaddiesPage sendMessageRegButtonClick (int numButton) {
        By sendMessageRegButton = By.xpath("(//a[@class[contains(.,'w35VPf NQd72')]])[" + numButton + "]");
        driver.findElement(sendMessageRegButton).click();
        return this;
    }

    public SugarDaddiesPage loadMoreRegButtonClick () {
        By loadMoreRegButton = By.xpath("//a[@class[contains(.,'mGTaDHTEhp nM6y3')]]");
        driver.findElement(loadMoreRegButton).click();
        return this;
    }

    public SugarDaddiesPage addProfilesRegButtonClick () {
        By addProfilesRegButton = By.xpath("//a[@class[contains(.,'awKmgnY-0')]]");
        driver.findElement(addProfilesRegButton).click();
        return this;
    }

    public SugarDaddiesPage startButtonClick () {
        driver.findElement(startButton).click();
        return this;
    }

    public Boolean startButtonCheck () {
        return driver.getCurrentUrl().contains(QUIZ_PAGE_URL);
    }

    public  SugarDaddiesPage findSugarCityButtonClick (int numButton) {
        By findSugarCityButton = By.xpath("(//a[@class='wwpLYbg '])[" + numButton + "]");
        driver.findElement(findSugarCityButton).click();
        return this;
    }

    public  SugarDaddiesPage readReviewButtonClick (int numButton) {
        By readReviewButton = By.xpath("(//a[@class='S2yNImcj4lz'])[" + numButton + "]");
        driver.findElement(readReviewButton).click();
        return this;
    }

    public  SugarDaddiesPage readFullReviewButtonClick (int numButton) {
        By readFullReview = By.xpath("(//a[@class='LgWVx'])[" + numButton + "]");
        driver.findElement(readFullReview).click();
        return this;
    }

}
