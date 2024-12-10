package selenium_code;

public class DesiredCapabilites {
    public static void main(String[] args) {

        //DesiredCapabilites having os,window configuration
        
        DesiredCapabilites capabilites=new DesiredCapabilites();
        capabilites.setCapability("browser", "Chrome");
        capabilites.setCapability("browser_version", "128.0");
        capabilites.setCapability("os", "Windows");
        capabilites.setCapability("os_version", "11");

    }
}
