package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * 2. Create the package ‘testsuite’ and create the
 * following class inside the ‘testsuite’ package.
 * 1. LoginTest
 **/

public class LoginTest extends BaseTest {

    /**
     * 3. Write down the following test into ‘LoginTest’ class
     * 1.   userShouldNavigateToLoginPageSuccessfully
     * click on the ‘Sign In’ link
     * Verify the text ‘Welcome Back!’
     */

    String baseUrl = "https://courses.ultimateqa.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    // Method for the test


    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        // Command to find element and  click on 'Sign In ' Link
        driver.findElement(By.xpath("//a[@href='/users/sign_in']")).click();
    }

    /**
     * 2. verifyTheErrorMessage
     * click on the ‘Sign In’ link
     * Enter invalid username
     * Enter invalid password
     * Click on Login button
     * Verify the error message ‘Invalid email or password'.
     */
    @Test
    public void verifyTheErrorMessage() throws InterruptedException {
        // Click on Sign In link
        driver.findElement(By.xpath("//a[@href='/users/sign_in']")).click();
        // Enter invalid username
        driver.findElement(By.xpath("//input[@id='user[email]']")).sendKeys("Prime@gmail.com");
        // Enter invalid password
        driver.findElement(By.xpath("//input[@id='user[password]']")).sendKeys("Prime123");
        // Click on login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // Verify the error message 'invalid email or password'
        String actualText = driver.findElement(By.xpath("//li[@class='form-error__list-item']")).getText();
        String expectedText = "Invalid email or password.";
        Assert.assertEquals("Please get correct x-path for error message", expectedText, actualText);
        System.out.println("We are on error message successfully with correct x-path");
        Thread.sleep(5000);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}
