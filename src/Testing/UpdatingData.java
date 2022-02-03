package testing;

import controller.UserController;
import database.DbConnection;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdatingData {

    UserController userController;
    DbConnection dbConnection;

    @Before
    public void init(){
        userController = new UserController();
        dbConnection = new DbConnection();

    }

    @Test
    // testing method used for updating First,Middle,Last names, Contact, Address, Email
    public void testUpdating() throws SQLException {
        // this test passes

        String newFirstName = null;

        // inserting new First Name as shyam
        userController.updateData("Shyam", 0);

        // retrieving old First Name
        String[] expectedData = userController.personalData("ram", "ram123");

        String query = "select FirstName from User_tbl where UserID=2";

        ResultSet resultSet = dbConnection.retrieveData(query);
        while (resultSet.next()){
            
            newFirstName = resultSet.getString("FirstName");
        }

        Assert.assertEquals(expectedData[0], newFirstName);  // at index 0, FirstName lies in array



    }

    @After
    public void tearDown(){
        dbConnection = null;
        userController = null;
    }
}
