package com.vytrack.step_definitions;

import com.vytrack.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

/**
 * Hooks name is not reserved. You may name this class in any way.
 * For example: SuiteSetupAndTearDown
 * Hooks triggered based on tags not class name or their location.
 * These methods can be a part of any step definition class.
 * Common practice is to store them in the separate class.
 */
public class Hooks {

//    hook before = @BeforeMethod in TestNG
//    hook after = @AfterMethod in TestNG
//    it's not a good idea to mix implicit and explicit waits. It can lead to unexpectedly long waits.
//    usually, we just use explicit and fluent waits.

    @Before
    public void setup() {
        System.out.println("::: Starting Automation:::");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

        //Scenario: I don't know but I'm connecting to DB
        //Given user runs the following queury"SELECT

    @Before("@sb")
    public void dbSetup() {
        System.out.println("::: Connecting to database");
    }

    @After
    public void tearDown() {
        //close browser, close DB connection, close tunnel,capture screenshot of the error, etc..
        //this is a hook after
        //runs automatically after every test
        Driver.closeDriver();
        System.out.println(":::(^_^) End of test execution (*_*):::");
    }
}}
