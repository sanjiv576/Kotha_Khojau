package view;

import controller.UserController;
import logic.Logic_Registration;
import logic.Logic_Verification;
import model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Verification extends JFrame implements ActionListener {

    JLabel verifyLbl;
    JTextField codeField;
    JButton resendBtn;
    JLabel lowerLbl;
    JButton submitBtn;

    String currentOTP = confirmOtp();  //  otp is generated after executing verification class


    String FirstName, MiddleName, LastName, MemberType, Gender, Contact,
            DOB, Occupation, PersonalEmail, Address, Username, Password;


    public Verification(){

    }
    public Verification(String firstName, String middleName, String lastName,
                        String memberType, String gender,
                        String contact, String dob, String occupation, String email, String address,
                        String username, String password){

         FirstName = firstName;
         MiddleName = middleName;
         LastName = lastName;
         MemberType = memberType;
         Gender = gender;
         Contact = contact;
         DOB = dob;
         Occupation = occupation;
         PersonalEmail = email;
         Address = address;
         Username = username;
         Password = password;

        setTitle("Alert : Verification");
        setBounds(200, 100, 400, 400);
        setResizable(false);

        // setBackground(Color.decode("#9E9B9B"));

        setLayout(null);

        verifyLbl = new JLabel("<html>OTP code has been sent to the email.<br>" +
                "Please, enter the code to verify.</html>", SwingConstants.CENTER);
        verifyLbl.setBounds(50, 50, 300, 100);
        add(verifyLbl);

        codeField = new JTextField();
        codeField.setBounds(140, 150, 120, 30);
        codeField.setFont(new Font("roman", Font.BOLD, 28));
        add(codeField);

        submitBtn = new JButton("Submit");
        submitBtn.setBounds(110, 200, 190, 35);
        submitBtn.setFont(new Font("copperplate", Font.BOLD, 30));
        submitBtn.setBackground(Color.GREEN);
        submitBtn.setOpaque(true);
        submitBtn.setBorderPainted(false);
        submitBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(submitBtn);

        lowerLbl = new JLabel("Didn't receive code ?");
        lowerLbl.setBounds(80, 250, 200, 30);
        add(lowerLbl);

        resendBtn = new JButton("<html><u>Resend code</u></html>");
        resendBtn.setBounds(210, 250, 130, 30);
        resendBtn.setBackground(Color.white);
        resendBtn.setOpaque(true);
        resendBtn.setBorderPainted(false);
        resendBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(resendBtn);

        resendBtn.addActionListener(this);
        submitBtn.addActionListener(this);


        setVisible(true);


    }
    public static void main(String[] args) {

        Verification obj = new Verification();
        obj.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String insertedOtp = codeField.getText();



        if (e.getSource().equals(resendBtn)){
            // new OTP code stores here by calling the method
            currentOTP = confirmOtp();
        }

        if (e.getSource().equals(submitBtn)){

            if (currentOTP.equals(insertedOtp)){

                System.out.println("your name : " + FirstName + MiddleName + LastName + Gender + Contact + PersonalEmail);

                        // instantiate of an object
                User user = new User(FirstName, MiddleName, LastName, MemberType, Gender, Contact, DOB,
                        Occupation, PersonalEmail, Address, Username, Password);   // encapsulation part in it

                UserController usersController = new UserController();  // controls the database activities like insert, delete, update

                int insertData = 0;

                // now inserting data into database by invoking registerUser method of UserController class
                try{
                    // calling the method of UserController class to insert data into database
                    insertData = usersController.registerUser(user);

                } catch (SQLException exception) {
                    exception.printStackTrace();
                    System.out.println(exception.getMessage());
                }

                if (insertData > 0 ){
                    JOptionPane.showMessageDialog(null, "Your account has been verified and registered successfully",
                            "Registration", JOptionPane.INFORMATION_MESSAGE);

                    System.out.println("Data are inserted into database. Successfully registered");

                    // now, disappearing otp gui windows
                    dispose();


                }
                else {
                    JOptionPane.showMessageDialog(null, "Failed to register. Try again.",
                            "Registration failed", JOptionPane.WARNING_MESSAGE);
                    System.out.println("Data are not inserted into database. Failed to register");
                }

            }
            else {
                JOptionPane.showMessageDialog(null, "Provided OTP code is incorrect." +
                        " Resend OTP again", "Account Verification", JOptionPane.ERROR_MESSAGE);
                codeField.setText("");
            }

        }
    }

    public String confirmOtp(){

        String generatedOtp;
        Logic_Verification verification = new Logic_Verification();

        generatedOtp = verification.buildCode();
        System.out.println("Send OTP code --> : " + generatedOtp);
        return generatedOtp;
    }

}
