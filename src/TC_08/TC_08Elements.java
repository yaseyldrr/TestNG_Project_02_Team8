package TC_08;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_08Elements {
    public TC_08Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//a[text()='Bilgi Alın']")
    public WebElement info;

    @FindBy(xpath = "//a[text()='Kullanım Şartlarını']")
    public WebElement terms;



}
