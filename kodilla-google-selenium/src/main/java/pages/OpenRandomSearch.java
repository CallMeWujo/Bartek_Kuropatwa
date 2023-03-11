package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenRandomSearch extends GoogleResults{
    @FindBy(css = "div[class='g']")
    static WebElement webElement;


    public OpenRandomSearch(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public WebElement clickInRandomPage(WebElement googleResults) {
        webElement = googleResults;
        webElement.click();
        System.out.println(webElement);
        return webElement;
    }

}
