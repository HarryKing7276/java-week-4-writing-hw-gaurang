package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * 4. Write down the following test into
 * ‘ForgotPasswordTest’ class
 * 1.userShouldNavigateToForgotPasswordPageSuccessfully
 * click on the ‘Forgot your password’ link
 * Verify the text ‘Reset Password’
 */

public class ForgotPasswordTest extends BaseTest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    /**
     * 4.  Write down the following test into
     * ‘ForgotPasswordTest’ class
     * 1. userShouldNavigateToForgotPasswordPageSuccessfully
     * click on the ‘Forgot your password’ link
     * Verify the text ‘Reset Password’
     */
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() throws InterruptedException {
        // Click on forgot password link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        // Verify the text 'Reset Password'
        String actualText = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")).getText();
        String expectedText = "Reset Password";
        Assert.assertEquals("We are not on correct x-path for text", actualText, expectedText);
        System.out.println("We are on correct x-path for text Reset Password");
        Thread.sleep(5000);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}
