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
    JPanel  panel1, panel2, panel3;
    JButton update_profile, password_change, delete_account;

    JLabel areyousureLbl;


    JButton nobtn, yestbtn;

    JLabel currentpassword, newpassword,conformpassword,specifyreason;
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
        password_change.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/newpassword_change.png"))));
        add(password_change);

        delete_account= new JButton();
        delete_account.setBounds(875,135,309,76);
        delete_account.setBackground(Color.decode("#9F9391"));
        delete_account.setOpaque(true);
        delete_account.setBorderPainted(false);
        delete_account.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        delete_account.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/greenAccount delete_309x76.png"))));
        add(delete_account);

        //label for delete account
        areyousureLbl= new JLabel("Are you sure you want to delete your account?", SwingConstants.CENTER);
        areyousureLbl.setForeground(Color.BLACK);
        areyousureLbl.setFont(new Font("Ropa Sans", NORMAL,32));
        areyousureLbl.setBounds(250,325,800,50);
        areyousureLbl.setBackground(Color.decode("#5F4130"));
        areyousureLbl.setForeground(Color.white);
        areyousureLbl.setOpaque(true);
        add(areyousureLbl);







        // invokes this method to insert buttons in lower region
        insertLowerButtons();

        homeIcon.addActionListener(this);
        profileIcon.addActionListener(this);
        logoutIcon.addActionListener(this);



        update_profile.addActionListener(this);
        add(panel1);
        add(panel2);


        //













    }

    public static void main(String[] args) {
        new DeleteUserAccount().setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {








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
        nobtn= new JButton();
        nobtn.setBounds(450,450,165,55);
        nobtn.addActionListener(this);
        nobtn.setOpaque(true);
        nobtn.setBorderPainted(false);
        nobtn.setBackground(Color.decode("#9F9391"));
        nobtn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/nobtn (1).png"))));
        nobtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(nobtn);

        yestbtn= new JButton();
        yestbtn.setBounds(750,450,165,55);
        yestbtn.setBackground(Color.decode("#9F9391"));
        yestbtn.setOpaque(true);
        yestbtn.setBorderPainted(false);
        yestbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        yestbtn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/yesbtn (1).png"))));
        add(yestbtn);


    }
}






