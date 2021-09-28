package ru.sf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.*;

public class StepDefinitions {
   static final WebDriver webDriver;
   private static final HomePage homepage;

   static {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alexey\\Desktop\\Учеба IT\\QAJA_m35_selenium-waitings-main\\cc-scenario\\src\\test\\resources\\chromedriver.exe");
       webDriver = new ChromeDriver();
       webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       webDriver.manage().window().maximize();
       homepage= new HomePage(webDriver);

   }

    @Given("url of shop {string}")
    public void url_of_shop(String url) {
        // Write code here that turns the phrase above into concrete actions
        webDriver.get(url);
    }
    @When("search good {string}")
    public void search_good(String searchParam) {
      homepage.searchGood(searchParam);
    }
    @Then("click on first image")
    public void click_on_first_image() {
        webDriver.findElement(By.className("product-item__image-wrapper--with-secondary")).click();
    }
 /*   @Then("assert that user got message {string}")
    public void assert_that_user_got_message(String errorMessage) {
        webDriver.findElement(By.className("product-item__image-wrapper--with-secondary")).click();
        final var actualMessage = By.className("empty-state__description").findElement(webDriver).getText();;
        assertEquals(errorMessage, actualMessage);

   */ }




