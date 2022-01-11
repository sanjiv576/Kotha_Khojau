import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class setting extends JFrame {

    JPanel panel, panel1, panel2;
    JButton update_profile, password_change, delete_account;

    // Images Labeling
    JLabel House1, House2, House3, House4, House5, House6, title, logo, pagemark, vertical, horizontal, innerframe;
    JButton home, profile, settings, signout, next, filter;

    public setting() {


        setTitle("Dashboard");
        setBounds(3, 40, 1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.decode("#DFDFDF"));
        setLayout(null);
        setResizable(false);

        //Buttons
        home = new JButton();
        //home.setIcon(new ImageIcon(getClass().getResource("Images/home 2.png")));
        home.setBounds(15, 166, 64, 64);
        home.setBackground(Color.decode("#46C132"));
        home.setForeground(Color.decode("#46C132"));
        home.setOpaque(true);
        home.setBorderPainted(false);
        home.setFocusPainted(false);
        add(home);

        profile = new JButton();
        //profile.setIcon(new ImageIcon(getClass().getResource("Images/profile 2.png")));
        profile.setBounds(8, 274, 77, 64);
        profile.setBackground(Color.decode("#9E9B9B"));
        profile.setForeground(Color.decode("#9E9B9B"));
        profile.setBorderPainted(false);
        profile.setFocusPainted(false);
        profile.setOpaque(true);
        add(profile);

        settings = new JButton();
        //   settings.setIcon(new ImageIcon(getClass().getResource("Images/settings 2.png")));
        settings.setBounds(15, 382, 64, 68);
        settings.setBackground(Color.decode("#9E9B9B"));
        settings.setForeground(Color.decode("#9E9B9B"));
        settings.setBorderPainted(false);
        settings.setFocusPainted(false);
        settings.setOpaque(true);
        add(settings);

        signout = new JButton();
        //   signout.setIcon(new ImageIcon(getClass().getResource("Images/signout 2.png")));
        signout.setBounds(15, 605, 64, 64);
        signout.setBackground(Color.decode("#9E9B9B"));
        signout.setBorderPainted(false);
        signout.setFocusPainted(false);
        signout.setOpaque(true);
        add(signout);


        vertical = new JLabel();
        //   vertical.setIcon(new ImageIcon((getClass().getResource("Images/Rectangle 20.png"))));
        vertical.setBounds(-1, 0, 104, 720);
        vertical.setForeground(Color.getColor("9E9B9B"));
        add(vertical);

        horizontal = new JLabel();
        //   horizontal.setIcon(new ImageIcon((getClass().getResource("Images/Rectangle 21.png"))));
        horizontal.setBounds(2, 0, 1275, 106);
        horizontal.setForeground(Color.getColor("9E9B9B"));
        add(horizontal);


      //   for user setting

        panel1 = new JPanel();
        panel1.setBorder(new EmptyBorder(10,10,10,10));
        panel1.setBounds(103, 90, 1098, 99);
        panel1.setBackground(Color.decode("#9F9391"));
        panel1.setOpaque(true);


        panel2 = new JPanel();
        panel2.setBorder(new EmptyBorder(10,10,10,10));
        panel2.setBounds(103, 230, 1094, 405);
        panel2.setBackground(Color.decode("#9F9391"));
        panel2.setOpaque(true);

        update_profile= new JButton("Update Profile" );
        update_profile.setBounds(130,100,313,88);
        update_profile.setBackground(Color.decode("#9F9391"));
        update_profile.setOpaque(true);
        update_profile.setBorderPainted(false);
        update_profile.setIcon(new ImageIcon(getClass().getResource("Images/newupdate.png")));
        add(update_profile);

        password_change= new JButton();
        password_change.setBounds(470,100,352,76);
        password_change.setBackground(Color.decode("#9F9391"));
        password_change.setOpaque(true);
        password_change.setBorderPainted(false);
        password_change.setIcon(new ImageIcon(getClass().getResource("Images/newpassword_change.png")));
        add(password_change);


        delete_account= new JButton();
        delete_account.setBounds(850,100,309,76);
        delete_account.setBackground(Color.decode("#9F9391"));
        delete_account.setOpaque(true);
        delete_account.setBorderPainted(false);
        delete_account.setIcon(new ImageIcon(getClass().getResource("Images/newdelete.png")));
        add(delete_account);




        add(panel1);
        add(panel2);



    }

    public static void main(String[] args) {
        new setting().setVisible(true);
    }
}




