package TC_04;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC_04Elements {
    public TC_04Elements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }
    @FindBy(xpath = "(//a[.='Kurslar'])[1]")
    public WebElement kurslarButton;

    @FindBy(css = "[role='menuitem']>span")
    public List<WebElement> kurslarMenuItems;


}
