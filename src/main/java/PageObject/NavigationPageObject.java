package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class NavigationPageObject {
    public SelenideElement NavigationButton = $(By.className("iULBSS"),0);
    public ElementsCollection SelectCityButton = $$(By.className("jCyoI"));
    public ElementsCollection NavigationCites = $$(By.className("jiVfib"));


}
