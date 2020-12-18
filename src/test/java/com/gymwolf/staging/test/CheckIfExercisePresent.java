package com.gymwolf.staging.test;

import com.gymwolf.staging.WebdriverSetup;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckIfExercisePresent extends WebdriverSetup {

    @Test
    public void checkIfExerciseIsFoundFromWebsite() {

        driver.get(baseUrl);
        //Db for exercises(click "vaata")->List for exercises(click "chest")->
        //->Exercises(click "Bench press")
        driver.findElement(By.xpath("//a[@href=\"/staging/exercises\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"/staging/exercises/Chest\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"/staging/exercise/3782-bench-press\"]")).click();
        //Check that right page opened
        Boolean exercise = driver.findElements(By.xpath("//*[@class=\"page-header\"]/h2[contains(text(),\"Bench Press\")]")).size() > 0;
        Assert.assertTrue(exercise == Boolean.TRUE);

    }

}
