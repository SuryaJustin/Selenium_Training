package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public  class  BrowserUtils {

    public static WebDriver driver;

//
//    static String browserName = "FIREFOX";
//
//    BrowserUtils() {
//        if (browserName.equalsIgnoreCase("chrome")) {
//            System.setProperty("webdriver.chrome.driver", "C:\\USB\\Driver\\chromedriver.exe");
//            WebDriver chromeDriver = new ChromeDriver();
//    driver.get("https://www.tnpsc.gov.in/home.aspx");
//      driver.manage().window().maximize();
//
//        } else if (browserName.equalsIgnoreCase("firefox")) {
//            System.setProperty("webdriver.gecko.driver", "C:\\USB\\Driver\\geckodriver.exe");
//            WebDriver firefoxDriver = new FirefoxDriver();
//          driver.manage().window().maximize();
//        }
//    }

    public void browser(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\USB\\Driver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\USB\\Driver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.get("https://www.tnpsc.gov.in/home.aspx");
        driver.manage().window().maximize();

    }

}

