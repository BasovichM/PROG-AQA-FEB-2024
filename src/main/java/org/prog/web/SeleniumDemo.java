package org.prog.web;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

//TODO: go to rozetka
//TODO: search for any goods (iPhone 15)
//TODO: print that goods name ( Мобильный телефон Apple iPhone 15 Pro Max 256GB Black Titanium (MU773RX/A) )

public class SeleniumDemo {




    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://rozetka.com.ua/");


            WebElement searchInput = driver.findElement(By.name("search"));

            searchInput.sendKeys("iPhone 15");



            searchInput.sendKeys(Keys.ENTER);



            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3L));

            WebElement firstGridItem = wait.until(ExpectedConditions.

                    visibilityOfElementLocated

                            (By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[2]/div/div[2]/div[2]/div[1]/div/div[3]/a")));



            String productTitle = firstGridItem.getAttribute("title");

            System.out.println(productTitle);


        } finally {

            driver.quit();

        }
    }
}