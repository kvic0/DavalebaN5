package StepObject;

import PageObject.LoginPageObject;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.visible;


public class LoginPageStep extends LoginPageObject {

    public LoginPageObject FillPhonenumberField(String Number) {

        PhonenumberFild.shouldBe(Condition.visible).sendKeys(Number);
        return this;
    }



}
