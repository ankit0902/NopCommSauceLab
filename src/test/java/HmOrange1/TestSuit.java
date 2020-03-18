package HmOrange1;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();


    @Test
    public void userShouldAbleToRegisterSuccessfully()  {
        //Click on register button
        homePage.clickOnRegisterButton();
        //To fill Registration details
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEnterRegistrationDetails();
        //Verify registration success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();

    }
}
