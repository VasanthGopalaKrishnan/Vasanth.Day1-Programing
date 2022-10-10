package PageFactory;


public class MainMethod extends PageFactoryExample{


    public static void main(String[] args) {

        MainMethod execute = new MainMethod();
        PageFactoryExample.browser("chrome");
        execute.login();
        execute.selcetHotel();
    }



}
