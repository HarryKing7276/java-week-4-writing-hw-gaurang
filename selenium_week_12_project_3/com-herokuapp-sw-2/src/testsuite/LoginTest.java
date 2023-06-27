package testsuite;

/**
 * 2. Create the package ‘testsuite’ and create the
 * following class inside the ‘testsuite’ package.
 * 1. LoginTest
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    /**
     * 3. Write down the following test into ‘LoginTest’ class
     * 1. userShouldLoginSuccessfullyWithValidCredentials
     * * Enter “tomsmith” username
     * * Enter “SuperSecretPassword!” password
     * * Click on ‘LOGIN’ button
     * * Verify the text “Secure Area”
     */
    //  1. userShouldLoginSuccessfullyWithValidCredentials
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        //  * Enter “tomsmith” username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
        //  * Enter “SuperSecretPassword!” password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
        //   * Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        //   * Verify the text “Secure Area”
        String actualText = driver.findElement(By.xpath("//h2[contains(text(),'Secure Area')]")).getText();
        String expectedText = "Secure Area";
        Assert.assertEquals("We are not not Secure Area text, Please check your x-path", actualText, expectedText);
        System.out.println("We are on correct x-path to verify text - congratulations");
        Thread.sleep(5000);
    }

    /**
     * 2. verifyTheUsernameErrorMessage
     * * Enter “tomsmith1” username
     * * Enter “SuperSecretPassword!” password
     * * Click on ‘LOGIN’ button
     * * Verify the error message “Your username is invalid!"
     */
    @Test
    public void verifyTheUserNameErrorMessage() throws InterruptedException {
        //  * Enter “tomsmith1” username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith1");
        //  * Enter “SuperSecretPassword!” password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
        //   * Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        //   * Verify the text “Your username is invalid!”
        String actualText = driver.findElement(By.xpath("//div[contains(text(),'Your username is invalid!')]")).getText();
        String expectedText = "Your username is invalid!";

        Assert.assertEquals(" Please check your x-path", actualText, expectedText);
        System.out.println("We are on correct x-path to verify text - congratulations");
        Thread.sleep(5000);
// X-path is correct and message displayed in console is same (in error section)- still failing
    }

    @Test
    public void verifyThePasswordErrorMessage() throws InterruptedException {
        //  * Enter “tomsmith” username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
        //  * Enter “SuperSecretPassword!” password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword");
        //   * Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        //   * Verify the text “Your password is invalid!”
        String actualText = driver.findElement(By.xpath("//div[@id='flash-messages']")).getText();
        String expectedText = "Your password is invalid!";
        Assert.assertEquals(" Please check your x-path", actualText, expectedText);
        System.out.println("We are on correct x-path to verify text - congratulations");
        Thread.sleep(5000);
// X-path is correct and message displayed in console is same (in error section)- still failing
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}