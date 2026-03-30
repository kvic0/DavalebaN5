import StepObject.FilterPageStep;
import Utils.Runner;
import com.codeborne.selenide.*;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class FilterTest extends Runner {
    FilterPageStep filterPageStep =  new FilterPageStep();
    @Test(description = "price sort to upper")
    public void FilterPageTestToUpper(){
        open("/mobiluri-telefonebi-c855?priceAsc=false&nameAsc=");

        filterPageStep.SortButton.click();
        filterPageStep.SortToLower.click();

        filterPageStep.SortCheckLower(filterPageStep.priceCollection);


    }
    @Test(description = "price sort to lower")
    public void FilterPageTestToLower(){
        open("/mobiluri-telefonebi-c855?priceAsc=false&nameAsc=");

        filterPageStep.SortButton.click();
        filterPageStep.SortToUpper.click();

        filterPageStep.SortCheckUpper(filterPageStep.priceCollection);

    }

}
