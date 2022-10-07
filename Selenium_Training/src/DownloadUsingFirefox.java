import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DownloadUsingFirefox {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\USB\\Driver\\geckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("browser.download.folderList", 2);
        options.addPreference("browser.download.dir", "C:\\USB\\Selenium_Training\\Downloads");
        WebDriver driver = new FirefoxDriver(options);

        driver.get("https://www.selenium.dev/downloads/");

        WebElement download = driver.findElement(By.xpath("//a[text()='4.5.0']"));
        download.click();
    }

}

/*
# CSV mimetype = 'text/csv'
        # TXT mimetype = 'text/txt'
        # EXCEL mimetype = 'application/vnd.ms-excel'*/
