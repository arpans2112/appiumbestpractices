package androiddriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverTest {

    public static void main(String[] args) throws MalformedURLException {


       DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("chromedriverExecutable","D:\\Automation_Project\\MobileAutomationBestPractices\\drivers\\chromedriver.exe");
       desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
       desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
       desiredCapabilities.setCapability("udid", "emulator-5554");
       desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.0");
       desiredCapabilities.setCapability("appPackage", "com.android.chrome");
       desiredCapabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
       desiredCapabilities.setCapability("chromedriverExecutable","D:\\Automation_Project\\MobileAutomationBestPractices\\drivers\\chromedriver.exe");
        desiredCapabilities.setCapability("noReset", "true");

        URL url = new URL("http://127.0.0.1:4890/wd/hub");
//        System.setProperty("webdriver.chrome.driver", "D:\\Automation_Project\\MobileAutomationBestPractices\\drivers\\chromedriver.exe");
        AndroidDriver androidDriver = new AndroidDriver(url,desiredCapabilities);
        androidDriver.activateApp("com.android.chrome");
        androidDriver.get("http://google.com");
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        androidDriver.findElement(By.name("q")).sendKeys("hello this is arpan");
        System.out.println("Ending test case");
        androidDriver.quit();


    }


}
