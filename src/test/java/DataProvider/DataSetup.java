package DataProvider;

import Base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import java.time.Duration;

public class DataSetup extends Setup {

    @DataProvider(name = "data-provider")
    public Object [][] setData() {

        return new Object[][]{
                {"Hasnat", "4242424242424242","10/23", 2314}

        };
    }

    @DataProvider(name = "data-provider1")
    public Object [][] setData1() {

        return new Object[][]{
                {"aits_CT170048@aits.com", "12345678"},

                {"aits_CT170049@aits.com", "12345678"},
                {"aits_CT170050@aits.com", "12345678"}


        };
    }

}
