package selenium_code;

public class DropDown {
    public static void main(String[] args) {

        Select select=new Select();
        WebElement list=driver.findElement(By.xpath(""));


        //1.selectById
        select.selectById(id);

        //visible text
        select.selectByVisibleText("Ronit");

        //index
        select.selectByIndex(int index);

        //Slect by value
        select.selectByValue("value");


        //fetch all options
        select.getOption();

        //check the deselect options
        select.deselectAll();

        //check the multiple selection--boolean
        select.isMultiple();


    }
}
