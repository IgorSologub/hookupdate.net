package pages.blogCategory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.Urls.BLOG_CATEGORY_SECOND_URL;

public class BlogCategoryPage extends BasePage {

    public BlogCategoryPage (WebDriver driver) {super(driver);}

    private final By paginationButton = By.xpath("(//a[@class='WO6K1B3fG'])[1]");

    public BlogCategoryPage blogPostClick (int numButton) {
        By blogPost = By.xpath("(//a[@class='BLbkMyy-aSGx'])[" + numButton + "]");
        driver.findElement(blogPost).click();
        return this;
    }

    public BlogCategoryPage topPostBlogButtonClick (int numButton) {
        By blogButton = By.xpath("(//a[@class='AMtu0Ifh'])[" + numButton + "]");
        driver.findElement(blogButton).click();
        return this;
    }

    public BlogCategoryPage topPostButtonClick (int numButton) {
        By topPostButton = By.xpath("(//a[@class='H1HmtWPoR'])[" + numButton + "]");
        driver.findElement(topPostButton).click();
        return this;
    }

    public BlogCategoryPage paginationButtonClick () {
        driver.findElement(paginationButton).click();
        return this;
    }

    public Boolean paginationUrlCheck () {
        boolean result = false;
        if (driver.getCurrentUrl().contains(BLOG_CATEGORY_SECOND_URL)) {
            result = true;
        }
        return result;
    }

}
