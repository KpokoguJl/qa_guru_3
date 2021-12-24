import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class WikiTest {

    @Test
    public void softAssertionShouldBeOnWikiPage() {

        Configuration.browserSize = "1920x1080";

        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".Box-row.wiki-more-pages-link").$("button").click();
        $$(".m-0.p-0.list-style-none li").findBy(text("SoftAssertions")).click();

        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
    }

}
