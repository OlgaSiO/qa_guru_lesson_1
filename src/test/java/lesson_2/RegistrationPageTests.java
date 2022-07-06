package lesson_2;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPageTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = false;
    }

    @Test
    void successfulRegistrationPage() {

        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Olga");
        $("#lastName").setValue("Sindeeva");
        $("#userEmail").setValue("sin@gmail.com");
        $(".custom-control-label").click();
        $("#userNumber").setValue("1111111111");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("1996");
        $x("//div[contains(text(),'15')]").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $x("//label[contains(text(),'Sport')]").click();
        $x("//label[contains(text(),'Reading')]").click();
        $x("//label[contains(text(),'Music')]").click();
        File file = new File("src/test/resources/photo_1.jpg");
        $("#uploadPicture").uploadFile(file);
        $("#currentAddress").setValue("Spb");
        $("#react-select-3-input").setValue("Haryana").pressEnter();
        $("#react-select-4-input").setValue("Panipat").pressEnter();
        $("#submit").scrollTo();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldBe(visible);
        $(".table-responsive").shouldHave(text("Olga"));
        $(".table-responsive").shouldHave(text("Sindeeva"));
        $(".table-responsive").shouldHave(text("sin@gmail.com"));
        $(".table-responsive").shouldHave(text("Female"));
        $(".table-responsive").shouldHave(text("1111111111"));
        $(".table-responsive").shouldHave(text("15 July,1996"));
        $(".table-responsive").shouldHave(text("English"));
        $(".table-responsive").shouldHave(text("Sports, Reading, Music"));
        $(".table-responsive").shouldHave(text("photo_1.jpg"));
        $(".table-responsive").shouldHave(text("Haryana Panipat"));

    }
}
