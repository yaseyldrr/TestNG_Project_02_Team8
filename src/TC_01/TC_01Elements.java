package TC_01;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC_01Elements {
    public TC_01Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "(//*[@class='t-menu__link-item t978__tm-link'])[1]")
    public WebElement courses;

   @FindBy(xpath = "//ul[@class='t978__menu']/li")
    public List<WebElement> courselist;
}
