package StepObject;

import PageObject.NavigationPageObject;
import com.codeborne.selenide.*;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.sleep;

public class NavigationPageStep extends NavigationPageObject {
    public NavigationPageStep Check(ElementsCollection elements) {
        List<String> texts = elements.texts();

        for (int i = 0; i < texts.size()-1; i++) {
            System.out.println(texts.get(i));
            System.out.println(texts.get(i + 1));

            Assert.assertEquals(texts.get(i), texts.get(i + 1), "Location is incorrect");
        }
        return this;
    }
}
