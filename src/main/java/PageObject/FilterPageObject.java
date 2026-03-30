package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByAttribute;
import org.openqa.selenium.By;

public class FilterPageObject {
    public SelenideElement SortButton = $(By.cssSelector("img[src='/icons/selector-down-arr.svg']"));
    public SelenideElement SortToLower = $(byText("ფასი: კლებადობით"),0);
    public SelenideElement SortToUpper = $(byText("ფასი: ზრდადობით"),0);
    public ElementsCollection priceCollection = $$(By.className("jZFYbj"));
    public SelenideElement Page = $(By.className("dQsAMy"));

    public ElementsCollection NextPageSize1 = $$(byText("მეტის ნახვა"));
    public ElementsCollection NP = $$(By.className("chJlqY"));


}
