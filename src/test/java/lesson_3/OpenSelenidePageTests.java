package lesson_3;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class OpenSelenidePageTests {

    @BeforeAll
    static void beforeAll() {
        open("https://github.com/");
    }

    @Test
    void openPageSelenideAndCheckInformation() {
        $("[name=\"q\"]").setValue("selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        $("#wiki-tab").click();
        $("#wiki-body > div > ul:nth-child(3) > li:nth-child(6) > a").shouldHave(Condition.text("Soft assertions"));
        $("#wiki-body > div > ul:nth-child(3) > li:nth-child(6) > a").click();
        $("#user-content-2-using-junit4-just-describe-rule-inside-test-class").shouldBe();
        $("#user-content-3-using-junit5-extend-test-class").shouldBe();

    }
}
