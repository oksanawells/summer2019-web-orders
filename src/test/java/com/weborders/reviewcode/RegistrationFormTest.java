package com.weborders.reviewcode;

import com.weborders.utilities.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationFormTest {
   WebDriver driver;
    @Before
    public void setUp() {
        driver = Driver.get();
        driver.get("http://practice.cybertekschool.com/registration_form");
    }

    @After
    public void close() {
        Driver.closeDriver();
    }

    @Test
    public void test1() {
        // enter value in firstname
        driver.findElement(By.name("firstname")).sendKeys("John");
        // click sign up
        driver.findElement(By.id("wooden_spoon")).click();
        // verify last name is required message is displayed
        Assert.assertTrue(driver.findElement(By.xpath("//small[.='last name is required']")).isDisplayed());
    }
    @Test
     public void test2() {
        // enter value in firstname
        driver.findElement(By.name("firstname")).sendKeys("John");
        // enter value in lastname
        driver.findElement(By.name("lastname")).sendKeys("Doe");
        //click sign up
        driver.findElement(By.id("wooden_spoon")).click();
        // verify email is required message is displayed
        Assert.assertTrue(driver.findElement(By.xpath("//small[.='username is required']")).isDisplayed());

    }
    @Test
    public void test3() {
     // enter value in firstname
     driver.findElement(By.name("firstname")).sendKeys("John");
     // enter value in lastname
        driver.findElement(By.name("lastname")).sendKeys("Doe");
      // enter value in usename
        driver.findElement(By.name("username")).sendKeys("johndoe");
      // click sign up
      driver.findElement(By.id("wooden_spoon")).click();
      // verify email is required message is displayed
        Assert.assertTrue(driver.findElement(By.xpath("//small[.='email address is required']")).isDisplayed());

    }
}
