Feature: A Librarian User should be able to search for books in the search box under the Books tab

Scenario: Search Book in Search box
Given I am on the Books tab
When I search for a book in the Search box
Then all results containing what I searched for should appear on the screen