package Pages;

import Base.Setup;
import Base.Utilities.CsvRead;
import com.opencsv.exceptions.CsvValidationException;
import org.apache.poi.hssf.record.PageBreakRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class LoginPage extends Setup {


    @FindBy(xpath = "//a[contains(text(),'signup')]")
    WebElement btn_waitForHomeBtn;
    @FindBy(xpath = "\"//*[@id=\\\"login--signup--button--com\\\"]/div/div[2]/div[1]/a")
    WebElement btn_Signup;

    @FindBy(xpath = "//*[@id=\"login--signup--button--com\"]/div/div[2]/div[1]/a")
    WebElement btn_Login;

    //login

    @FindBy(id = "enter-email")
    WebElement txt_LoginEmail;

    @FindBy(id = "exampleInputPassword1")
    WebElement txt_LoginPass;


    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement btn_LoginSubmit;



    //image & viedeo upload
    @FindBy(xpath = "//div[@id='upload--idea--page']/div[2]/div/input")
    WebElement btn_VideoUpload;
    @FindBy(xpath = "//button[contains(text(),'Upload Now')]")
    WebElement btn_UploadNow;

    @FindBy(css = ".upload--button > input:nth-child(2)")
    WebElement btn_coverImage;



    //card info
    @FindBy(css = "#card-holder-name")
    WebElement txt_cradHolderName;

    @FindBy(css = "#enter-card")
    WebElement txt_cardNumber;

    @FindBy(css ="#expirationCardInfo")
    WebElement txt_cardExpire;

    @FindBy(css = "#cvcLength")
    WebElement txt_cardCVC;

    @FindBy(css = ".signup--button > button:nth-child(1)")
    WebElement btn_UploadSubmit;

    @FindBy(css = ".col > a:nth-child(1)")
    WebElement btn_BackTohome;

    @FindBy(css = ".profile")
    WebElement btn_profile;

    @FindBy(xpath = "//span[contains(text(),'Log Out')]")
    WebElement btn_logout;






    //VoteCastPage Findby

    @FindBy(xpath = "//*[@id=\"money--raised--comp\"]/div/div[2]/div/div[2]/div/div/div[3]/a")
    WebElement btn_EnterMyIdea;


    //ideaUploadPage




    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    public void clickSingUpbutton() throws InterruptedException, CsvValidationException, IOException {


        //btn_Signup.click();


        btn_Login.click();
        CsvRead csvRead = new CsvRead();

        while ((csvRead.csvCell = csvRead.signup_data_read.readNext()) != null) {

            //String name = csvRead.csvCell[0];
            String mail = csvRead.csvCell[1];
            String pass = csvRead.csvCell[3];

            txt_LoginEmail.sendKeys(mail);
            Thread.sleep(2000);
            txt_LoginPass.sendKeys(pass);
            Thread.sleep(1000);



            btn_LoginSubmit.click();


        }


    }

    public void LoginwithDataProvide(String mail, String pass) throws InterruptedException {

        btn_Login.click();
        Thread.sleep(1000);

        txt_LoginEmail.sendKeys(mail);
        Thread.sleep(2000);
        txt_LoginPass.sendKeys(pass);
        Thread.sleep(1000);

        btn_LoginSubmit.click();
        Thread.sleep(1000);



        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"money--raised--comp\"]/div/div[2]/div/div[2]/div/div/div[3]/a")));
        Thread.sleep(1500);







        btn_EnterMyIdea.click();
        //Idea Upload
        btn_VideoUpload.sendKeys("E:\\CrowdTankGradlle\\video.mp4");
        btn_UploadNow.click();
        Thread.sleep(1500);

        JavascriptExecutor js = (JavascriptExecutor)driver; //Scrolling using JavascriptExecutor
        js.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
        Thread.sleep(3000);

        btn_coverImage.sendKeys("E:/img.jpeg");


        //card details

        txt_cradHolderName.sendKeys("Hasnat");
        Thread.sleep(1000);
        txt_cardNumber.sendKeys("4242424242424242");
        txt_cardExpire.sendKeys("10/23");
        Thread.sleep(1000);
        txt_cardCVC.sendKeys("321");
        Thread.sleep(1500);


        btn_UploadSubmit.click();

        Thread.sleep(2000);




        btn_BackTohome.click();
        Thread.sleep(1000);
        System.out.println("Back Button Pressed");

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".profile")));


        btn_profile.click();
        Thread.sleep(1500);
        System.out.println("Enter into the Profile page");


        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(" .logout")));

        JavascriptExecutor js2 = (JavascriptExecutor)driver; //Scrolling using JavascriptExecutor
        js2.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
        Thread.sleep(3000);

        System.out.println("Profile Page");


        btn_logout.click();

        System.out.println("log out button Pressed");



    }

}
