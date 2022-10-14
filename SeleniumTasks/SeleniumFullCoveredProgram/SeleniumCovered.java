package SeleniumFullCoveredProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeleniumCovered {

    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "E:\\TrainingSelenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/");
        driver.manage().window().maximize();
//Explicit Wait
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds  (10));
// Radio Button
        WebElement elmntRadioBtn = driver.findElement(By.xpath("//h5[.='Radio Button']"));
        elmntRadioBtn.click();
        WebElement radioBtn = driver.findElement(By.id("yes"));
        waits.until(ExpectedConditions.elementToBeClickable(radioBtn));
        radioBtn.click();
        driver.navigate().back();
//ChechBox
        WebElement checkBox = driver.findElement(By.xpath("//h5[.='Checkbox']"));
        checkBox.click();
        WebElement elmntCheckBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        elmntCheckBox.click();
        driver.navigate().back();
//DropDown
        WebElement dropDown = driver.findElement(By.xpath("//h5[text()='Drop down']"));
        dropDown.click();
        WebElement dropdownByIndex = driver.findElement(By.xpath("//select[@id='dropdown1']"));
        Select selectIndex = new Select(dropdownByIndex);
        selectIndex.selectByIndex(0);
        selectIndex.selectByValue("1");
        selectIndex.selectByVisibleText("Selenium");
        driver.navigate().back();
//Alert
        WebElement alert = driver.findElement(By.xpath("//h5[.='Alert']"));
        alert.click();
        WebElement btnPrompt = driver.findElement(By.xpath("//button[.='Prompt Box']"));
        btnPrompt.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.navigate().back();
//New Window
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        waits.until(ExpectedConditions.numberOfWindowsToBe(2));
        driver.get("https://www.redbus.in/");
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        System.out.println(driver.getTitle());
        WebElement elmntHelp = driver.findElement(By.xpath("//a[.='Help']"));
        elmntHelp.click();
//Windows Handling
        waits.until(ExpectedConditions.numberOfWindowsToBe(3));
        driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
        Thread.sleep(8000);
//Frame
        WebElement frame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
        waits.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
        WebElement elmntText = driver.findElement(By.xpath("//div[@class='social FC DIB']/div[.='Sign in for faster support for all your queries!!']"));
        System.out.println(elmntText.getText());
        driver.switchTo().defaultContent();
        driver.close();
//Robot Class
        Robot robotClass = new Robot();
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        WebElement elmntfrom = driver.findElement(By.id("src"));
        elmntfrom.sendKeys("Chennai");
        Thread.sleep(3000);
        robotClass.keyPress(KeyEvent.VK_TAB);
        WebElement elmntto = driver.findElement(By.id("dest"));
        elmntto.sendKeys("Coimbatore");
        Thread.sleep(3000);
        robotClass.keyPress(KeyEvent.VK_TAB);
//Current Date
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
//WebElements
        List<WebElement> lstElements = driver.findElements(By.xpath("//ul[@class='bus-items']/div"));
        System.out.println("Elements in the list are " + lstElements.size());
        WebElement elmnt1 = lstElements.get(0);
        System.out.println(elmnt1.getText());
        for (int i = 0; i <lstElements.size();i++){
            WebElement elmnt = lstElements.get(i);
            System.out.println("List Elements ::::::" + elmnt.getText());
        }






    }
}