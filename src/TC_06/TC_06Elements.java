package TC_06;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_06Elements{

    public TC_06Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//*[@id='nav683558030']/div/div[4]/div/div/div/div[1]/a")
    public WebElement bilgi;

    @FindBy(xpath = "//*[@id='rec515963418']/div/div/div[7]/a")
    public WebElement basvur;

    @FindBy(xpath = "//*[@id='rec515963420']/div/div/div[24]/a")
    public WebElement sdet;

    @FindBy(xpath = "//*[@id='rec515963420']/div/div/div[25]/a")
    public WebElement android;

    @FindBy(xpath = "//*[@id='rec515963420']/div/div/div[23]/a")
    public WebElement veri;

    @FindBy(xpath = "//img[@imgfield='img']")
    public WebElement icon;

}
