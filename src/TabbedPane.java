import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

class TabbedPane extends JFrame {
    JTabbedPane tabs;
    SettingPanel Setting;


    JPanel panel, panel1, panel2;
    JButton update_profile, password_change, delete_account;

    // Images Labeling
    JLabel House1, House2, House3, House4, House5, House6, title, logo, pagemark, vertical, horizontal, innerframe;
    JButton home, profile, settings, signout, next, filter;


    TabbedPane() {
        super("Dashboard");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setting the JTabbedPane Position and Layout as Wrap
        tabs = new JTabbedPane(JTabbedPane.LEFT,JTabbedPane.WRAP_TAB_LAYOUT);

        Setting = new SettingPanel();

        // Adding user defined pannels to JTabbedPane
        tabs.addTab("Home",new JPanel());


        tabs.addTab("profile", new JPanel());

        // Adding JPanels to JTabbedPane
        tabs.addTab("user setting",Setting);


        tabs.addTab("back", new JPanel());

        getContentPane().add(tabs);
    }
}

/*Creating CoursePanel by extending JPanel*/
class  SettingPanel extends JPanel {
    JButton update_profile,password_change,delete_account;
    JPanel panel1, panel2;

    SettingPanel() {

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

        update_profile = new JButton();
        update_profile.setBounds(130,100,313,88);
        update_profile.setBackground(Color.decode("#9F9391"));
        update_profile.setOpaque(true);
        update_profile.setBorderPainted(false);
        update_profile.setIcon(new ImageIcon(getClass().getResource("Images/newupdate.png")));

        password_change = new JButton();
        password_change.setBounds(470,100,352,76);
        password_change.setBackground(Color.decode("#9F9391"));
        password_change.setOpaque(true);
        password_change.setBorderPainted(false);
        password_change.setIcon(new ImageIcon(getClass().getResource("Images/newpassword_change.png")));


        delete_account= new JButton();
        delete_account.setBounds(850,100,309,76);
        delete_account.setBackground(Color.decode("#9F9391"));
        delete_account.setOpaque(true);
        delete_account.setBorderPainted(false);
        delete_account.setIcon(new ImageIcon(getClass().getResource("Images/newdelete.png")));
        add(delete_account);



        setLayout(new FlowLayout());
        add(update_profile);
        add(password_change);
        add(delete_account);
        add(panel1);

        add(panel2);
    }
}
/*Creating SelectCoursePanel by extending JPanel*/
class SelectCoursePanel extends JPanel {
    JCheckBox java, swing, hibernate;

    SelectCoursePanel() {
        java = new JCheckBox("Java");
        swing = new JCheckBox("Spring");
        hibernate = new JCheckBox("Hibernate");

        setLayout(new FlowLayout());
        add(java);
        add(swing);
        add(hibernate);
    }
}
class JTabbedPaneDemo {
    public static void main(String args[]) throws Exception {
        TabbedPane frame = new TabbedPane();
        frame.setSize(1280, 720);
        frame.setVisible(true);
    }
}