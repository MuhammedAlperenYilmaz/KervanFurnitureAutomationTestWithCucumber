# Kervan E-Commerce Automation Test With Cucumber

This project contains automation tests using Cucumber and Selenium for searching, selecting a product, adding it to cart, and verifying the cart functionality on the Kervan e-commerce site.

## Table of Contents

1. [Requirements](#requirements)
2. [Project Structure](#project-structure)
3. [How to Run](#how-to-run)
4. [Scenario Descriptions](#scenario-descriptions)
5. [Automation Tests with Cucumber](#automation-tests-with-cucumber)
6. [Points to Note](#points-to-note)

## Requirements

- Java 8 or higher
- Maven
- WebDriver (SafariDriver was used)

## Project Structure

- `src/test/java/features`: Contains Cucumber feature files.
- `src/test/java/stepdefinition`: Contains Java classes defining Cucumber steps.

## How to Run

1. Open a terminal in the project's root directory.
2. Use the following command to run the tests:


## Scenario Descriptions

- **Go to homepage**: Navigate to the main page of the Kervan e-commerce site.
- **Product is searched**: Search for a specific product.
- **Product is selected**: Select a product from the search results.
- **Product quantity is updated**: Update the quantity of the selected product.
- **Add to cart**: Add the selected product to the cart.
- **Go to cart**: Navigate to the cart to verify its contents.
- **The browser is closed**: Close the browser after completing the tests.

## Automation Tests with Cucumber

This project is developed using Cucumber, allowing scenarios to be defined in Gherkin language. Cucumber enhances readability and strengthens the connection between scenarios and code.

## Points to Note

- Browser selection and configuration (e.g., SafariDriver) may vary depending on your operating system and environment.
- WebDriverManager is used to automatically manage the WebDriver driver. If you want to use a different browser or driver, you may need to switch to the appropriate version of WebDriverManager.

---

This automation test project is designed to test fundamental operations on the Kervan e-commerce site using Cucumber. If you have any questions or feedback, please feel free to contact us.
