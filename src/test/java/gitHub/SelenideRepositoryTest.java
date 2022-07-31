package gitHub;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositoryTest {
    @Test
    void shouldFindSelenideAsFirstRepository(){
        // открыть страницу github.com
        Selenide.open("https://github.com");
        // ввести в поле поиска selenide и нажать enter
        $("[data-test-selector='nav-search-input']").setValue("selenide");
        $("[data-test-selector='nav-search-input']").pressEnter();

        // нажимаем на линк от первого результата поиска
        $$("ul.repo-list li").first().$("a").click();
        // check: в заголовке встречается selenide/selenide
        $("div[class=\"flex-auto min-width-0 width-fit mr-3\"]").shouldHave(text("selenide / selenide"));
    }
}
