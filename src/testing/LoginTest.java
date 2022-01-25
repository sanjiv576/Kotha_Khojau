package testing;

import controller.LoginDataController;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginTest {

    String username = "sanjiv";
    String password = "123";
    ResultSet status;
    LoginDataController loginDataController;

    @Before
    public void init(){
        loginDataController = new LoginDataController();

    }

    @Test
    public void userAccountTest() throws SQLException {

        status = loginDataController.checkValidation(username, password);

        // expected result
        boolean accountFound = status.next();

        // account has already been registered --> actual result
        boolean accountCreated = true;

        Assert.assertEquals(accountFound, accountCreated);
    }

    @After
    public void tearDown(){
        loginDataController = null;
    }

}
