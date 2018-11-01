package com.automationpractice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirtsTest {

    private ChromeDriver driver;


    @Before
    public void setUp () {
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
         driver = new ChromeDriver();
         System.out.println("test start");
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.manage().window().maximize();
    }
    @Test
    public void userEmail(){


    }



    @After
    public void close() {
        System.out.println("test close");
        driver.quit();
    }

}
