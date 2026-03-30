package StepObject;

import PageObject.FilterPageObject;
import com.codeborne.selenide.*;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class FilterPageStep extends FilterPageObject {

    public FilterPageStep SortCheckLower(ElementsCollection element) {
        System.out.println("elementsize: "+element.size());
        element.shouldHave(CollectionCondition.sizeGreaterThanOrEqual(27));


        System.out.println("elementsize: "+element.size());
        int size = element.size();

        System.out.println(size);
        Integer [] collect = new Integer[size];
        System.out.println(collect.length);

        for (int j = 0; j < size; j++) {
            System.out.println(element.get(j).getText() + "index: "+j);
            collect[j] = (Integer.parseInt(element.get(j).getText().replaceAll("[^0-9]","" )));
        }

        System.out.print(collect.length);



        for (int j = 0; j < size-1; j++) {
            Assert.assertTrue(collect[j] >= collect[j+1],"collection is not sorted at index:  " + j +" "+ collect[j+1] + " is not equal or less " + collect[j] );
        }

        return this;
    }

    public FilterPageStep SortCheckUpper(ElementsCollection element) {

        System.out.println("elementsize: "+element.size());
        element.shouldHave(CollectionCondition.sizeGreaterThanOrEqual(27));


        System.out.println("elementsize: "+element.size());
        int size = element.size();
        Integer [] collect = new Integer[size];
        for (int j = 0; j < size; j++) {
            System.out.println(element.get(j).getText() + "index: "+j);
            collect[j] = (Integer.parseInt(element.get(j).getText().replaceAll("[^0-9]","")));
        }




        for (int j = 0; j < size-1; j++) {
            Assert.assertTrue(collect[j] <= collect[j+1],"collection is not sorted at index:  " + j + " " +collect[j] + " is not equal or more " + collect[j+1] );
        }



        return this;
    }

    public FilterPageStep NextPage(ElementsCollection elements) {

//        for(int i=0;i<elements.size();i++) {
//
//            NP.findBy(Condition.text("მეტის ნახვა")).scrollTo().shouldBe(visible,Duration.ofMillis(6000)).click();
//            System.out.println(i);
//        }
        System.out.println(NP.last().lastChild().getText());




        return this;
    }

}
