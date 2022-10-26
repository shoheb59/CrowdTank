package Pages;

import Base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IdeaUpload extends Setup {

    public IdeaUpload(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//div[@id='upload--idea--page']/div[2]/div/input")
    WebElement SelectFile;


    @FindBy(xpath = "//button[contains(text(),'Upload Now')]")
    WebElement btn_uploadFile;



    @FindBy(xpath = "//div[@id='upload--idea--page']/div[2]/div/input")
    WebElement btn_VideoUpload;
    @FindBy(xpath = "//button[contains(text(),'Upload Now')]")
    WebElement btn_UploadNow;

     @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]")
     WebElement btn_coverImage;



    public void IdeauploadforUser()
    {



       btn_VideoUpload.sendKeys("E:\\CrowdTankGradlle\\video.mp4");
       btn_UploadNow.click();




    }
}
