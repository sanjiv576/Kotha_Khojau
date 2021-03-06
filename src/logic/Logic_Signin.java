package logic;

import controller.LoginDataController;
import javax.swing.*;
import java.sql.ResultSet;

public class Logic_Signin{

    public Logic_Signin() {

    }

    // methods are invoked in view.Signin java class
    public boolean login(boolean closeThis, String username, String password){

        if (username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Fields are empty",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {

            LoginDataController loginDataController = new LoginDataController();

            ResultSet result;

            try{
                // result stores Resultset value by calling checkValidation method
                result = loginDataController.checkValidation(username, password);


                if (result.next()){
                    //JOptionPane.showMessageDialog(null, "Provided username and password are in the database.", "Check in database", JOptionPane.INFORMATION_MESSAGE);

                    SaveData saveData = new SaveData(username, password);
                    closeThis = true;

                }
                else {
                    closeThis = false;
                    JOptionPane.showMessageDialog(null, "Account has not been found in the database", "Check in database", JOptionPane.WARNING_MESSAGE);
                }

            }
            catch(Exception exp){
                exp.getStackTrace();
                System.out.println(exp.getMessage());
            }

//            JOptionPane.showMessageDialog(null, "Login successfully",
//                    "Logged In ", JOptionPane.YES_OPTION);
        }
        return closeThis;
    }

}
