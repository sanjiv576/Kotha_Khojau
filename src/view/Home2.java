package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Home2 extends JFrame implements ActionListener {

    // view.Images Labeling
    JLabel vertical, horizontal, titleImg , projectLogoImg;

    JButton homeIcon, profileIcon, settingIcon,driverIcon, logoutIcon, view1, view2, view3, view4, nextpage, previouspage;

    JPanel panel1, panel2, panel3, panel4, panel5;

    public Home2() {

        setTitle("Home Page");
        setBounds(100, 80, 1280, 745);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.darkGray);
        setLayout(null);
        setResizable(false);


        // invoking user-defined method to insert and manage icons for dashboard
        insertButtonIcons();


        // Your code will be here

        previouspage = new JButton();
        previouspage.setBounds(150, 360, 64, 64);
        previouspage.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/previous.png")))));
        previouspage.setBackground(Color.decode("#C6C6C6"));
        previouspage.setOpaque(true);
        previouspage.setBorderPainted(false);
        previouspage.setFocusPainted(false);
        previouspage.setVisible(true);
        add(previouspage);


        view1 = new JButton();
        view1.setBounds(351, 345, 155, 35);
        view1.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/viewdetails.png")))));
        view1.setBackground(Color.decode("#9E9B9B"));
        view1.setOpaque(true);
        view1.setBorderPainted(false);
        view1.setFocusPainted(false);
        view1.setVisible(true);
        add(view1);

        view2 = new JButton();
        view2.setBounds(783, 345, 155, 35);
        view2.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/viewdetails.png")))));
        view2.setBackground(Color.decode("#9E9B9B"));
        view2.setOpaque(true);
        view2.setBorderPainted(false);
        view2.setFocusPainted(false);
        view2.setVisible(true);
        add(view2);

        view3 = new JButton();
        view3.setBounds(351, 595, 155, 35);
        view3.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/viewdetails.png")))));
        view3.setBackground(Color.decode("#9E9B9B"));
        view3.setOpaque(true);
        view3.setBorderPainted(false);
        view3.setFocusPainted(false);
        view3.setVisible(true);
        add(view3);

        view4 = new JButton();
        view4.setBounds(783, 595, 155, 35);
        view4.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/viewdetails.png")))));
        view4.setBackground(Color.decode("#9E9B9B"));
        view4.setOpaque(true);
        view4.setBorderPainted(false);
        view4.setFocusPainted(false);
        view4.setVisible(true);
        add(view4);

        panel2 = new JPanel();
        panel2.setBounds(230, 150, 395,230);
        panel2.setBackground(Color.decode("#9E9B9B"));
        add(panel2);

        panel3 = new JPanel();
        panel3.setBounds(665, 150, 395,230);
        panel3.setBackground(Color.decode("#9E9B9B"));
        add(panel3);

        panel4 = new JPanel();
        panel4.setBounds(230, 400, 395,230);
        panel4.setBackground(Color.decode("#9E9B9B"));
        add(panel4);

        panel5 = new JPanel();
        panel5.setBounds(665, 400, 395,230);
        panel5.setBackground(Color.decode("#9E9B9B"));
        add(panel5);

        panel1 = new JPanel();
        panel1.setBounds(135, 125, 1022, 550);
        panel1.setBackground(Color.decode("#C6C6C6"));
        panel1.setOpaque(true);
        add(panel1);

        logoutIcon.addActionListener(this);
        settingIcon.addActionListener(this);
        homeIcon.addActionListener(this);
        profileIcon.addActionListener(this);
        previouspage.addActionListener(this);

    }

    public static void main(String[] args) {
        new Home2().setVisible(true);
    }

    //  event handling
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(logoutIcon)) {
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to log out ?",
                    "Log out", JOptionPane.YES_NO_CANCEL_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }

        if (e.getSource().equals(settingIcon)){
            dispose();
            new New_updateprofile().setVisible(true);
        }

        if (e.getSource().equals(profileIcon)){
            dispose();
            new Renter_userprofile().setVisible(true);
        }

        if (e.getSource().equals(driverIcon)){
            dispose();
            new DriverDetails().setVisible(true);
        }

        if (e.getSource().equals(previouspage)){
            dispose();
            new Home().setVisible(true);
        }

    }

    //  -------------- DON'T CHANGE THIS ----------------
    // this method inserts left button icons
    public void insertButtonIcons(){

        projectLogoImg = new JLabel();
        projectLogoImg.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/upperLogo174x137.png")))));
        projectLogoImg.setBounds(0, -15, 165, 148);
        add(projectLogoImg);

        homeIcon = new JButton();
        homeIcon.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/greenhome_100x93.png")))));
        homeIcon.setBounds(1, 150, 100, 100);
        homeIcon.setBackground(Color.decode("#9E9B9B"));
        homeIcon.setOpaque(true);
        homeIcon.setBorderPainted(false);
        homeIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(homeIcon);


        profileIcon = new JButton();
        profileIcon.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/profileImg_78x64.png")))));
        profileIcon.setBounds(1, 250, 100, 100);
        profileIcon.setBackground(Color.decode("#9E9B9B"));
        profileIcon.setOpaque(true);
        profileIcon.setBorderPainted(false);
        profileIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(profileIcon);


        settingIcon = new JButton();
        settingIcon.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/settingIcon64x61.png")))));
        settingIcon.setBounds(1, 353, 100, 100);
        settingIcon.setBackground(Color.decode("#9E9B9B"));
        settingIcon.setOpaque(true);
        settingIcon.setBorderPainted(false);
        settingIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(settingIcon);

        driverIcon= new JButton();
        driverIcon.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/driver64X64.png")))));
        driverIcon.setBounds(1, 480, 100, 100);
        driverIcon.setBackground(Color.decode("#9E9B9B"));
        driverIcon.setOpaque(true);
        driverIcon.setBorderPainted(false);
        driverIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(driverIcon);

        logoutIcon = new JButton();
        logoutIcon.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/logout_64x64.png")))));
        logoutIcon.setBounds(15, 605, 64, 64);
        logoutIcon.setBackground(Color.decode("#9E9B9B"));
        logoutIcon.setOpaque(true);
        logoutIcon.setBorderPainted(false);
        logoutIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(logoutIcon);

        titleImg = new JLabel();
        titleImg.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/projectTitleImg_222x58.png")))));
        titleImg.setBounds(135, 22, 222, 58);
        add(titleImg);

        // top horizontal layer that includes project title
        horizontal = new JLabel();
        horizontal.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/horizontal_img_1320x106.png")))));
        horizontal.setBounds(-40, 0, 1320, 106);
        //horizontal.setBackground(Color.decode("#9E9B9B"));
        horizontal.setOpaque(true);
        add(horizontal);

        // left  vertical layer that includes project logo and buttons
        vertical = new JLabel();
        vertical.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/vertical_line_104x720.png")))));
        vertical.setBounds(0, 0, 104, 720);
        vertical.setBackground(Color.getColor("9E9B9B"));
        vertical.setOpaque(true);
        add(vertical);
    }

}