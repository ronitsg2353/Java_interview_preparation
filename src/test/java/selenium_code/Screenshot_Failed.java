package selenium_code;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.File;
import java.util.logging.FileHandler;

public class Screenshot_Failed {

    public static void main(String[] args) {

        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File Destination="";
        FileHandler.copy(Destination,source);

    }
}
