import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class ToolsQA {

    @BeforeAll
    static void setup(){
        Configuration.startMaximized = true;
    }

    @Test
    void ToolsQATEST() {
        //Открыть ToolsQA
        open("https://demoqa.com/automation-practice-form");
        //Заполнить поле First Name
        $(byId("firstName")).setValue("Власова");
        //Заполнить поле Last Name
        $(byId("lastName")).setValue("Ольга");
        //Заполнить поле e-mail
        $(byId("userEmail")).setValue("vlas0va.0lga@yandex.ru");
        //Выбрать значение Gender
        $x("//input[@name= 'gender' and @value = 'Female']/following::label").click();
        //Заполнить поле Number
        $(byId("userNumber")).setValue("7960225789");
        //Заполнить поле Birth
        $x("//input[@id= 'dateOfBirthInput']").click();
        $x("//select[@class='react-datepicker__month-select']/option[@value='10']").click();
        $x("//select[@class= 'react-datepicker__year-select']/option[@value='2000']").click();
        $x("//div[@class='react-datepicker__day react-datepicker__day--029']").click();
        //Заполнить поле Subjects
        $x("//input[@id= 'subjectsInput']").setValue("English").pressEnter();
        //Выбрать чек-бокс Hobbies
        $x("//input[@id= 'hobbies-checkbox-2' and @value = '2']/following::label").click();
        $x("//input[@id= 'hobbies-checkbox-3' and @value = '3']/following::label").click();
        //Выбрать файл
        $x("//input[@id='uploadPicture']").uploadFromClasspath("img/i.webp");
        //Заполнить поле Сurrent Address
        $(byId("currentAddress")).setValue("Москва, Лубянский проезд, д.15, стр.2");
        //Выбрать чек-бокс State and City
        $x("//div[@id='state']").scrollTo();
        $x("//div[@id='state']").click();
        $x("//div[contains(@id,'react-select')][text()='Haryana']").click();
        $x("//div[@id='city']").click();
        $x("//div[contains(@id,'react-select')][text()='Karnal']").click();
        //Закрытие формы
        $x("//button[@id='submit']").click();
        //Проверка заголовка формы
        $x("//div[@id='example-modal-sizes-title-lg']").shouldHave(text("Thanks for submitting the form"));
        //Проверка введенных данных на форме
        $x("//td[text()='Student Name']").parent().shouldHave(text("Власова Ольга"));
        $x("//td[text()='Student Email']").parent().shouldHave(text("vlas0va.0lga@yandex.ru"));
        $x("//td[text()='Gender']").parent().shouldHave(text("Female"));
        $x("//td[text()='Mobile']").parent().shouldHave(text("7960225789"));
        $x("//td[text()='Date of Birth']").parent().shouldHave(text("29 November,2000"));
        $x("//td[text()='Subjects']").parent().shouldHave(text("English"));
        $x("//td[text()='Hobbies']").parent().shouldHave(text("Reading, Music"));
        $x("//td[text()='Picture']").parent().shouldHave(text("i.webp"));
        $x("//td[text()='Address']").parent().shouldHave(text("Москва, Лубянский проезд, д.15, стр.2"));
        $x("//td[text()='State and City']").parent().shouldHave(text("Haryana Karnal"));
        // Закрытие формы
        $("#closeLargeModal").click();



        sleep(5000);















    }

}
