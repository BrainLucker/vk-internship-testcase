package com.vk.web.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultsPage {
    private final SelenideElement topResultHeader = $("ul[id=search-result] li[data-cid=\"0\"] h2");

    public SearchResultsPage() {
        topResultHeader.shouldBe(visible);
    }

    public String getTopResultHeaderText() {
        return topResultHeader.text();
    }
}