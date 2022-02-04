package testing;

import controller.UserController;
import database.DbConnection;
import logic.SaveData;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RetrievingData {

    UserController userController;

    @Before
    public void init(){
        userController = new UserController();

    }

    @Test
    // testing method used for retrieving data that contained in About me of Profile
    public void testingRetrievingAbout(){
        // this tests fails because data are changeable ,
        // but objective is accomplished that data are fetched from correct user

        String expectedData = "Empty";  // not fixed string all the time
        String actualData = userController.retrieveAboutMe("sanjiv", "123");
        Assert.assertEquals(expectedData, actualData);

    }
    @Test
    // testing method used for retrieving detail of a particular user
    public void testingRetrievingDetail(){
        // this test passes
        String[] expectedData_1 = {"Sanjiv", "", "Shrestha", "1145356123", "Ramechhap", "shresthasanjiv576@gmail.com"};
        String[] actualData_1 = userController.personalData("sanjiv", "123");
        Assert.assertEquals(expectedData_1, actualData_1);
    }


    @After
    public void tearDown(){
        userController = null;
    }
}
