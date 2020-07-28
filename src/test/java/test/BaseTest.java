package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;

import driver.DriverSingletion;
import utils.TestListener;

@Listeners(TestListener.class)
public class BaseTest {
    
    @AfterMethod
    public void tearDown() {
	DriverSingletion.closeDriver();
    }
   
}
