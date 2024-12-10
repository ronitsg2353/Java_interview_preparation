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

 //JavascriptExceutor for click button
 JavascriptExecutor js1=(JavascriptExecutor)driver;
 js1.executeScript("document.getElementByID(" element").click();");


 //JavascriptExceutor for send text
  JavascriptExceutor js2=(JavascriptExceutor)driver;
  js2.executeScript("document.getElementByID('element id').value='Ronit';");

  //JavascriptExceutor for refresh browser window
  JavascriptExceutor js3=(JavascriptExceutor)driver;
  js3.executeScript("location.reload()");

  //JavascriptExcector for interact with checkbox
  JavascriptExceutor js4=(JavascriptExecutor)driver;
  js4.exceuteScript("document.getElementByID('element id').checked-false");

//inner text
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("document.getElementID("").innertext;").toString();

        string sText =  js.executeScript(“return document.title;”).toString();

        alert poput window--> Js.executeScript(“alert(‘hello world’);”);

            Thread.sleep(2000)
            driver.close();
    }
}
