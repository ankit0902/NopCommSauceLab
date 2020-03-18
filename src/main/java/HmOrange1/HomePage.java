package HmOrange1;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    //Locator for register link
    private By _registerLink =By.linkText("Register");



    //click on register button
    public void clickOnRegisterButton() {
        clickOnElement(_registerLink);
    }
}
