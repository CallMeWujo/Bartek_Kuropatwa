package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://allegro.pl/");
        Thread.sleep(4000);

        WebElement cookies = driver.findElement(By.xpath("//button[1]"));
        cookies.click();


       WebElement inputField = driver.findElement(By.cssSelector("div > form > input"));
       inputField.sendKeys("mavic mini");



       WebElement categoriesCombo = driver.findElement(By.xpath("//div[@class=\"mp7g_oh mr3m_1 s4kyg\"]/select"));
       Select category = new Select(categoriesCombo);
       category = new Select(categoriesCombo);
       category.selectByIndex(3);
       categoriesCombo.submit();



        List<WebElement> elements = driver.findElements(By.cssSelector("section > article"));
        System.out.println(elements.size());
        for (int i =0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());
        }

    }
}
