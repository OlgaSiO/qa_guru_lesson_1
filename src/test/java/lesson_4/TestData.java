package lesson_4;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import java.awt.*;
import java.util.Locale;

import static com.codeborne.selenide.Selenide.$;

public class TestData {
    static String dateBirthday = "2";
    static String monthBirthday = "July";
    static String yearBirthday = "1996";
    static String birthday = dateBirthday + monthBirthday + yearBirthday;
    static String choiceAllHobbies = "Sports, Reading, Music";
}
