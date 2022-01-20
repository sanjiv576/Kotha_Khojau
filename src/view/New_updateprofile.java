package view;

import logic.Logic_New_updateProfile;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class New_updateprofile extends JFrame implements ActionListener {

    // view.Images Labeling
    JLabel vertical, horizontal, titleImg , projectLogoImg;

    JButton homeIcon, profileIcon, settingIcon, driverIcon,logoutIcon;

    // panel1 includes only buttons  , panel2 contains labels, text fields and buttons
    JPanel  panel1, panel2;
    JButton update_profile, password_change, delete_account;

    JLabel firstNameLbl, middleNameLbl, lastNameLbl, contactLbl,addressLbl, emailLbl;
    JTextField newFNameField, newMNameField, newLNameField, newContactField, newAddressField,newEmailField;
    JButton backbtn, submitbtn, cancelbtn;

    public New_updateprofile() {

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
        update_profile.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/greenUpdateProfile_315x84.png"))));
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
        password_change.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/newpassword_change.png"))));
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

        firstNameLbl= new JLabel("First Name", SwingConstants.CENTER);
        firstNameLbl.setForeground(Color.BLACK);
        firstNameLbl.setFont(new Font("Ropa Sans", NORMAL,32));
        firstNameLbl.setBounds(230,260,211,32);
        firstNameLbl.setBackground(Color.decode("#5F4141"));
        firstNameLbl.setForeground(Color.white);
        firstNameLbl.setOpaque(true);
        add(firstNameLbl);

        newFNameField = new JTextField();
        newFNameField.setBounds(180, 300,290,35);
        newFNameField.setFont(new Font("times", Font.BOLD,25));
        add(newFNameField);


        middleNameLbl= new JLabel("Middle Name", SwingConstants.CENTER);
        middleNameLbl.setForeground(Color.BLACK);
        middleNameLbl.setFont(new Font("Ropa Sans", NORMAL,32));
        middleNameLbl.setBounds(565,260,211,32);
        middleNameLbl.setBackground(Color.decode("#5F4141"));
        middleNameLbl.setForeground(Color.white);
        middleNameLbl.setOpaque(true);
        add(middleNameLbl);

        newMNameField = new JTextField();
        newMNameField.setBounds(520, 300,290,35);
        newMNameField.setFont(new Font("times", Font.BOLD,25));
        add(newMNameField);


        lastNameLbl= new JLabel("Last Name", SwingConstants.CENTER);
        lastNameLbl.setForeground(Color.BLACK);
        lastNameLbl.setFont(new Font("Ropa Sans", NORMAL,32));
        lastNameLbl.setBounds(925,260,211,32);
        lastNameLbl.setBackground(Color.decode("#5F4141"));
        lastNameLbl.setForeground(Color.white);
        lastNameLbl.setOpaque(true);
        add(lastNameLbl);

        newLNameField = new JTextField();
        newLNameField.setBounds(880, 300,290,35);
        newLNameField.setFont(new Font("times", Font.BOLD,25));
        add(newLNameField);

        contactLbl= new JLabel("Contact", SwingConstants.CENTER);
        contactLbl.setForeground(Color.BLACK);
        contactLbl.setFont(new Font("Ropa Sans",NORMAL,32));
        contactLbl.setBounds(420,360,190,32);
        contactLbl.setBackground(Color.decode("#5F4141"));
        contactLbl.setForeground(Color.white);
        contactLbl.setOpaque(true);
        add(contactLbl);

        newContactField = new JTextField();
        newContactField.setBounds(370, 400,290,35);
        newContactField.setFont(new Font("times", Font.BOLD,25));
        add(newContactField);

        addressLbl= new JLabel("Address", SwingConstants.CENTER);
        addressLbl.setForeground(Color.BLACK);
        addressLbl.setFont(new Font("Ropa Sans",NORMAL,32));
        addressLbl.setBounds(780,360,190,32);
        addressLbl.setBackground(Color.decode("#5F4141"));
        addressLbl.setForeground(Color.white);
        addressLbl.setOpaque(true);
        add(addressLbl);

        newAddressField = new JTextField();
        newAddressField.setBounds(720, 400,290,35);
        newAddressField.setFont(new Font("times", Font.BOLD,25));
        add(newAddressField);


        emailLbl = new JLabel("Email", SwingConstants.CENTER);
        emailLbl.setForeground(Color.BLACK);
        emailLbl.setFont(new Font("Ropa Sans",NORMAL,32));
        emailLbl.setBounds(650,460,100,32);
        emailLbl.setBackground(Color.decode("#5F4141"));
        emailLbl.setForeground(Color.white);
        emailLbl.setOpaque(true);
        add(emailLbl);

        newEmailField = new JTextField();
        newEmailField.setBounds(540, 500,290,35);
        newEmailField.setFont(new Font("times", Font.BOLD,25));
        add(newEmailField);

        // invokes this method to insert buttons in lower region
        insertLowerButtons();

        homeIcon.addActionListener(this);
        profileIcon.addActionListener(this);
        logoutIcon.addActionListener(this);
        submitbtn.addActionListener(this);
        cancelbtn.addActionListener(this);
        backbtn.addActionListener(this);
        password_change.addActionListener(this);
        delete_account.addActionListener(this);
        driverIcon.addActionListener(this);


        add(panel1);
        add(panel2);


    }

    public static void main(String[] args) {
        new New_updateprofile().setVisible(true);
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

    @Override
    public void actionPerformed(ActionEvent e) {

        String newFirstName, newMiddleName, newLastName, newAddress, newEmail, newContact;

        newFirstName = newFNameField.getText();
        newMiddleName = newMNameField.getText();
        newLastName = newLNameField.getText();
        newContact = newContactField.getText();
        newAddress = newAddressField.getText();
        newEmail = newEmailField.getText();


        if (e.getSource().equals(logoutIcon)){
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to log out ?",
                    "Log out", JOptionPane.YES_NO_CANCEL_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }

        if (e.getSource().equals(submitbtn)){

            // creating instance of a class
            Logic_New_updateProfile updateProfile = new Logic_New_updateProfile();

            updateProfile.filterEmptyFields(newFirstName, newMiddleName, newLastName, newContact, newAddress, newEmail);

            JOptionPane.showMessageDialog(null, "Profile data are updated",
                    "Profile update", JOptionPane.INFORMATION_MESSAGE);
            clearAll();
        }
        if (e.getSource().equals(profileIcon)){
            dispose();
            new Renter_userprofile().setVisible(true);
        }

        if (e.getSource().equals(password_change)){
            dispose();
            new New_passwordchange().setVisible(true);
        }

        if(e.getSource().equals(driverIcon)){
            dispose();
            new DriverDetails().setVisible(true);
        }
        if(e.getSource().equals(homeIcon)){
            dispose();
            new Home().setVisible(true);
        }

        if (e.getSource().equals(cancelbtn)){
            clearAll();
        }

    }

    public void clearAll(){
        newFNameField.setText("");
        newMNameField.setText("");
        newLNameField.setText("");
        newContactField.setText("");
        newAddressField.setText("");
        newEmailField.setText("");

    }

}






