package logic;

import javax.swing.*;
public class Logic_Registration {

    int contactNum;
    boolean contactIsString = false;

    private boolean closeRegistrationWindow;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String MemberType;
    private String Gender;
    private String Contact;
    private String DateOfBirth;
    private String Occupation;
    private String Email;
    private String Address;
    private String Username;
    private String Password;
    private String Repassword;


    public  Logic_Registration(String FirstName,String MiddleName, String LastName, String MemberType,
                               String Gender, String Contact , String DateOfBirth, String Occupation, String Email,String Address,
                               String Username, String Password, String Repassword){


        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName= LastName;
        this.MemberType = MemberType;
        this.Gender = Gender;
        this.Contact = Contact;
        this.DateOfBirth = DateOfBirth;
        this.Occupation = Occupation;
        this.Email = Email;
        this.Address = Address;
        this.Username = Username;
        this.Password = Password;
        this.Repassword = Repassword;
    }

    public Logic_Registration() {

    }

    public  boolean registration(boolean closeRegistrationWindow, String FirstName, String MiddleName, String LastName,
                                 String MemberType, String Gender,
                              String Contact, String DateOfBirth, String Occupation, String Email, String Address,
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
                DateOfBirth.equals("2000-1-1") || Email.isEmpty() || Address.isEmpty() || Username.isEmpty() ||
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

            JOptionPane.showMessageDialog(null, "OTP has been sent. Please verify it.",
                    "Registration", JOptionPane.YES_OPTION);

        }
       return closeRegistrationWindow;
    }

    public void dataInsertion(){
//        Users users = new Users(FirstName, MiddleName, LastName, MemberType, Gender, Contact, DateOfBirth,
//                                Occupation, Email, Address, Username, Password);
//        UsersController usersController = new UsersController();

        // inserting data into database by invoking registerUser of UserController class
        int insert = 0;
    }

}
