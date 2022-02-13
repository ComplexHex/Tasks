import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EleventhTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C\\driver\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("-disable-arguments");
        WebDriver currentDriver = new ChromeDriver();
        currentDriver.manage().window().maximize();
        currentDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        currentDriver.navigate().to("http://www.google.com");
        WebElement currentElement = currentDriver.findElement(By.name("q"));
        currentElement.sendKeys("Testing");
        currentElement.submit();
        WebDriverWait waitWD = new WebDriverWait(currentDriver, 20);

        WebElement secondElement = waitWD.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Test program software")));

        secondElement.click();
    }
}
