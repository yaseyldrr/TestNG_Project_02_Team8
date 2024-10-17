package TC_03;

import org.openqa.selenium.WebElement;

public class TC_03Elements {
    public TC_03Elements() {PageFactory.initElements(BaseDriver.driver,this); }

    @FindBy (xpath = "//a[@data-tilda-event-name='/tilda/click/rec515963418/button1660904954343']")
    public WebElement sbmtbttn;

    @FindBy (name = "name")
    public WebElement name;

    @FindBy (name= "email")
    public WebElement email;

    @FindBy (id = "input_1661174990146")
    public WebElement phoneNumber;

    @FindBy (xpath = "//input[@placeholder='Yaşınız']")
    public WebElement age;

    @FindBy (xpath = "//input[@placeholder='Mesleğiniz']")
    public WebElement job;

    @FindBy (id = "sb-1667664755026")
    public WebElement school;

    @FindBy (id = "sb-1714463229186")
    public WebElement country;

    @FindBy (id = "sb-1663337581601")
    public WebElement course;

    @FindBy (id = "sb-1670423010572")
    public WebElement socmedia;

    @FindBy (css = "div[class='t-checkbox__indicator']")
    public WebElement checkbox;

    @FindBy (xpath = "//*[@class='t-submit']")
    public WebElement sbmtbttn2;

    @FindBy (id = "tildaformsuccesspopuptext")
    public WebElement verification;

}

