package com.cbt.utilities;

public class StringUtility {
    public static void verifyEquals (String expectedResult, String actualResult){
        if(expectedResult.equals(actualResult)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
    }
}
