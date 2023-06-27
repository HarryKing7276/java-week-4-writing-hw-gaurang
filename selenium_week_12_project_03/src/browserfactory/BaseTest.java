package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**    1. Create the package ‘browser-factory’ and create the
 *         class with the name ‘BaseTest’ inside the
 *        ‘browser-factory’ package. And write the browser setup
 *         code inside the class ‘Base Test’.
 */


public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseUrl){
        // Declare the Driver
         driver = new ChromeDriver();
        // Launch the URL into Browser
        driver.get(baseUrl);
        //Maximise the driver
        driver.manage().window().maximize();
        //We will give some implicit time for Url to load in Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void closeBrowser(){
        driver.quit();
    }
}
