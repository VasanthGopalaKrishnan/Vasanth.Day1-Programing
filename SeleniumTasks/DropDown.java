import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","E:\\TrainingSelenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

        driver.manage().window().maximize();

        WebElement dropDown = driver.findElement(By.xpath("//p/select"));
        dropDown.click();
        Select select = new Select(dropDown);
        select.selectByVisibleText("Afghanistan");

    }

}
