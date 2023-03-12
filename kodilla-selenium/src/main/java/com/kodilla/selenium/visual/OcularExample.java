package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class OcularExample {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        Ocular.config()
                .resultPath(Paths.get("C:\\Users\\Admin\\results"))
                .snapshotPath(Paths.get("C:\\Users\\Admin\\snapshots"))
                .globalSimilarity(95)
                .saveSnapshot(true);

        WorldTimePage worldTimePage = new WorldTimePage(webDriver);

        worldTimePage.open();
        webDriver.switchTo().frame(0);
        Thread.sleep(5000);
        webDriver.findElement(By.xpath("//*[@id=\"save\"]/span[1]/div/span")).click();
        worldTimePage.compare();
        worldTimePage.close();










    }
}
