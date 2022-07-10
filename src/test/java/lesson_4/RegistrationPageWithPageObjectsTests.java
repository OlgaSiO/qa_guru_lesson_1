package lesson_4;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.SuccessFormRegistration;

import java.io.File;
import java.util.Locale;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static lesson_4.TestData.*;

public class RegistrationPageWithPageObjectsTests extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    File file = new File("src/test/resources/photo_1.jpg");
    SuccessFormRegistration successFormRegistration = new SuccessFormRegistration();
    //Faker
    Faker faker = new Faker(new Locale("en"));
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String userEmail = faker.internet().emailAddress();
    String userNumber = faker.phoneNumber().subscriberNumber(10);
    String currentAddress = faker.address().fullAddress();

    @Test
    void successfulRegistrationPage() {
        registrationPage
                .openPage()
                .enterFistName(firstName)
                .enterLastName(lastName)
                .enterEmail(userEmail)
                .choiceFemale()
                .choiceMale()
                .choiceOther()
                .enterNumber(userNumber)
                .choiceSubject("English")
                .choiceHobbiesSport()
                .choiceHobbiesReading()
                .choiceHobbiesMusic()
                .uploadFile(file)
                .enterCurrentAddress(currentAddress)
                .choiceState("Haryana")
                .choiceCity("Panipat")
                .birthday.setDate(dateBirthday, monthBirthday, yearBirthday);
        registrationPage.submitClick();
        successFormRegistration
                .checkThanksForRegistration()
                .checkInformationInTheTAble(firstName)
                .checkInformationInTheTAble(lastName)
                .checkInformationInTheTAble(userEmail)
                .checkInformationInTheTAble("Others")
                .checkInformationInTheTAble(userNumber)
                .checkInformationInTheTAble(birthday)
                .checkInformationInTheTAble("English")
                .checkInformationInTheTAble(choiceAllHobbies)
                .checkInformationInTheTAble(file.getName())
                .checkInformationInTheTAble("Haryana Panipat");
    }
}
