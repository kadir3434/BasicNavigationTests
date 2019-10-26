package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/", "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        ArrayList<String> title = new ArrayList<String>();
        WebDriver driver = BrowserFactory.getDriver("chrome");
        for(int i = 0 ; i < urls.size(); i++){
            driver.get(urls.get(i));
            title.add(driver.getTitle());
            if (urls.get(i).startsWith("http://practice.cybertekschool.com")){
                System.out.println(urls.get(i) + " : TEST PASSED");
            }else {
                System.out.println(urls.get(i) + " : TEST FAILED");
            }
        }
        int count = 0;
        for(int i = 0; i<title.size();i++){
            if(title.get(0).equals(title.get(i))){
                count++;
            }
        }
        if(count == title.size()){
            System.out.println("ALL TITLES ARE SAME!");
        }
        driver.quit();
    }
}
