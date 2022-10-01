import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClass {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E:\\TrainingSelenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://testleaf.herokuapp.com/");

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//h5[text()='Drop down']"));
        element.click();

        WebElement dropdownByIndex = driver.findElement(By.xpath("//select[@id='dropdown1']"));
        Select selectIndex = new Select(dropdownByIndex);
        selectIndex.selectByIndex(0);
        selectIndex.selectByValue("1");
        selectIndex.selectByVisibleText("Selenium");


//        WebElement dropdownByValue = driver.findElement(By.xpath("//select[@id='dropdown1']"));
//        Select selectValue = new Select(dropdownByValue);
//        selectValue.selectByValue("1");
//
//        WebElement dropdownByVisible = driver.findElement(By.xpath("//select[@id='dropdown1']"));
//        Select selectVisible = new Select(dropdownByVisible);
//        selectVisible.selectByVisibleText("Selenium");

        driver.close();
















    }


}
