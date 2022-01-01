import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Dashboard extends JFrame {

    JPanel panel;

    // Images Labeling
    JLabel House1, House2, House3, House4, House5, House6, title, logo, pagemark, vertical, horizontal, innerframe;
    JButton home, profile, settings, signout, next, filter;

    public Dashboard() {


        setTitle("Dashboard");
        setBounds(40, 50, 1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(true);

        //Buttons

        home = new JButton();
        home.setIcon(new ImageIcon(getClass().getResource("Images/home 2.png")));
        home.setBounds(15, 166, 64, 64);
        add(home);

        profile = new JButton();
        profile.setIcon(new ImageIcon(getClass().getResource("Images/profile 2.png")));
        profile.setBounds(8, 274, 77, 64);
        add(profile);

        settings = new JButton();
        settings.setIcon(new ImageIcon(getClass().getResource("Images/settings 2.png")));
        settings.setBounds(15, 382, 64, 60);

        add(settings);

        signout = new JButton();
        signout.setIcon(new ImageIcon(getClass().getResource("Images/signout 2.png")));
        signout.setBounds(15, 605, 64, 64);
        add(signout);

        next = new JButton();
        next.setIcon(new ImageIcon(getClass().getResource("Images/next 1.png")));
        next.setBounds(1195, 382, 64, 64);
        add(next);

        filter = new JButton();
        filter.setIcon(new ImageIcon(getClass().getResource("Images/filter.png")));
        filter.setBounds(1195, 117, 64, 61);
        add(filter);

        //Labels

        innerframe = new JLabel();
        innerframe.setIcon(new ImageIcon((getClass().getResource("Images/InnerFrame.png"))));
        innerframe.setBounds(103, 108, 1177, 612);
        innerframe.setForeground(Color.getColor("DFDFDF"));
        add(innerframe);

        House1 = new JLabel();
        House1.setIcon(new ImageIcon((getClass().getResource("Images/House1.png"))));
        House1.setBounds(165, 190, 280, 200);
        House1.setForeground(Color.getColor("FFFFFF"));
        add(House1);

        House2 = new JLabel();
        House2.setIcon(new ImageIcon((getClass().getResource("Images/House2.png"))));
        House2.setBounds(165, 190, 280, 200);
        House2.setForeground(Color.getColor("FFFFFF"));
        add(House2);

        House2 = new JLabel();
        House2.setIcon(new ImageIcon((getClass().getResource("Images/House2.png"))));
        House2.setBounds(530, 190, 280, 200);
        House2.setForeground(Color.getColor("FFFFFF"));
        add(House2);

        House3 = new JLabel();
        House3.setIcon(new ImageIcon((getClass().getResource("Images/House3.png"))));
        House3.setBounds(895, 190, 280, 200);
        House3.setForeground(Color.getColor("FFFFFF"));
        add(House3);

        House4 = new JLabel();
        House4.setIcon(new ImageIcon((getClass().getResource("Images/House4.png"))));
        House4.setBounds(165, 455, 280, 200);
        House4.setForeground(Color.getColor("FFFFFF"));
        add(House4);

        House5 = new JLabel();
        House5.setIcon(new ImageIcon( (getClass().getResource("Images/House5.png"))));
        House5.setBounds(530, 455, 280, 200);
        House5.setForeground(Color.getColor("FFFFFF"));
        add(House5);

        House6 = new JLabel();
        House6.setIcon(new ImageIcon( (getClass().getResource("Images/House6.png"))));
        House6.setBounds(895, 455, 280, 200);
        House6.setForeground(Color.getColor("FFFFFF"));
        add(House6);

        title = new JLabel();
        title.setIcon(new ImageIcon( (getClass().getResource("Images/Kotha Khojau.png"))));
        title.setBounds(135, 19, 231, 60);
        title.setForeground(Color.getColor("000000"));
        add(title);

        logo = new JLabel();
        logo.setIcon(new ImageIcon( (getClass().getResource("Images/logo.png"))));
        logo.setBounds(0, -19, 181, 136);
        logo.setForeground(Color.getColor("000000"));
        add(logo);

        pagemark = new JLabel();
        pagemark.setIcon(new ImageIcon( (getClass().getResource("Images/Ellipse 3.png"))));
        pagemark.setBounds(2, 150, 97, 90);
        pagemark.setForeground(Color.getColor("46C132"));
        add(pagemark);

        vertical = new JLabel();
        vertical.setIcon(new ImageIcon((getClass().getResource("Images/Rectangle 20.png"))));
        vertical.setBounds(-1, 0, 104, 720);
        vertical.setForeground(Color.getColor("9E9B9B"));
        add(vertical);

        horizontal = new JLabel();
        horizontal.setIcon(new ImageIcon((getClass().getResource("Images/Rectangle 21.png"))));
        horizontal.setBounds(2, 2, 1278, 106);
        horizontal.setForeground(Color.getColor("9E9B9B"));
        add(horizontal);















    }

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
}




