package Pages;

import Base.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VoteCast extends Setup {

    @FindBy(xpath = "//*[@id=\"money--raised--comp\"]/div/div[2]/div/div[2]/div/div/div[3]/a")
    WebElement btn_EnterMyIdea;

    @FindBy(xpath = "//button[contains(text(),'UPLOAD YOUR IDEA')]")
    WebElement btn_UploadIdea;


    public VoteCast(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }








    public void votecast() throws InterruptedException {
        btn_EnterMyIdea.click();
        Thread.sleep(1000);
        //btn_UploadIdea.click();
    }
}
