package view;

import logic.Logic_Registration;
import logic.Logic_Verification;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Verification extends JFrame implements ActionListener {

    JLabel verifyLbl;
    JTextField codeField;
    JButton resendBtn;
    JLabel lowerLbl;
    JButton submitBtn;

    String currentOTP = confirmOtp();  //  otp is generated after executing verification class

    public Verification(){
        setTitle("Alert : view.Verification");
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

        new Verification().setVisible(true);

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

                // instantiate of an object
                Logic_Registration register = new Logic_Registration();

                // invokes method to insert data into database
                register.dataInsertion();

                //JOptionPane.showMessageDialog(null, "Your account has been verified " +
                 //       "and registered successfully", "Account Verification", JOptionPane.INFORMATION_MESSAGE);

                dispose();
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
