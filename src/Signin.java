import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signin extends JFrame implements ActionListener {

    JPanel panel;
    JLabel usernameLbl, passwordLbl, headingLbl;

    // labels for images
    JLabel imgLbl, projectLogo;

    JTextField usernameField;
    JPasswordField passwordField;
    ImageIcon backgroundImage;
    JButton forgotPassword, loginBtn;
    public Signin(){
        setTitle("Sign In");
        setBounds(60, 50, 1200, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);
        setResizable(false);

        // heading title

        headingLbl = new JLabel("WELCOME TO KOTHA KHOJAU");
        headingLbl.setBounds(90, 0, 450, 325);
        headingLbl.setFont(new Font("Mshtakan", Font.ITALIC, 24));
        headingLbl.setForeground(Color.black);
        add(headingLbl);

        // background image insertion
        imgLbl = new JLabel();
        imgLbl.setIcon(new ImageIcon(getClass().getResource("Images/log_cover.png")));
        getContentPane().add(imgLbl);
        imgLbl.setBounds(0, 0, 1150, 800);


        panel = new JPanel();
        panel.setBorder(new EmptyBorder(10,10,10,10));

        panel.setBounds(800, 50, 350, 500);
        panel.setBackground(Color.black);
        panel.setOpaque(true);
        // creating round border in the panel
        //AbstractBorder brdr = new TextBubbleBorder(Color.BLACK,2,56,0);
        //panel.setBorder();
        //panel.setBorder(new TextBubbleBorder(Color.black,2,76,0));

//        projectLogo = new JLabel();
//        projectLogo.setIcon(new ImageIcon(getClass().getResource("kotha_khojau_logo2.png")));
//        getContentPane().add(projectLogo);
//        projectLogo.setBounds(920, 70, 200, 100);

        // project logo insertion
//        projectLogo = new JLabel();
//        projectLogo.setIcon(new ImageIcon(getClass().getResource("Images/kotha_khojau_logo2.png")));
//        getContentPane().add(projectLogo);
//        projectLogo.setBounds(920, 70, 200, 100);
//        //panel.add(projectLogo);

        usernameLbl = new JLabel("Username");
        usernameLbl.setBounds(930, 200, 150, 25);
        usernameLbl.setFont(new Font("times", Font.BOLD, 24));
        usernameLbl.setForeground(Color.YELLOW);
        //username.setBorder(brdr);
        //username.setLayout(new FlowLayout());
        add(usernameLbl);

        usernameField = new JTextField();
        usernameField.setBounds(900, 230, 180, 40);
        usernameField.setFont(new Font("times", Font.ITALIC, 24));
        add(usernameField);

        passwordLbl = new JLabel("Password");
        passwordLbl.setBounds(930, 290, 150, 25);
        passwordLbl.setFont(new Font("times", Font.BOLD, 24));
        passwordLbl.setForeground(Color.YELLOW);
        add(passwordLbl);

        passwordField = new JPasswordField();
        passwordField.setBounds(900, 320, 180, 40);
        passwordField.setFont(new Font("times", Font.ITALIC, 24));
        add(passwordField);

        forgotPassword = new JButton("Forgot Password");
        forgotPassword.setBounds(938, 370, 180, 12);
        forgotPassword.setForeground(Color.YELLOW);
        forgotPassword.setFont(new Font("times", Font.BOLD, 12));
        forgotPassword.setBackground(Color.black);
        forgotPassword.setOpaque(true);
        forgotPassword.setBorderPainted(false);
        add(forgotPassword);


        loginBtn = new JButton("LOGIN");
        loginBtn.setBounds(910, 400, 148, 40);
        loginBtn.setForeground(Color.black);
        loginBtn.setFont(new Font("times", Font.BOLD, 30));
        loginBtn.setBackground(Color.green);
        loginBtn.setOpaque(true);
        loginBtn.setBorderPainted(false);

        add(loginBtn);
        add(panel);

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
    }
}
