import javax.swing.*;

public class Logic_Signin {
    private String username;
    private String password;

    // creating parametrized constructor
    public Logic_Signin(String username, String password){
        this.username = username;
        this.password = password;
    }

    // methods are invoked in Signin java class
    public void login(String username, String password){
        if (username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Fields are empty",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Login successfully",
                    "Logged In ", JOptionPane.YES_OPTION);
        }
        //return 0;
    }
}
