package gitHub;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Homework {
    //Ответ на 1-й вопрос
/*    $("h1 div") - находит любой h1 и в нем ищет div
    $("h1").$("div") - находит 1-ый h1 из существующих и в нем ищет div*/

    @Test
    void checkSoftAssertions() {
        //Steps
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-box li button").click();
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();

        //Expected result
        $("#wiki-body").shouldHave(Condition.text("Using JUnit5 extend test class:"));

    }
}
