/**
 * Напишите программу на Java, чтобы продемонстрировать явную проверку условий ожидания.
 *
 * В Selenium есть два основных типа ожидания – неявное(Implicit Wait) и явное (Explicit Wait).
 * 
 * Неявное ожидание - объявляется один раз в коде вне операции поиска и действует до изменения.
 * Это ожидание выполняется независимо от какого-либо условия и применяется ко всем последующим операциям поиска неявно.
 * В приведенной ниже программе вы можете видеть применение такого ожидания для Google Chrome.  Мы использовали несколько
 * встроенных методов для установки свойства, максимизации окна, навигации по URL и поиска веб-элементов.
 *
 * WebDriverWait waitWD = new WebDriverWait(currentDriver, 20);
 * WebElement secondElement = waitWD.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Тестирование
 * программного обеспечения - Википедия")));
 *
 * В приведенном выше фрагменте кода вы можете видеть, что мы создали объект waitWD для WebDriverWait,
 * а затем мы выполнили поиск WebElement с именем secondElement.
 * Условие установлено таким образом, что веб-драйверу придется ждать, пока мы не увидим ссылку
 * «Тестирование программного обеспечения - Википедия» на веб-странице. Команда не выполнится, если не найдет эту ссылку.
 * Если ссылка будет найдена, то веб-драйвер выполнит щелчок мышью по этой ссылке.
 */

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
