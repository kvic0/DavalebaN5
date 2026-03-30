package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class Runner {
    @BeforeMethod(description = "browser configuration")
    public void SetUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
//        Configuration.headless = true;
        Configuration.baseUrl = "https://zoommer.ge";
        open("https://zoommer.ge");

    }
    @AfterMethod(description = "After test Clear")
    public void TearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();

    }
}
