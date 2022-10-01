import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","E:\\TrainingSelenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");

        driver.manage().window().maximize();

        Actions act = new Actions(driver);

//        WebElement btnClose = driver.findElement(By.xpath("(//div//child::button)[2]"));
//        btnClose.click();

        Thread.sleep(2);
        WebElement btnLogin = driver.findElement(By.xpath("//div//a[text()='Login']"));
        act.moveToElement(btnLogin).perform();

        Thread.sleep(2);
        WebElement btnMore = driver.findElement(By.xpath("//div[text()='More']"));
        act.moveToElement(btnMore).perform();

        driver.close();

    }


}
