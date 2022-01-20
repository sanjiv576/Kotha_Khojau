package logic;

import controller.LoginDataController;
import model.LoginData;

import javax.swing.*;
import java.sql.ResultSet;

public class Logic_Signin {
    private String username;
    private String password;

    // creating parametrized constructor
    public Logic_Signin(String username, String password){
        this.username = username;
        this.password = password;
    }

    // methods are invoked in view.Signin java class
    public void login(String username, String password){
        if (username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Fields are empty",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {

            LoginData loginData = new LoginData(username, password);

            LoginDataController loginDataController = new LoginDataController();

            ResultSet result;

            try{
                result = loginDataController.checkValidation(username, password);

                if (result.next()){
                    JOptionPane.showMessageDialog(null, "Provided username and password are in the database.", "Check in database", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Provided username and password are not in the database.", "Check in database", JOptionPane.WARNING_MESSAGE);
                }

            }
            catch(Exception exp){
                exp.getStackTrace();
                System.out.println(exp.getMessage());
            }

            System.out.println("After login Button");
//            JOptionPane.showMessageDialog(null, "Login successfully",
//                    "Logged In ", JOptionPane.YES_OPTION);
        }
        //return 0;
    }
}
