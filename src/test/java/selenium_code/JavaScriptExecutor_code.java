package selenium_code;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutor_code {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.tiaa.org/public");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

//JavaScript Exeuctor for scolling page
        JavascriptExecutor js=(JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");

            Thread.sleep(2000);
            driver.close();
    }
}
