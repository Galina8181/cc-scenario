package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
private final WebDriver webDriver;


  public HomePage(WebDriver webDriver) {
       this.webDriver = webDriver;
    }

  public void searchGood (String goodName){
      WebElement searchField =webDriver.findElement(By.className("search-bar__input"));
      searchField.sendKeys(goodName);
      searchField.submit();

  }


   }

