package TC_03;

import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TC_03 extends BaseDriver {
    @Test(groups = {"Regression Test"})
    public void Test() {
        TC_03Elements sc = new TC_03Elements();
        driver.get("https://techno.study/tr/");
        wait.until(ExpectedConditions.elementToBeClickable(sc.sbmtbttn));

        sc.sbmtbttn.click();

        sc.name.sendKeys("Test Mahir Özçelik");
        sc.email.sendKeys("test_team8@gmail.com");
        sc.phoneNumber.sendKeys("907 222 22 22");
        sc.age.sendKeys("30");
        sc.job.sendKeys("SDET");
        sc.school.sendKeys("Üniversite");
        sc.country.sendKeys("Andorra");
        sc.course.sendKeys("SDET Türkçe");
        sc.socmedia.sendKeys("Instagram");
        sc.checkbox.click();
        sc.sbmtbttn2.click();

        wait.until(ExpectedConditions.visibilityOf(sc.verification));
        sc.verification.getText().equals("Başvurunuz alınmıştır");
    }

}
