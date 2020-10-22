package com.vytrack.step_definitions;

import com.vytrack.utils.Driver;
import org.junit.After;

public class Hooks {

    //    hook after = @AfterMethod in TestNG
    @After
    public void tearDown(){
        //this is a hook after
        //runs automatically after every test
        Driver.closeDriver();
        System.out.println(":::(^_^) End of test execution (*_*):::");

    }
}
