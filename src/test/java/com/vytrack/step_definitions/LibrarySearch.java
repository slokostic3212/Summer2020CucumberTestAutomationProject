package com.vytrack.step_definitions;

import com.vytrack.pages.Library_POM;
import com.vytrack.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class LibrarySearch {
    Library_POM search = new Library_POM();
    @Given("I am on the Books tab")
    public void i_am_on_the_books_tab() {
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
        search.emailBox.sendKeys("librarian51@library");
        search.passwordBox.sendKeys("dBq7G87s" );
        search.signInButton.click();
        search.booksButton.click();
    }
    @When("I search for a book in the Search box")
    public void i_search_for_a_book_in_the_search_box() {
        search.searchBox.sendKeys("The Hobbit");
    }
    @Then("all results containing what I searched for should appear on the screen")
    public void all_results_containing_what_i_searched_for_should_appear_on_the_screen() {
        search.ISBNText.getText();
        Driver.closeDriver();
    }
}


