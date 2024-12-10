package selenium_code;

public class Navigation
{
    public static void main(String[] args) {

        driver.navigate().to(url);

        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();


        //refresh another method
        driver.navigate().to(driver.getCurrentUrl());
    }
}
