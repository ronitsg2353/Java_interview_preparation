package selenium_code;

import java.util.concurrent.TimeUnit;

public class Waits {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        //static wait
        Thread.sleep(2000);

        //implicit wait
        driver.manage().timeout().window().implilictlyWait(1000, TimeUnit.SECONDS);

        //Explcit wait
       WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(WebElement));

        //Fluent wait
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(5000, TimeUnit.MILLISECONDS).pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.alertIsPresent());

    }
}
