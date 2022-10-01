
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class RedBusTask {


    public static void main(String[] args) throws AWTException, InterruptedException {

        System.setProperty("webdriver.chrome.driver","E:\\TrainingSelenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();

        Robot robotClass = new Robot();
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement elmntfrom = driver.findElement(By.id("src"));
        elmntfrom.sendKeys("Chennai");
        Thread.sleep(3000);
        robotClass.keyPress(KeyEvent.VK_TAB);

        WebElement elmntto = driver.findElement(By.id("dest"));
        elmntto.sendKeys("Coimbatore");
        Thread.sleep(3000);
        robotClass.keyPress(KeyEvent.VK_TAB);

        Thread.sleep(3000);
        Date date = new Date();
        System.out.println(date.getDate());
        int currentDate = date.getDate();

        Thread.sleep(3000);

        String elmntdate = new StringBuilder()
                .append("//tr/td[text()='").append("<<REPLACEMENT>>").append("']").toString();

        System.out.println(By.xpath(elmntdate.replaceAll("<<REPLACEMENT>>", String.valueOf(currentDate))));

        WebElement elmntCurrentDate = driver.findElement(By.xpath(elmntdate.replaceAll("<<REPLACEMENT>>", String.valueOf(currentDate))));
        waits.until(ExpectedConditions.elementToBeClickable(elmntCurrentDate));
        elmntCurrentDate.click();

        WebElement elmntSearch = driver.findElement(By.xpath("//button[.='Search Buses']"));
        waits.until(ExpectedConditions.elementToBeClickable(elmntSearch));
        elmntSearch.click();

        Thread.sleep(3000);
        WebElement elmntPopup = driver.findElement(By.xpath("//div[@class='close-primo']"));
        waits.until(ExpectedConditions.elementToBeClickable(elmntPopup));
        elmntPopup.click();

        JavascriptExecutor js =(JavascriptExecutor)driver;

        Thread.sleep(6000);
        List<WebElement> elmntViewSeats = driver.findElements(By.xpath("//div[.='IntrCity SmartBus']/ancestor::div[@class='clearfix bus-item']/child::div[@class='clearfix m-top-16']/child::div[.='View Seats']"));
        System.out.println("Seat1:::::::::::" + elmntViewSeats.size());
        Thread.sleep(6000);
        List<WebElement> elmntViewSeats2 = driver.findElements(By.xpath("//div[text()='IntrCity SmartBus']/ancestor::div[@class='clearfix bus-item']/child::div[@class='clearfix m-top-16']/child::div[.='View Seats']"));
        System.out.println("Seat2:::::::::::::" + elmntViewSeats2.size());








    }



}
