import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDaySelenium {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E:\\TrainingSelenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement currentelement = driver.switchTo().activeElement();
        currentelement.sendKeys("Vasanth");
        currentelement.submit();

    }


}
