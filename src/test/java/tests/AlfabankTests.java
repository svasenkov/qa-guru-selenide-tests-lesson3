package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AlfabankTests {
        @Test
        public void depozitTests() {
                open("https://alfabank.ru/");
                $(byText("Вклады")).click();
                $$(byText("Депозиты")).find(Condition.visible).click();
                $$(byText("Архивные депозиты")).find(Condition.visible).click();
                $$(".product-cell__row-wrapper row") .shouldHaveSize(3);

        }


        }





