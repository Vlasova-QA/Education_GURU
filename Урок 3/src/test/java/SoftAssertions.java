import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class SoftAssertions {
    @Test
    void wiki() {
        open("https://github.com/selenide/selenide");
        $x("//span[@data-content='Wiki']").click();
        $x("//div[@class='width-full input-group']").scrollTo();
        $x("//div[@class='wiki-rightbar']").shouldHave(text("SoftAssertions"));
        $x("//div[@id='wiki-pages-box']//a[text() ='SoftAssertions']").click();
        $x("//div[@class='markdown-body']").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
