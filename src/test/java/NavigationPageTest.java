import StepObject.NavigationPageStep;
import Utils.Runner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class NavigationPageTest extends Runner {
    NavigationPageStep navigationPageStep = new NavigationPageStep();

    @Test(description = "test city sort")
    public void NavigationPageTest (){
        open("/branches");
        navigationPageStep.NavigationButton.click();
        navigationPageStep.SelectCityButton.findBy(text("თბილისი")).click();

        sleep(200);

        navigationPageStep.Check(navigationPageStep.NavigationCites);

    }

}
