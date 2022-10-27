package Pages;

import Base.Setup;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IdeaUpload extends Setup {

    public IdeaUpload(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }




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

     @FindBy(css = ".logout")
     WebElement btn_logout;





    public void ideaVideoNimage() throws InterruptedException {



       btn_VideoUpload.sendKeys("E:\\CrowdTankGradlle\\video.mp4");
       btn_UploadNow.click();
       Thread.sleep(1500);

        JavascriptExecutor js = (JavascriptExecutor)driver; //Scrolling using JavascriptExecutor
        js.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
        Thread.sleep(3000);

        btn_coverImage.sendKeys("E:/img.jpeg");









    }
//    public void cardDetails(String name, String cardNum, String expireDate, int cvc ) throws InterruptedException {
//
//
//        txt_cradHolderName.sendKeys(name);
//        txt_cardNumber.sendKeys(cardNum);
//        txt_cardExpire.sendKeys(expireDate);
//        txt_cardCVC.sendKeys(""+cvc+"");
//        Thread.sleep(1500);
//
//        btn_BackTohome.click();
//        btn_profile.click();
//        Thread.sleep(1500);
//
//        btn_logout.click();
//
//
//
//    }
}
