import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TNPSC {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "E:\\TrainingSelenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.tnpsc.gov.in/");

        System.out.println(driver.getTitle());

        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
        waits.until(ExpectedConditions.titleIs("TNPSC - Tamil Nadu Public Service Commission"));

        WebElement elmntApplyOnline = driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Apply Online']"));
        waits.until(ExpectedConditions.visibilityOf(elmntApplyOnline));
        waits.until(ExpectedConditions.elementToBeClickable(elmntApplyOnline));
        elmntApplyOnline.click();

        System.out.println(driver.switchTo().alert().getText());

        waits.until(ExpectedConditions.alertIsPresent());
//        driver.switchTo().alert().accept();
//        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();

        try {
            waits.until(ExpectedConditions.numberOfWindowsToBe(2));
            System.out.println("True");
        } catch (TimeoutException e) {
            //   e.printStackTrace();
            System.out.println("False");
            // e.getMessage();
        } catch (Exception e) {
            e.getMessage();
        } finally {
            System.out.println("---> Overall Window size is, " + driver.getWindowHandles().size());

        }

//        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());

        Thread.sleep(5000);

        WebElement elmntNotification = driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Notification']"));
        elmntNotification.click();
    }

}
