package TC_05;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Utility.BaseDriver;
import org.openqa.selenium.support.PageFactory;

public class TC_05Elements {
    public TC_05Elements() {PageFactory.initElements(BaseDriver.driver, this); }

    @FindBy (xpath = "//*[@id='rec684017893']")
    public WebElement dw;

    @FindBy (xpath = "//a[@href='https://www.facebook.com/technostudy.turkiye']")
    public WebElement facebook;

    @FindBy(xpath = "//a[@href='https://www.instagram.com/technostudy.tr/']")
    public WebElement inst;

    @FindBy(xpath = "//a[@href='https://www.youtube.com/@TechnoStudyTR']")
    public WebElement youtube;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/techno-study-tr/']")
    public WebElement linkedin;


}
