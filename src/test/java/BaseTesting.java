import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

    public class BaseTesting {
        public WebDriver driver;

        @BeforeSuite
        public void launchBrowser(){
            driver  = new FirefoxDriver();
        }

        @AfterSuite
        public void killSession(){
            driver.close();
        }

        @BeforeTest
        public void verifyDeleteButtons() {
            driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        }
    }


