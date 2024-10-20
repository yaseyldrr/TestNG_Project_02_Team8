package TC_07;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_07Elements {
    public TC_07Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//*[@id='rec515963420']/div/div/div[24]/a")
    public WebElement sdet;

    @FindBy(xpath = "//*[@id='rec515963420']/div/div/div[25]/a")
    public WebElement androidapp;

    @FindBy(xpath = "//*[@id='rec515963420']/div/div/div[23]/a")
    public WebElement veribilimi;

    @FindBy(xpath = "//img[@imgfield='img']")
    public WebElement icon;
}
