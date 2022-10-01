import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E:\\TrainingSelenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/droppable/");

        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        By frame = By.xpath("//iframe[@class='demo-frame']");

        WebElement elmntframe = driver.findElement(frame);


// By WebElement
        driver.switchTo().frame(elmntframe);

// By Index
//        driver.switchTo().frame(0);


        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));


        act.dragAndDrop(drag,drop).perform();




    }

}
