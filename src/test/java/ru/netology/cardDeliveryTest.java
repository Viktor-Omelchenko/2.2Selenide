package ru.netology;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;

import com.google.common.io.Files;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.FileDownloadMode.PROXY;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


class CardDeliveryTest {

@Test

    void shouldRegByAccount() {
    Configuration.holdBrowserOpen = true;
        open("http:localhost:9999");
        $$("[data-test-id=city] input").last().setValue("Москва");
        $$("[data-test-id=date] input").last().setValue("10.01.2022");
        $$("[data-test-id=name] input").last().setValue("Иванов Иван");
        $$("[data-test-id=phone] input").last().setValue("+79101010100");
         $("[data-test-id=agreement]").click();

        //$$(".tab-item").find(exactText("По номеру счета")).click();
        //SelenideElement block = $("[data-testid='registration']");
        //$$("[name='number']").last().setValue("4055 0100 0123 4613 8564");

        $$("button").find(exactText("Забронировать")).click();
        //$(withText("Успешно! Встреча успешно забронирована на 10.01.2022")).shouldBe(visible, Duration.ofSeconds(15));
        //$(byText("Личный кабинет")).shouldBe(visible, Duration.ofSeconds(5));
        }
        }
