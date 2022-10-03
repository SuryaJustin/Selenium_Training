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

        driver.get("https://www.wisdomaxis.com/technology/software/data/for-reports/");

        WebElement download = driver.findElement(By.xpath("//a[text()=' Orders-With Nulls.xlsx ']"));
        download.click();
    }

}

/*
# CSV mimetype = 'text/csv'
        # TXT mimetype = 'text/txt'
        # EXCEL mimetype = 'application/vnd.ms-excel'*/
