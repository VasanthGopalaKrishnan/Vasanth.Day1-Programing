import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E:\\TrainingSelenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tnpsc.gov.in/");

        driver.manage().window().maximize();

        List<WebElement> lstElements = driver.findElements(By.xpath("//li[@class='notice']"));

        System.out.println("Elements in the list are " + lstElements.size());

        WebElement elmnt1 = lstElements.get(0);
        System.out.println(elmnt1.getText());

        for (int i = 0; i <lstElements.size();i++){
            WebElement elmnt = lstElements.get(i);
            System.out.println("List Elements ::::::" + elmnt.getText());
        }

        for (WebElement elmnt2 : lstElements) {
            System.out.println("List Elements ::::::" + elmnt2.getText());
        }

        lstElements.forEach(elmnt3 -> System.out.println(elmnt3.getText()));


        driver.close();





    }

}
