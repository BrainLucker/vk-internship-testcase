package com.vk.web.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vk.web.page.SearchEnginePage;
import com.vk.web.page.SearchResultsPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchByWordTest {

    private final String searchEngineURL = "http://ya.ru";

    @BeforeEach
    void setup() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1000x800";
    }

    @Test
    public void shouldShowSearchedWordInTopResult() {
        String searchedWord = "Selenium";
        SearchEnginePage searchPage = open(searchEngineURL, SearchEnginePage.class);
        SearchResultsPage resultsPage = searchPage.search(searchedWord);
        String actualHeaderText = resultsPage.getTopResultHeaderText();

        assertEquals(searchedWord, actualHeaderText);
    }
}