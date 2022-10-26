package Pages;

import Base.Setup;
import Utilities.CsvRead;
import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.IOException;
import java.time.Duration;

public class SignupPage extends Setup {


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

    public SignupPage(WebDriver driver) {
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
            Thread.sleep(2000);



            btn_LoginSubmit.click();


        }


    }

}
