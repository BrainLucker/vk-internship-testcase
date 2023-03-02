package com.vk.web.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultsPage {
    private final SelenideElement resultsList = $("ul[id=search-result]");
    private final SelenideElement topResultHeader = resultsList.$("li[data-fast=\"1\"] h2");

    public SearchResultsPage() {
        resultsList.shouldBe(visible);
    }

    public String getTopResultHeaderText() {
        return topResultHeader.text();
    }
}