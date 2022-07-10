package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SuccessFormRegistration {

    SelenideElement thanksForRegistration = $("#example-modal-sizes-title-lg"),
                    paramsInTable = $(".table-responsive");

    public SuccessFormRegistration checkThanksForRegistration() {
        thanksForRegistration.shouldBe(Condition.visible);
        return this;
    }

    public SuccessFormRegistration checkInformationInTheTAble(String value) {
        paramsInTable.shouldHave(Condition.text(value));
        return this;
    }

}

