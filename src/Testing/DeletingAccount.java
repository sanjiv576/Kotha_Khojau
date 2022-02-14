package testing;

import controller.UserController;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeletingAccount {

    UserController userController;

    // already registered account
    String username = "ram";
    String password = "ram123";

    @Before
    public void init(){
        userController = new UserController();

    }

    @Test
    public void deleteTesting(){
        int expectedValue = 1;
        int actualValue = userController.deleteMyAccount(username, password);

        Assert.assertEquals(expectedValue, actualValue);
    }

    @After

    public void tearDown(){
        userController = null;
    }
}
