package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/" , "https://www.wayfair.com/" ,
                    "https://www.walmart.com/" , "https://www.westelm.com/");
        for(int i = 0 ; i < urls.size(); i++){
            driver.get(urls.get(i));
            String title = driver.getTitle().toLowerCase().replaceAll(" " , "");
            int firstIndex = urls.get(i).indexOf("www.");
            int lastIndex = urls.get(i).indexOf(".com");
            String domain = urls.get(i).substring(firstIndex + 4 , lastIndex);
            System.out.println(title + "   " + domain);
            if(title.contains(domain)){
                System.out.println(urls.get(i) + "  :   PASSED THE TITLE TEST");
            }else{
                System.out.println(urls.get(i) + " :   FAILED THE TITLE TEST");
            }
        }
        driver.quit();
    }
}
