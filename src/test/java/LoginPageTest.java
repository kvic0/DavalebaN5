import StepObject.LoginPageStep;
import Utils.Runner;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.codeborne.selenide.Condition;


import static DataObject.LoginPageData.PhoneNumber;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.sleep;


public class LoginPageTest extends Runner {
    LoginPageStep loginPageStep = new LoginPageStep();


    @Test(description = "test button activity on login page")
    public void LoginButtonTest(){
        loginPageStep.LoginBuuton.click();
        loginPageStep.RegPompt.click();


        Assert.assertEquals(loginPageStep.RegButton.getAttribute("tabindex"), "-1", "button should not be active");
        loginPageStep.FillPhonenumberField(PhoneNumber);

        Assert.assertEquals(loginPageStep.PhonenumberFild.getValue(), PhoneNumber, "Registration phone number is different");

        Assert.assertEquals(loginPageStep.RegButton.getAttribute("tabindex"), "-1", "button should not be active");

        loginPageStep.RuleCheckBox.click();

        Assert.assertEquals(loginPageStep.RegButton.getAttribute("tabindex"), "0", "button should  be active");


    }

}
