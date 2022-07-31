package gitHub;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ContributorsTest {
@Test
    void solntsevShouldBeFirstContributor() {
    Selenide.open("https://github.com/selenide/selenide");
    $(".Layout-sidebar").$(byText("Contributors")).ancestor("div")
            .$$("ul li").first().hover();
    $$(".Popover-message").filterBy(visible).first().shouldHave(text("Andrei Solntsev"));
    sleep(5000);
}
}

