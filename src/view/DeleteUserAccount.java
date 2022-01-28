package view;

import logic.Logic_New_passwordchange;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class DeleteUserAccount extends JFrame implements ActionListener {

    // view.Images Labeling
    JLabel vertical, horizontal, titleImg , projectLogoImg;

    JButton homeIcon, profileIcon, settingIcon, driverIcon, logoutIcon;

    // panel1 includes only buttons  , panel2 contains labels, text fields and buttons
    JPanel  panel1, panel2;
    JButton update_profile, password_change, delete_account;


    JButton backbtn, submitbtn, cancelbtn;

    JLabel currentpassword, newpassword,conformpassword;
    JPasswordField currentpasswordfield, newpasswordfield, confirmpasswordfield;
    JLabel showImage1, showImage2, showImage3;
    JCheckBox showPassword1, showPassword2, showPassword3;


    public DeleteUserAccount() {

        setTitle("User Setting - Update Profile window");
        setBounds(100, 80, 1280, 745);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.darkGray);
        setLayout(null);
        setResizable(false);


        // invoking user-defined method to insert and manage icons
        insertButtonIcons();

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


        //   ------------------- panels for  user setting ---------------------------

        panel1 = new JPanel();
        panel1.setBorder(new EmptyBorder(10,10,10,10));
        panel1.setBounds(140, 126, 1098, 99);
        panel1.setBackground(Color.decode("#9F9391"));
        panel1.setOpaque(true);


        panel2 = new JPanel();
        panel2.setBorder(new EmptyBorder(10,10,10,10));
        panel2.setBounds(140, 245, 1094, 425);
        panel2.setBackground(Color.decode("#9F9391"));
        panel2.setOpaque(true);


        // --------------------- these buttons are inside the panel1 region -------------
        update_profile= new JButton();
        update_profile.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/whiteupdateprofile.png"))));
        update_profile.setBounds(170,134,315,84);
        update_profile.setBackground(Color.decode("#9F9391"));
        update_profile.setOpaque(true);
        update_profile.setBorderPainted(false);
        add(update_profile);

        password_change= new JButton();
        password_change.setBounds(500,135,352,80);
        password_change.setBackground(Color.decode("#9F9391"));
        password_change.setOpaque(true);
        password_change.setBorderPainted(false);
        password_change.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        password_change.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/greenpassword change_352x80.png"))));
        add(password_change);

        delete_account= new JButton();
        delete_account.setBounds(875,135,309,76);
        delete_account.setBackground(Color.decode("#9F9391"));
        delete_account.setOpaque(true);
        delete_account.setBorderPainted(false);
        delete_account.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        delete_account.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/newdelete.png"))));
        add(delete_account);

        //for update profile, text fields and label are added, inside the panel2 region
        currentpassword=new JLabel();
        currentpassword.setBounds(180,250,320,60);
        currentpassword.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/currentpassword310x60.png"))));
        add(currentpassword);

        currentpasswordfield = new JPasswordField();
        currentpasswordfield.setBounds(540,250,300,60);
        currentpasswordfield.setBackground(Color.decode("#C0C0C0"));
        currentpasswordfield.setFont(new Font("times", Font.BOLD,25));
        add(currentpasswordfield);

        newpassword=new JLabel();
        newpassword.setBounds(180,350,320,60);
        newpassword.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/newpassword338x60.png"))));
        add(newpassword);

        newpasswordfield = new JPasswordField();
        newpasswordfield .setBounds(540,350,300,60);
        newpasswordfield .setBackground(Color.decode("#C0C0C0"));
        newpasswordfield .setFont(new Font("times", Font.BOLD,25));
        add(newpasswordfield );

        conformpassword=new JLabel();
        conformpassword.setForeground(Color.BLACK);
        conformpassword.setBounds(180,450,320,60);
        conformpassword.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/confirmpassword311x60.png"))));
        add(conformpassword);

        confirmpasswordfield= new JPasswordField();
        confirmpasswordfield .setBounds(540,450,300,60);
        confirmpasswordfield.setBackground(Color.decode("#C0C0C0"));
        confirmpasswordfield .setFont(new Font("times", Font.BOLD,25));
        add(confirmpasswordfield);


        //  For show password
        showPassword1 = new JCheckBox();
        showPassword1.setBounds(840, 250, 30, 50);
        showPassword1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        showPassword1.setBackground(Color.decode("#9F9391"));
        showPassword1.setOpaque(true);
        add(showPassword1);

        showPassword2 = new JCheckBox();
        showPassword2.setBounds(840, 350, 30, 50);
        showPassword2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        showPassword2.setBackground(Color.decode("#9F9391"));
        showPassword2.setOpaque(true);
        add(showPassword2);

        showPassword3 = new JCheckBox();
        showPassword3.setBounds(840, 450, 30, 50);
        showPassword3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        showPassword3.setBackground(Color.decode("#9F9391"));
        showPassword3.setOpaque(true);
        add(showPassword3);
//images on eye
        showImage1 = new JLabel();
        showImage1.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/show.png"))));
        getContentPane().add(showImage1);
        showImage1.setBackground(Color.decode("#9F9391"));
        showImage1.setOpaque(true);
        showImage1.setBounds(860, 245, 91, 66);


        showImage2 = new JLabel();
        showImage2.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/show.png"))));
        getContentPane().add(showImage2);
        showImage2.setBackground(Color.decode("#9F9391"));
        showImage2.setOpaque(true);
        showImage2.setBounds(860, 340, 91, 66);

        showImage3 = new JLabel();
        showImage3.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/show.png"))));
        getContentPane().add(showImage3);
        showImage3.setBackground(Color.decode("#9F9391"));
        showImage3.setOpaque(true);
        showImage3.setBounds(860, 440, 91, 66);



        // invokes this method to insert buttons in lower region
        insertLowerButtons();

        homeIcon.addActionListener(this);
        profileIcon.addActionListener(this);
        logoutIcon.addActionListener(this);
        submitbtn.addActionListener(this);
        cancelbtn.addActionListener(this);
        backbtn.addActionListener(this);

        showPassword1.addActionListener(this);
        showPassword2.addActionListener(this);
        showPassword3.addActionListener(this);
        update_profile.addActionListener(this);
        add(panel1);
        add(panel2);


        //for delete profile,text fields and labels are added




    }

    public static void main(String[] args) {
        new New_passwordchange().setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {


        String currentpassword, newpassword, conformpassword;
        currentpassword = currentpasswordfield.getText();
        newpassword = newpasswordfield.getText();
        conformpassword = confirmpasswordfield.getText();

        if (e.getSource().equals(showPassword1)) {

            if (showPassword1.isSelected()) {
                currentpasswordfield.setEchoChar((char) 0);

            } else {
                currentpasswordfield.setEchoChar('•');

            }
        }
        if (e.getSource().equals(showPassword2)) {

            if (showPassword2.isSelected()) {
                newpasswordfield.setEchoChar((char) 0);

            } else {
                newpasswordfield.setEchoChar('•');

            }
        }
        if (e.getSource().equals(showPassword3)) {

            if (showPassword3.isSelected()) {
                confirmpasswordfield.setEchoChar((char) 0);

            } else {
                confirmpasswordfield.setEchoChar('•');

            }
        }


        if (e.getSource().equals(logoutIcon)) {
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to log out ?",
                    "Log out", JOptionPane.YES_NO_CANCEL_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }

        if (e.getSource().equals(submitbtn)) {

            // creating instance of a class
            Logic_New_passwordchange passwordchange = new Logic_New_passwordchange();

            passwordchange.filterEmptyFields(currentpassword, newpassword, conformpassword);

            if (newpassword.equals(conformpassword)) {
                JOptionPane.showMessageDialog(null, "Password has been changed successfully.",
                        "Password Change ", JOptionPane.INFORMATION_MESSAGE);
                clearAll();

            }
            else {
                JOptionPane.showMessageDialog(null, "Failed to change password. New password and Confirm password do not match.",
                        "Failed", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource().equals(cancelbtn)){
            clearAll();
        }

        if (e.getSource().equals(update_profile)){
            dispose();
            new New_updateprofile().setVisible(true);
        }
    }


    public void clearAll(){
        confirmpasswordfield.setText("");
        currentpasswordfield.setText("");
        newpasswordfield.setText("");
    }

    // this method inserts left button icons
    public void insertButtonIcons(){

        projectLogoImg = new JLabel();
        projectLogoImg.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/upperLogo174x137.png")))));
        projectLogoImg.setBounds(0, -15, 165, 148);
        add(projectLogoImg);

        homeIcon = new JButton();
        homeIcon.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/homeIcon_64x64.png")))));
        homeIcon.setBounds(15, 150, 64, 64);
        homeIcon.setBackground(Color.decode("#9E9B9B"));
        homeIcon.setOpaque(true);
        homeIcon.setBorderPainted(false);
        homeIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(homeIcon);


        profileIcon = new JButton();
        profileIcon.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/profileImg_78x64.png")))));
        profileIcon.setBounds(8, 250, 78, 64);
        profileIcon.setBackground(Color.decode("#9E9B9B"));
        profileIcon.setOpaque(true);
        profileIcon.setBorderPainted(false);
        profileIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(profileIcon);


        settingIcon = new JButton();
        settingIcon.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/greenSetting_100x100.png")))));
        settingIcon.setBounds(1, 353, 100, 100);
        settingIcon.setBackground(Color.decode("#9E9B9B"));
        settingIcon.setOpaque(true);
        settingIcon.setBorderPainted(false);
        settingIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(settingIcon);

        driverIcon= new JButton();
        driverIcon.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/driver64x64.png")))));
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
    }

    // this method inserts lower buttons for back, cancel and submit
    public void insertLowerButtons(){
        backbtn= new JButton();
        backbtn.setBounds(210,570,187,55);
        backbtn.setOpaque(true);
        backbtn.setBorderPainted(false);
        backbtn.setBackground(Color.decode("#9F9391"));
        backbtn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/backButton187x55.png"))));
        backbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(backbtn);

        submitbtn= new JButton();
        submitbtn.setBounds(550,570,205,55);
        submitbtn.setBackground(Color.decode("#9F9391"));
        submitbtn.setOpaque(true);
        submitbtn.setBorderPainted(false);
        submitbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        submitbtn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/submitButton203x55.png"))));
        add(submitbtn);

        cancelbtn= new JButton();
        cancelbtn.setBounds(900,570,205,55);
        cancelbtn.setBackground(Color.decode("#9F9391"));
        cancelbtn.setOpaque(true);
        cancelbtn.setBorderPainted(false);
        cancelbtn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/cancelButton203x55.png"))));
        cancelbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(cancelbtn);
    }
}






