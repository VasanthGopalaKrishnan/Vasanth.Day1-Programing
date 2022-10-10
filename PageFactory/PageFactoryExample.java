package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class PageFactoryExample extends Browser implements HotelPage {

    PageFactoryExample() {
        super(driver);
    }

    @FindBy (id="username")
     static WebElement elmntUsernmae;

    @FindBy (how = How.XPATH, using = "//input[@type='password']")
     static WebElement elmntPassword;

    @FindBy (id ="login")
     static WebElement btnLogin;

    @FindBy (className = "welcome_menu")
    static WebElement elmntWelcome;


    @Override
    public void login() {
        PageFactory.initElements(driver,this);
        elmntUsernmae.sendKeys("Vasanthgs192");
        elmntPassword.sendKeys("vasanth");
        btnLogin.click();
    }


    @Override
    public void selcetHotel() {
        PageFactory.initElements(driver,this);
        boolean result = elmntWelcome.isDisplayed();
        System.out.println(result);

    }


}
