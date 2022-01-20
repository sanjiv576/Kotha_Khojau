package logic;

import view.Verification;

import javax.swing.*;
import java.sql.SQLException;

public class Logic_Registration {

    int contactNum;
    boolean contactIsString = false;

    public Logic_Registration() {

    }

    public  boolean registration(boolean closeRegistrationWindow, boolean dataEntry, boolean OTP_verified,
                                 String FirstName, String MiddleName, String LastName,
                                 String MemberType, String Gender,
                              String Contact, String DOB, String Occupation, String Email, String Address,
                              String Username, String Password, String Repassword){



        boolean validEmail = Email.contains("@gmail.com");
        try {
            contactNum = Integer.parseInt(Contact);

        }
        catch (Exception exp){
//            JOptionPane.showMessageDialog(null,"Contact can't be in the text/string form.",
//                    "Alert !", JOptionPane.INFORMATION_MESSAGE);
            contactIsString = true;
            System.out.println(exp.getMessage());

        }

        if (FirstName.isEmpty() || LastName.isEmpty() || Contact.isEmpty() ||
                DOB.equals("2000-01-01") || Email.isEmpty() || Address.isEmpty() || Username.isEmpty() ||
                Password.isEmpty() || Repassword.isEmpty() || Gender.equals("Select") || Occupation.equals("Select")
                || MemberType.equals("Select")){

            JOptionPane.showMessageDialog(null, "Fields are empty or unchanged",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!(Password.equals(Repassword))){
            JOptionPane.showMessageDialog(null, "Password and Re-password do not match. Try Again",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (contactIsString){
            JOptionPane.showMessageDialog(null, "Please, insert contact in numbers.",
                    "Contact Number Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (Contact.length() <= 9){
            JOptionPane.showMessageDialog(null, "Lesser than 10 digits in contact field.",
                    "Contact Number Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (Contact.length() > 11){

            JOptionPane.showMessageDialog(null, "Greater than 10 digits in contact field.",
                    "Contact Number Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!(validEmail)){
            JOptionPane.showMessageDialog(null, "@gmail.com is missing in email.",
                    "Email Error", JOptionPane.ERROR_MESSAGE);
        }
        else {

            closeRegistrationWindow = true;

            // if OTP system is not kept, then insertion in the database in here or after this logic_registration class

            JOptionPane.showMessageDialog(null, "OTP has been sent. Please verify it.",
                    "Registration", JOptionPane.YES_OPTION);

           new Verification(FirstName, MiddleName, LastName, MemberType, Gender, Contact, DOB, Occupation, Email, Address, Username, Password).setVisible(true);

        }
       return closeRegistrationWindow;
    }



}
