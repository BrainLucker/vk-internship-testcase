package com.vk.web.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchEnginePage {
    private final SelenideElement searchInput = $("input[name=text]");

    public SearchResultsPage search(String info) {
        searchInput.val("Selenium").pressEnter();
        return new SearchResultsPage();
    }
}