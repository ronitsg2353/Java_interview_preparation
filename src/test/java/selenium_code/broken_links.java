package selenium_code;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class broken_links {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);


        //get the links from webpage
        List<WebElement> link=driver.findElements(By.tagName("a"));

        //find the size of links
        System.out.println(link.size());


        //iterate the links on webpage
        for(int i=0;i<link.size();i++) {
            WebElement element = link.get(i);
            String url = element.getAttribute("href");
            URL url1 = new URL(url);
            System.out.println(url1);

            //make a httpconnection for returning response code

            HttpsURLConnection connection = (HttpsURLConnection) url1.openConnection();
            connection.connect();

            //broken links having code more than 400

            int rescode = connection.getResponseCode();
            if (rescode >400) {
                System.out.println(url1 + " url is broken links");
            }
            else {
                System.out.println(url1 + "url is not broken links");
            }



        }
        driver.close();

    }
}
