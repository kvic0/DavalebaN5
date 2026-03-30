package PageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginPageObject {
    public SelenideElement  LoginBuuton = $(byText("შესვლა"));
    public SelenideElement RegPompt = $(byText("რეგისტრაცია"),0);
    public SelenideElement RegButton = $("button");
    public  SelenideElement RuleCheckBox = $(byClassName("gOeNsK"));
    public SelenideElement PhonenumberFild = $(byClassName("CFnMV"));






}
