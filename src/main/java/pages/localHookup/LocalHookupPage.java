package pages.localHookup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.main.MainPage;

public class LocalHookupPage extends BasePage {

    public LocalHookupPage (WebDriver driver) {super(driver);}

    private final By learnMoreButton = By.xpath("//a[@class='w35VPf u9rPjVfnLM']");
    private final By loadMoreButton = By.xpath("//button[@class='mGTaDHTEhp SmDXZYUgd js-showner-more js-showner-sortgroups']");
    private final By cityBlock = By.xpath("//div[normalize-space()='Chicago']");
    private final By loadMoreReviewButton = By.xpath("//button[@class='mGTaDHTEhp SmDXZYUgd Og1jTOK-7 js-showner-more']");
    private final By reviewBlock = By.xpath("(//tr[@class='EuSbaIZFtOU'])[2]");
    private final By faqCollapseButton = By.xpath("(//div[@class='Zki0OHrafk'])[1]");
    private final By faqCollapseText = By.xpath("(//div[@class='x1kVJPN'])[1]");
    private final By authorButton = By.xpath("//a[@class='ph_wS58k']");
    private final By nextSliderButton = By.xpath("//button[@class='js-sites-next-sm slick-next slick-arrow']");
    private final By blogSlide = By.xpath("(//div[@class='bkFJFRr0Fw1P'])[6]");
    private final By scrollToBlogSlider = By.xpath("(//h2[@class='Eq-ne80JVI-'])[18]");

    public LocalHookupPage learnMoreButtonClick () {
        driver.findElement(learnMoreButton).click();
        return this;
    }

    public LocalHookupPage loadMoreButtonClick () {
        driver.findElement(loadMoreButton).click();
        return this;
    }

    public Boolean cityBlockCheck () {
        return elementVisibleCheck(cityBlock);
    }

    public LocalHookupPage visitSiteButtonClick (int numButton) {
        By visitSiteButton = By.xpath("(//a[@class[contains(.,'w35VPf z0v9zLrK')]])[" + numButton + "]");
        driver.findElement(visitSiteButton).click();
        return this;
    }

    public LocalHookupPage readReviewButtonClick (int numButton) {
        By readReviewButton = By.xpath("(//a[@class[contains(.,'v_wV3')]])[" + numButton + "]");
        driver.findElement(readReviewButton).click();
        return this;
    }

    public LocalHookupPage latestNewsButtonClick (int numButton) {
        By latestNewsButton = By.xpath("(//a[@class='R2n7BaqN'])[" + numButton + "]");
        driver.findElement(latestNewsButton).click();
        return this;
    }

    public LocalHookupPage loadMoreReviewButtonClick () {
        driver.findElement(loadMoreReviewButton).click();
        return this;
    }

    public Boolean reviewBlockCheck () {
        return elementVisibleCheck(reviewBlock);
    }

    public LocalHookupPage visitSiteInTextButtonClick (int numButton) {
        By visitSiteInTextButton = By.xpath("(//a[@class='w35VPf DYAl6Lv DkEaY06Gb'])[" + numButton + "]");
        driver.findElement(visitSiteInTextButton).click();
        return this;
    }

    public LocalHookupPage readFullReviewButtonClick (int numButton) {
        By readFullReviewButton = By.xpath("(//a[@class='UVPOC1rmef4n'])[" + numButton + "]");
        driver.findElement(readFullReviewButton).click();
        return this;
    }

    public LocalHookupPage faqCollapseButtonClick () {
        driver.findElement(faqCollapseButton).click();
        return this;
    }

    public Boolean faqCollapseTextCheck () {
        return elementVisibleCheck(faqCollapseText);
    }

    public LocalHookupPage articlesButtonClick (int numButton) {
        By articlesButton = By.xpath("(//a[@class='Uw4b6izpA1a'])[" + numButton + "]");
        driver.findElement(articlesButton).click();
        return this;
    }

    public LocalHookupPage authorButtonClick () {
        driver.findElement(authorButton).click();
        return this;
    }

    public Boolean authorCheck () {
        return driver.getTitle().contains("Hana");
    }

    public LocalHookupPage scrollToBlogSlider () {
        scrollToElement(scrollToBlogSlider);
        return this;
    }

    public LocalHookupPage nextBlogSliderButtonClick () {
        driver.findElement(nextSliderButton).click();
        return this;
    }

    public Boolean blogSliderVisibleCheck () {
        return elementVisibleCheck(blogSlide);
    }

}
