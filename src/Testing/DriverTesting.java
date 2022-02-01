package Testing;

import controller.UserController;
import model.Driver_Details;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

public class DriverTesting {
    UserController userController;
    Driver_Details driver_details ;

    @Before
    public void init() {
        userController = new
                UserController();
        try {

            driver_details = new Driver_Details("Bishal Kumar Karki", "9861251844", "Balkumari - Gongabu", "Fix", " Rs 500", "Rs 1000", "Small");
        } catch (Exception exception) {
            exception.getStackTrace();
            System.out.println(exception.getMessage());
        }

    }
    @Test
    public void testDriverTest(){
        int expectedResult = 1;
    //    int actualResult = userController.getDriverDetails(driver_details);
        //  Assert.assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown(){
        driver_details = null;
        userController = null;
    }




}
