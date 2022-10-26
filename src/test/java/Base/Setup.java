package Base;

import Utilities.Screenshoot;
import Utilities.Util;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Setup {

    public WebDriver driver;
    DevTools devTools;

    @BeforeTest
    public void setup()
    {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();


//
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headed");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        driver = new ChromeDriver(options);
        //



        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @AfterTest
    public void closeDriver()
    {
        //driver.close();
    }

    @AfterMethod
    public void takeScreenshot(ITestResult result)
    {
        if (ITestResult.FAILURE == result.getStatus())
            try
            {
                Screenshoot screenshoot = new Screenshoot();
                //screenshoot.takeScreenshot(driver);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
    }



}
