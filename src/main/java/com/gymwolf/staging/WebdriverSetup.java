package com.gymwolf.staging;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebdriverSetup {

    // Webdriver variables
    public WebDriver driver;
    public String baseUrl;

    //Initializing Selenium Webdriver Before Class
    @BeforeClass
    public void setup() {
    // Chromedriver location
    System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\andole\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

    //Init chrome
    ChromeOptions options = new ChromeOptions();
    //Set window to open maximized
    options.addArguments("start-maximized");
    driver = new ChromeDriver(options);
    baseUrl = "http://www.gymwolf.com/staging/";
    }

    //Close webdriver when finished
    @AfterClass
    public void quit(){
        driver.close();
    }


}
