package Amazon;


import static Amazon.BrowserUtils.driver;

import org.openqa.selenium.WebDriver;

public class LoginPage {

//    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        BrowserUtils browserUtils = new BrowserUtils();
        browserUtils.browser("firefox");
        AmazonPage amazonPage = new AmazonPage(driver);
        amazonPage.clickHome();
        amazonPage.verifyApplyOnline();


    }
}
