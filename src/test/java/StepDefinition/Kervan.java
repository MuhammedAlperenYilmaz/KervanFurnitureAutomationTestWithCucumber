package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Kervan {
    WebDriver driver;
    @Given("Go to homepage")
    public void go_to_homepage()
    {
        WebDriverManager.safaridriver().setup();
        driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.get("http://krvn.com.tr");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement closePopup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".pClose.close")));
        closePopup.click();
    }
    @When("product is searched")
    public void product_is_searched()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("live-search")));
        search.sendKeys("çiçek");
        search.submit();
    }
    @Then("product is selected")
    public void product_is_selected()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement chooseProduct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/sapli-tek-dal-cicek-gul-sdbf152504-24-bordo']")));
        chooseProduct.click();
    }
    @And("product quantity is updated")
    public void product_quantity_is_updated()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement newAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Adet46533")));
        newAmount.clear();
        newAmount.sendKeys("25");
    }
    @And("add to cart")
     public void add_to_cart()
    { WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.id("addCartBtn")));
        addToCart.click();
    }
    @And("go to cart")
    public void go_to_cart()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement goToBasket = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-radius.btn-success.fr")));
        goToBasket.click();
    }
    @And("the browser is closed")
    public void the_browser_is_closed()
    {
        if (driver != null)
            driver.quit();
    }
}
