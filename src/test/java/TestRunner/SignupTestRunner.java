package TestRunner;

import Base.Setup;
import Pages.IdeaUpload;
import Pages.SignupPage;
import Pages.VoteCast;
import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class SignupTestRunner extends Setup {



    @Test(priority = 1)
    public void firnstTest() throws InterruptedException, CsvValidationException, IOException {

        SignupPage signupPage = new SignupPage(driver);
        Thread.sleep(1500);
        driver.get("https://crowdtank.audacityit.work/");
        Thread.sleep(3600);
        System.out.println("Browser Start");
        WebDriverWait waitHome = new WebDriverWait(driver, Duration.ofSeconds(180));
        waitHome.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'signup')]")));
        signupPage.clickSingUpbutton();
    }
    @Test(priority = 2)
    public void VoteCastPageTest() throws InterruptedException {
         VoteCast voteCast = new VoteCast(driver);
         voteCast.votecast();


    }
    @Test(priority = 3)
    public void UploadFile()
    {
        IdeaUpload ideaUpload = new IdeaUpload(driver);
        ideaUpload.IdeauploadforUser();
    }
}
