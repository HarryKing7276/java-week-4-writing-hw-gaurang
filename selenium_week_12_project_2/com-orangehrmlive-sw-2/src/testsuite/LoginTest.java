package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * 2. Create the package ‘testsuite’ and create the
 * following classes inside the ‘testsuite’ package.
 * 1. LoginTest
 * 2. ForgotPasswordTest
 */
public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    /**
     * 1. userShouldLoginSuccessfullyWithValidCredentials
     * Enter “Admin” username
     * Enter “admin123 password
     * Click on ‘LOGIN’ button
     * Verify the ‘Dashboard’ text is display
     */
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        // Enter "Admin" username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        // Enter “admin123 password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        // Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // Verify the ‘Dashboard’ text is display
        String actualText = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        String expectedText = "Dashboard";
        Assert.assertEquals("We are not on correct x-path for text", actualText, expectedText);
        System.out.println("We are on correct x-path - congratulations");
        Thread.sleep(5000);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
