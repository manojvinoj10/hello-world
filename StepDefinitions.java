import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    WebDriver driver;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.id("login")).click();
    }

    @Then("user should see the homepage")
    public void user_should_see_the_homepage() {
        boolean result = driver.findElement(By.id("welcome")).isDisplayed();
        System.out.println("Login Successful: " + result);
        driver.quit();
    }
}
