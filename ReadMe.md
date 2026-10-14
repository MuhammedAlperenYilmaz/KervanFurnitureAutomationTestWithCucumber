# Kervan E-Commerce Automation Tests with Cucumber

This project contains automated UI tests for the Kervan e-commerce website using Selenium WebDriver and Cucumber. It covers essential e-commerce user flows, including product search, product selection, quantity updates, adding products to the cart, and verifying cart functionality.

## Technologies Used

- **Java** – Programming language
- **Selenium WebDriver** – Browser automation
- **Cucumber** – BDD (Behavior-Driven Development) and Gherkin-based test scenarios
- **Maven** – Dependency management and test execution
- **WebDriverManager** – WebDriver management

## Prerequisites

- Java 8 or higher
- Maven
- A compatible browser and WebDriver configuration

## Project Structure

- `src/test/java/Features`: Contains Cucumber feature files.
- `src/test/java/stepDefinition`: Contains Java classes defining Cucumber steps.

## How to Run

1. Clone or download the repository.
2. Open a terminal in the project root directory.
3. Ensure Java and Maven are installed and configured.
4. Run the tests using the appropriate Maven command for the project configuration.

## Test Scenarios

The automated scenarios cover the following user flows:

- **Navigate to Homepage:** Open the Kervan e-commerce website.
- **Search for a Product:** Search for a specific product.
- **Select a Product:** Select a product from the search results.
- **Update Product Quantity:** Change the quantity of the selected product.
- **Add Product to Cart:** Add the selected product to the shopping cart.
- **Verify Cart Contents:** Navigate to the cart and check its contents.
- **Close the Browser:** Close the browser after test execution.

## Test Approach

The project uses Cucumber to define test scenarios in Gherkin, making test cases easier to read and understand. Selenium WebDriver is used to automate browser interactions and execute the defined scenarios against the e-commerce website.

## Notes

- The project was developed using SafariDriver. Browser compatibility depends on the operating system and WebDriver configuration.
- WebDriverManager is used to manage the browser driver.
- Browser and driver configurations may need to be adjusted when running the tests in a different environment.

## Purpose

This project demonstrates the application of BDD principles and UI test automation to common e-commerce workflows using Java, Selenium WebDriver, and Cucumber.
