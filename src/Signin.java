import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signin extends JFrame implements ActionListener {

    boolean click = false;
    JPanel panel;
    JLabel usernameLbl, passwordLbl, headingLbl_1, headingLbl_2, headingLbl_3, orLbl;
    JCheckBox showPassword;

    // labels for images
    JLabel imgLbl, projectLogo, usernameImage, passwordImage, showImage;

    JTextField usernameField;
    JPasswordField passwordField;
    JButton forgotPassword, loginBtn, registerBtn;
    public Signin(){
        setTitle("Sign In window");
        setBounds(40, 50, 940, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);

        // heading title
        headingLbl_1 = new JLabel("WELCOME");
        headingLbl_1.setFont(new Font("Rambla", Font.ITALIC, 36));
        headingLbl_1.setBounds(250, 0, 500, 36);
        //headingLbl_1.setFont(new Font("Mshtakan", Font.ITALIC, 36));
        headingLbl_1.setForeground(Color.black);
        add(headingLbl_1);

        headingLbl_2 = new JLabel("TO");
        headingLbl_2.setFont(new Font("Rambla", Font.ITALIC, 36));
        headingLbl_2.setBounds(320, 48, 100, 36);
        headingLbl_2.setForeground(Color.black);
        add(headingLbl_2);

        headingLbl_3 = new JLabel("KOTHA KHOJAU");
        headingLbl_3.setFont(new Font("Rambla", Font.ITALIC, 36));
        headingLbl_3.setBounds(200, 88, 500, 36);
        headingLbl_3.setForeground(Color.black);
        add(headingLbl_3);

        // background images insertion
        imgLbl = new JLabel();
        imgLbl.setIcon(new ImageIcon(getClass().getResource("Images/log_cover.png")));
        getContentPane().add(imgLbl);
        imgLbl.setBounds(0, 0, 700, 700);

        projectLogo = new JLabel();
        projectLogo.setIcon(new ImageIcon(getClass().getResource("Images/logo.png")));
        getContentPane().add(projectLogo);
        projectLogo.setBounds(680, 45, 90, 90);

        panel = new JPanel();
        panel.setBounds(570, 40, 335, 420);
        panel.setBackground(Color.DARK_GRAY);
        panel.setOpaque(true);
        add(panel);

        usernameLbl = new JLabel("Username");
        usernameLbl.setBounds(680, 145, 150, 20);
        usernameLbl.setFont(new Font("Mshtakan", Font.BOLD, 20));
        usernameLbl.setForeground(Color.YELLOW);
        add(usernameLbl);

        usernameField = new JTextField();
        usernameField.setBounds(640, 175, 170, 25);
        usernameField.setFont(new Font("Mshtakan", Font.ITALIC, 18));
        add(usernameField);

        usernameImage = new JLabel();
        usernameImage.setIcon(new ImageIcon(getClass().getResource("Images/usernameImg.png")));
        getContentPane().add(usernameImage);
        usernameImage.setBounds(615, 175, 25, 25);

        passwordLbl = new JLabel("Password");
        passwordLbl.setBounds(680, 210, 150, 20);
        passwordLbl.setFont(new Font("Mshtakan", Font.BOLD, 20));
        passwordLbl.setForeground(Color.YELLOW);
        add(passwordLbl);

        passwordField = new JPasswordField();
        passwordField.setBounds(640, 240, 180, 25);
        passwordField.setFont(new Font("Mshtakan", Font.ITALIC, 28));
        add(passwordField);

        passwordImage = new JLabel();
        passwordImage.setIcon(new ImageIcon(getClass().getResource("Images/psswdImg.png")));
        getContentPane().add(passwordImage);
        passwordImage.setBounds(610, 240, 30, 30);

        showPassword = new JCheckBox();
        showPassword.setBounds(820, 235, 20, 40);
        add(showPassword);

        showImage = new JLabel();
        showImage.setIcon(new ImageIcon(getClass().getResource("Images/showPassword.png")));
        getContentPane().add(showImage);
        showImage.setBackground(Color.DARK_GRAY);
        showImage.setOpaque(true);
        //showBtn.setBorderPainted(false);
        showImage.setBounds(845, 240, 50, 25);

        forgotPassword = new JButton("<html> <u>Forgot Password</u></html>");
        forgotPassword.setBounds(680, 280, 180, 12);
        forgotPassword.setForeground(Color.YELLOW);
        forgotPassword.setFont(new Font("Mshtakan", Font.BOLD, 12));
        forgotPassword.setBackground(Color.DARK_GRAY);
        forgotPassword.setOpaque(true);
        forgotPassword.setBorderPainted(false);
        add(forgotPassword);


        loginBtn = new JButton();
        // for circular button
        //loginBtn.setBounds(670, 312, 95, 95);
        loginBtn.setBounds(665, 312, 145, 50);
        loginBtn.setBackground(Color.DARK_GRAY);
        loginBtn.setOpaque(true);
        loginBtn.setBorderPainted(false);
        loginBtn.setIcon(new ImageIcon(getClass().getResource("Images/loginImage.png")));


        orLbl = new JLabel("------------ OR ------------");
        orLbl.setBounds(625, 372, 195, 18);
        orLbl.setFont(new Font("Mshtakan", Font.BOLD, 18));
        orLbl.setForeground(Color.YELLOW);
        add(orLbl);

        registerBtn = new JButton("<html><u>Create an account</u></html>");
        registerBtn.setBounds(625, 400, 230, 20);
        registerBtn.setFont(new Font("Mshtakan", Font.BOLD, 20));
        registerBtn.setForeground(Color.YELLOW);
        registerBtn.setBackground(Color.DARK_GRAY);
        registerBtn.setOpaque(true);
        registerBtn.setBorderPainted(false);
        add(registerBtn);

        add(loginBtn);
        add(panel);

        showPassword.addActionListener(this);
        registerBtn.addActionListener(this);
        forgotPassword.addActionListener(this);
        loginBtn.addActionListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Signin().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String usernameInserted, passwordInserted;
        usernameInserted = usernameField.getText();
        passwordInserted = passwordField.getText();

        if (e.getSource().equals(loginBtn)){

            // creating instance of a class
            Logic_Signin obj = new Logic_Signin(usernameInserted, passwordInserted);
            // invoking login method from Logic_Signin class
            obj.login(usernameInserted, passwordInserted);
        }

        if (e.getSource().equals(forgotPassword)){
            JOptionPane.showMessageDialog(null, "OTP sent to Email",
                    "OTP verification", JOptionPane.YES_NO_CANCEL_OPTION);
        }

        if (e.getSource().equals(showPassword)){
           // click = true;
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            }
            else {
                passwordField.setEchoChar('•');
            }

//            if (click){
//                passwordField.setEchoChar((char) 0);  // shows password on check on
//                System.out.print("Login");
//                //click = false;
//            }

//            try {
//                Thread.sleep(5 * 1000);
//            } catch (InterruptedException ex) {
//                ex.printStackTrace();
//            }
//            if (!click){
//                passwordField.setEchoChar('•');
//            }



        }
    }
}
