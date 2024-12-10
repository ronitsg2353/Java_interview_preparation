package selenium_code;

public class Alert {
    public static void main(String[] args) {

        Alert alert=new Alert();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        driver.switchTo().alert().getText();

       // prompt alert-->
                driver.switchTo().alert().sendKeys("Ronit");
    }
}
