package selenium_code;


public class Actions_class {
    public static void main(String[] args) {



        Actions action=new Actions(driver);
        action.moveToElement().build().perform();


        //1.click action

        WebElement element=driver.findElement(By.xpath(""));
        action.click(element).build().perform();

        //2.DoubleClick
        Actions action1=new Actions(driver);
        action1.doubleClick(element).build().perform();

        //content-click-right click
        Actions action2=new Actions(driver);
        action2.contextClick(element).build().perform();

        //DragAndHold
        Actions action3=new Actions(driver);
        action3.dragAndHold(element).build().perform();

        //DragAndDrop
        Actions action4=new Actions(driver);
        action4.dragAndDrop(source,destination).build().perform();

    //Keyboard events

        //1.click on Tab Key
        Actions action5=new Actions(driver);
       action5.sendKeys(keys.TAB).build().perform();


        //copy Paste
        Actions actions6=new Actions(driver);
        actions6.keyDown(Keys.CONTROL);
        actions6.sendKeys("c");
        actions6.KeyUp(Keys.CONTROL);
        actions6.KeyDown(Keys.CONTROL);
        actions6.sendKeys("v");
        actions6.sendKeys(Keys.CONTROL);
        actions6.build().perform();










    }
}
