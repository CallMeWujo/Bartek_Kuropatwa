package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class EBayTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        WebElement element = driver.findElement(By.id("gh-ac"));
        element.sendKeys("mavic mini");

        WebElement categoriesCombo = driver.findElement(By.xpath("//div/select"));
        Select category = new Select(categoriesCombo);
        category.selectByIndex(6);
        categoriesCombo.submit();

        Thread.sleep(4000);

        List<WebElement> elements = driver.findElements(By.xpath("//div[contains(@class, \"s-item__wrapper clearfix\")]"));
        elements.get(2).click();
        System.out.println(elements.size());









    }
}

// Wszystkie selektory XPath zmodyfikuj, aby używać cssSelector, tagName, id lub className. Wybór należy do Ciebie

//Dodaj wait, który poczeka na pierwszy wynik wyszukiwania. Po wyświetleniu się wyników wyszukiwania znajdź wszystkie karty produktów i przypisz je do jednej listy.

//Wskazówka: skorzystaj z driver.findElements oraz np. z selektora css section>article

//Za pomocą funkcji getText() wyświetl informacje o produkcie. Nie musisz pisać oddzielnych selektorów, wystarczy dla
// każdego elementu z listy produktów zastosować getText(), aby wyświetlić wszystkie informacje o produkcie.




