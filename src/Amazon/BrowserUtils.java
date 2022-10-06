package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserUtils {

    //    String browserName = "FIREFOX";
//
//    BrowserUtils() {
//        if (browserName.equalsIgnoreCase("chrome")) {
//            System.setProperty("webdriver.chrome.driver", "C:\\USB\\Driver\\chromedriver.exe");
//            WebDriver chromeDriver = new ChromeDriver();
//
//        } else if (browserName.equalsIgnoreCase("firefox")) {
//            System.setProperty("webdriver.gecko.driver", "C:\\USB\\Driver\\geckodriver.exe");
//            WebDriver firefoxDriver = new FirefoxDriver();
//        }
//    }
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\USB\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tnpsc.gov.in/home.aspx");
        driver.manage().window().maximize();

        AmazonPage amazonPage = new AmazonPage(driver);
        amazonPage.clickHome();
        amazonPage.verifyApplyOnline();

    }
}

