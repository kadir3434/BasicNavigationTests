package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public static WebDriver getDriver(String browser){
        String OS = System.getProperty("os.name").toLowerCase();
        if(OS.contains("win") && browser.equalsIgnoreCase("safari")){
            return null;
        }else if(browser.equalsIgnoreCase("chrome") && (OS.contains("win") || OS.contains("mac"))){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox") && (OS.contains("win") || OS.contains("mac"))){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("edge") &&  OS.contains("win")) {
            WebDriverManager.edgedriver().version("44.18362.387.0").setup();
            return new EdgeDriver();
        }
        return null;
    }
}
