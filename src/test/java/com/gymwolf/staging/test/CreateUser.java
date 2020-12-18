package com.gymwolf.staging.test;

import com.gymwolf.staging.WebdriverSetup;
import net.moznion.random.string.RandomStringGenerator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateUser extends WebdriverSetup {

    @Test
    public void createUser() {

        driver.get(baseUrl);

        RandomStringGenerator generator = new RandomStringGenerator();
        String randomString = generator.generateByRegex("[A-Za-z0-9]{5}");

        //The best option is "by.id", because other elements might change and tests brake
        //Click on Registreeri
        driver.findElement(By.className("show-signup-form-from-menu")).click();
        //Enter data to field
        driver.findElement(By.name("signup_email")).sendKeys(randomString + "@random.com");
        //Click on Registreeru to submit data
        driver.findElement(By.xpath("//*[@id='landing-page-signup-form']" +
                "/form/div[2]/button[text()=\"Registreeru\"]")).click();
        //Enter data to required fields (don't have to be randomly generated)
        driver.findElement(By.id("gwp")).sendKeys("random123");
        driver.findElement(By.id("gwp2")).sendKeys("random123");
        //Click on Salvesta for submitting data
        driver.findElement(By.xpath("//input[@value='Salvesta']")).click();
        //Check if success message is shown
        Boolean success = driver.findElements(By.xpath("//*[@class=\"alert alert-success\"]")).size() > 0;
        Assert.assertTrue(success == Boolean.TRUE);
    }

}
