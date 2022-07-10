package lesson_4;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Calendar {
    public void setDate(String date, String month, String year) {
        $("#dateOfBirthInput").click();
        $x("//div[contains(text(),'" + date + "')]").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);

    }
}
