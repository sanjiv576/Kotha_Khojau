import org.w3c.dom.ls.LSOutput;

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

    boolean sentOtp = false;
    String checkOtp = confirmOtp();

    public Verification(){
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
        add(submitBtn);

        lowerLbl = new JLabel("Didn't receive code ?");
        lowerLbl.setBounds(80, 250, 200, 30);
        //lowerLbl.setFont(new Font("roman", Font.BOLD, 28));
        add(lowerLbl);

        resendBtn = new JButton("<html><u>Resend code</u></html>");
        resendBtn.setBounds(210, 250, 130, 30);
        resendBtn.setBackground(Color.white);
        resendBtn.setOpaque(true);
        resendBtn.setBorderPainted(false);
        add(resendBtn);

        resendBtn.addActionListener(this);


        setVisible(true);

    }
    public static void main(String[] args) {

        //Object passedOtp = null;
        new Verification().setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String insertedOtp = codeField.getText();
        String newGeneratedOtp;
       // String checkOtp = confirmOtp();

        if (e.getSource().equals(resendBtn)){
            Logic_Verification verification = new Logic_Verification();

            newGeneratedOtp = verification.buildCode();
            System.out.println("Resend OTP code : " + newGeneratedOtp);
        }

        if (e.getSource().equals(submitBtn)){
            System.out.println("inside submit button");
            if (checkOtp.equals(insertedOtp)){
                System.out.println("correct otp");
            }
            else {
                System.out.println("Incorrect otp");
            }

        }
    }

    public String confirmOtp(){
        String oldGeneratedOtp;
        Logic_Verification verification = new Logic_Verification();

        oldGeneratedOtp = verification.buildCode();
        System.out.println("Send OTP code --> : " + oldGeneratedOtp);
        return oldGeneratedOtp;
    }

}
