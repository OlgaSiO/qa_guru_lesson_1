package pages;

import com.codeborne.selenide.SelenideElement;
import lesson_4.Calendar;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    public SelenideElement
            firstName = $("#firstName"),
            lastName = $("#lastName"),
            email = $("#userEmail"),
            female = $x("//*[text() = 'Female']"),
            male = $x("//*[text() = 'Male']"),
            other = $x("//*[text() = 'Other']"),
            userNumber = $("#userNumber"),
            subject = $("#subjectsInput"),
            hobbiesSport = $x("//label[contains(text(),'Sport')]"),
            hobbiesReading = $x("//label[contains(text(),'Reading')]"),
            hobbiesMusic = $x("//label[contains(text(),'Music')]"),
            uploadFileButton = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),
            state = $("#react-select-3-input"),
            city = $("#react-select-4-input"),
            submit = $("#submit");

    public Calendar birthday = new Calendar();

    public RegistrationPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        return this;
    }

    public RegistrationPage enterFistName(String value) {
        firstName.setValue(value);
        return this;
    }

    public RegistrationPage enterLastName(String value) {
        lastName.setValue(value);
        return this;
    }

    public RegistrationPage enterEmail(String value) {
        email.setValue(value);
        return this;
    }

    public RegistrationPage choiceFemale() {
        female.click();
        return this;
    }

    public RegistrationPage choiceMale() {
        male.click();
        return this;
    }

    public RegistrationPage choiceOther() {
        other.click();
        return this;
    }

    public RegistrationPage enterNumber(String value) {
        userNumber.setValue(value);
        return this;
    }

    public RegistrationPage choiceSubject(String value) {
        subject.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage choiceHobbiesSport() {
        hobbiesSport.click();
        return this;
    }

    public RegistrationPage choiceHobbiesReading() {
        hobbiesReading.click();
        return this;
    }

    public RegistrationPage choiceHobbiesMusic() {
        hobbiesMusic.click();
        return this;
    }

    public RegistrationPage uploadFile(File value) {
        uploadFileButton.uploadFile(value);
        return this;
    }

    public RegistrationPage enterCurrentAddress(String value) {
        currentAddress.setValue(value);
        return this;
    }

    public RegistrationPage choiceState(String value) {
        state.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage choiceCity(String value) {
        city.setValue(value).pressEnter();
        return this;
    }

    public void submitClick() {
        submit.click();
    }

}
