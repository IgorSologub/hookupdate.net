package pages.escort;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class EscortPage extends BasePage {

    public EscortPage (WebDriver driver) {super(driver);}

    private final By cityButton = By.xpath("(//a[@class='wwpLYbg '])[4]");
    private final By inputCitySearch = By.xpath("//input[@class='ciBsMTK3Kl FYxIU0veWjC']");
    private final By searchButton = By.xpath("//button[@class='w35VPf qaeBwX1 js-escorts-search-submit']");
    private final By cityOnMapBlock = By.xpath("//div[@class='jvectormap-container']//*[name()='svg']//*[name()='g' and contains(@transform,'scale(1.18')]//*[name()='path'][13]");
    private final By cityInfoBlock = By.xpath("//div[@class='gU7vqZKiIW']");

    public EscortPage cityButtonClick () {
        driver.findElement(cityButton).click();
        return this;
    }

    public Boolean cityButtonCheck () {
        boolean result = false;
        if (driver.getCurrentUrl().contains("https://hookupdate.net/escort-index/montgomery/")) {
            result = true;
        }
        return result;
    }

    public EscortPage enterCity () {
        driver.findElement(inputCitySearch).sendKeys("Montgomery");
        return this;
    }

    public EscortPage searchButtonClick () {
        driver.findElement(searchButton).click();
        return this;
    }

}
