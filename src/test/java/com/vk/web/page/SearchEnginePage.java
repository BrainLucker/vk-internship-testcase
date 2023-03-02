package com.vk.web.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchEnginePage {
    private final SelenideElement searchInput = $("input[name=text]");

    public SearchResultsPage search(String word) {
        searchInput.val(word).pressEnter();
        return new SearchResultsPage();
    }
}