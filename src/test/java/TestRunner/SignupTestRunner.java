package TestRunner;

import Base.Setup;
import DataProvider.DataSetup;
import Pages.LoginPage;
import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class SignupTestRunner extends Setup {




    @Test(priority = 1, dataProvider = "data-provider1", dataProviderClass = DataSetup.class)
    public void firnstTest(String mail, String pass) throws InterruptedException, CsvValidationException, IOException {

        LoginPage signupPage = new LoginPage(driver);
        Thread.sleep(1500);
        driver.get("https://crowdtank.audacityit.work/");
        Thread.sleep(3600);
        System.out.println("Browser Start");
        WebDriverWait waitHome = new WebDriverWait(driver, Duration.ofSeconds(60));
        waitHome.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'signup')]")));
        //signupPage.clickSingUpbutton();




            signupPage.LoginwithDataProvide(mail, pass);










    }
//    @Test(priority = 2)
//    public void VoteCastPageTest() throws InterruptedException {
//         VoteCast voteCast = new VoteCast(driver);
//         voteCast.votecast();
//
//
//    }
//    @Test(priority = 3)
//    public void UploadFile() throws InterruptedException {
//        IdeaUpload ideaUpload = new IdeaUpload(driver);
//        ideaUpload.ideaVideoNimage();
//    }

//    @Test(priority = 4, dataProvider = "data-provider", dataProviderClass = DataSetup.class)
//    public void CardDetails(String name, String cardNum, String Expire, int cvc) throws InterruptedException {
//        IdeaUpload ideaUpload = new IdeaUpload(driver);
//
//        ideaUpload.cardDetails(name, cardNum, Expire,cvc);
//
//
//    }
}
