import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobtn {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","E:\\TrainingSelenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://testleaf.herokuapp.com/");

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//h5[text()='Checkbox']"));
        element.click();

        WebElement radioBtn = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        radioBtn.click();

        Thread.sleep(5);

        driver.close();



    }


}
