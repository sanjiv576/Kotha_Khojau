import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class Signin extends JFrame {

    JPanel panel;
    JLabel username, password;
    JTextField usernameField;
    JPasswordField passwordField;
    ImageIcon backgroundImage;
    public Signin(){
        setTitle("Sign In");
        setBounds(60, 50, 1200, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);
        setResizable(false);


        panel = new JPanel();
        panel.setBorder(new EmptyBorder(10,10,10,10));

        panel.setBounds(800, 50, 350, 500);
        panel.setBackground(Color.GRAY);
        panel.setOpaque(true);
        // creating round border in the panel
        AbstractBorder brdr = new TextBubbleBorder(Color.BLACK,2,56,0);
        panel.setBorder(brdr);
        //panel.setBorder(new TextBubbleBorder(Color.black,2,76,0));

        username = new JLabel("Username");
        username.setBounds(700, 100, 150, 20);
        //username.setBorder(brdr);
        panel.add(username);
        
        add(panel);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Signin().setVisible(true);
    }

}
