import controller.UserController;
import model.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

public class RegistrationTest {
        UserController userController;
        User user;
        @Before
        public void init(){
                userController = new
                        UserController();

                try {
                        // Note: change email and contact  per execution
                        user = new User("Srijan", "", "Gurung", "Owner", "Male", "223223234", "2001/12/09", "Student",
                                "gurug@gmail.com", "Ktm", "srijaavn", "123");
                }
                catch (Exception exception){
                        exception.getStackTrace();
                        System.out.println(exception.getMessage());
                }
        }
        @Test
        public void testRegisterUser() throws SQLException {
                int expectedResult = 1;
                int actualResult = userController.registerUser(user);
                Assert.assertEquals(expectedResult, actualResult);
        }

        @After
        public void tearDown(){
                user = null;
                userController = null;
        }
}
