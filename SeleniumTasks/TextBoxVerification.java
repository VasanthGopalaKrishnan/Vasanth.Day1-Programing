import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxVerification {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E:\\TrainingSelenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        WebElement elmntEmail = driver.findElement(By.id("email"));
        elmntEmail.sendKeys("Vasanth");

        String email = elmntEmail.getAttribute("value");

        System.out.println("My mail id is " + email);

        WebElement btnLogin = driver.findElement(By.name("login"));
        System.out.println(btnLogin.isDisplayed());


    //    CSS selector

/*        driver.findElement(By.cssSelector("#email"));
        driver.findElement(By.cssSelector(".email"));
        driver.findElement(By.cssSelector("input[id='email']"));
        driver.findElement(By.cssSelector("div>input[id='email']"));*/


    }
}
