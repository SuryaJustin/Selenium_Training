import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.setProperty("webdriver.chrome.driver", "C:\\USB\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://testleaf.herokuapp.com/");

        String url = driver.getCurrentUrl();
        System.out.println("Current URL" + url);

        String title = driver.getTitle();
        System.out.println("Title" + title);

        String pageSrc = driver.getPageSource();
        System.out.println("PageSource" + pageSrc);

        WebElement linkTex = driver.findElement(By.linkText("Edit"));
        linkTex.click();

        WebElement txtBox = driver.findElement(By.id("email"));
        txtBox.sendKeys("Text Value");

        WebElement disableButton = driver.findElement(By.xpath("//input[@id='email']"));
        System.out.println(disableButton.isEnabled());

        WebElement enableButton = driver.findElement(By.xpath("//input[@disabled='true']"));
        System.out.println(enableButton.isDisplayed());

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().back();

        WebElement drop = driver.findElement(By.xpath("//h5[normalize-space()='Drop down']"));
        drop.click();


        Select select = new Select(driver.findElement(By.xpath("//select[@id='dropdown1']")));
        select.selectByIndex(1);

        WebElement SelectOrNot = driver.findElement(By.xpath("//select[@id='dropdown1']"));
        System.out.println(SelectOrNot.isSelected());

        driver.navigate().back();

        WebElement button = driver.findElement(By.xpath("//h5[normalize-space()='Button']"));
        button.click();

        WebElement tagName=driver.findElement(By.xpath("//button[@id='home']"));
        System.out.println(""+tagName.getTagName());

        WebElement position=driver.findElement(By.xpath("//button[@id='position']"));
        System.out.println(position.getLocation());

        WebElement size=driver.findElement(By.xpath("//button[@id='position']"));
        System.out.println(size.getSize());

        WebElement Css=driver.findElement(By.xpath("//button[@id='position']"));
        System.out.println(Css.getCssValue("font-size"));

        WebElement attribute=driver.findElement(By.xpath("//button[@id='position']"));
        System.out.println(attribute.getAttribute("id"));

        driver.quit();






    }
}