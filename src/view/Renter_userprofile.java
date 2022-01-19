package view;



import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Objects;

public class Renter_userprofile extends JFrame implements ActionListener {

    // view.Images Labeling
    JLabel vertical, horizontal, titleImg , projectLogoImg, image;

    JButton homeIcon, profileIcon, settingIcon, driverIcon, logoutIcon;

    //panel
    JPanel  panel1;

    JButton choosePhoto;
    JLabel label;

    //label and text fields or textarea
    JLabel aboutme ,Gender, stayPeriod, nameLbl,renterIDLbl;
    JTextField namefield, renterIDfield, stayPeriodField;
    JTextArea aboutmefield;
    JComboBox genderCombo;


    public Renter_userprofile() {

        setTitle("User Setting - Renter_userprofile");
        setBounds(100, 80, 1280, 740);
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


        //   ------------------- panels for  Renter_userprofile ---------------------------

        panel1 = new JPanel();
        panel1.setBorder(new EmptyBorder(10,10,10,10));
        panel1.setBounds(140, 126, 1098, 550);
        panel1.setBackground(Color.decode("#9F9391"));
        panel1.setOpaque(true);

        //  -----------------label and text fields for renter profile---------------------------

        aboutme = new JLabel("About Me");
        aboutme.setBounds(160,280,150,50);
        aboutme.setFont(new Font("Serif", Font.PLAIN, 23));
        aboutme.setForeground(Color.BLACK);
        add(aboutme);

        aboutmefield = new JTextArea();
        aboutmefield.setBounds(160, 330, 700,90);
        aboutmefield.setLineWrap(true);
        aboutmefield.setWrapStyleWord(true);
        aboutmefield.setFont(new Font("Serif", Font.PLAIN, 20));
//      aboutmefield.setBorder(BorderFactory.createEmptyBorder());
//      aboutmefield.setOpaque(false);
        aboutmefield.setForeground(Color.DARK_GRAY);
        add(aboutmefield);

        Gender = new JLabel("Gender");
        Gender.setBounds(160,440,120,23);
        Gender.setFont(new Font("Serif", Font.PLAIN, 23));
        Gender.setForeground(Color.BLACK);
        add(Gender);

        String[] Gender = {"Select", "Male", "Female", "Others"};
        genderCombo = new JComboBox(Gender);
        genderCombo.setBounds(160,470,120,25);
        genderCombo.setBackground(Color.decode("#C0C0C0"));
        genderCombo.setFont(new Font("times", Font.PLAIN,15));
        //genderCombo.setSelectedItem("Others");
        add(genderCombo);

        stayPeriod = new JLabel("expected period to stay");
        stayPeriod .setBounds(160,520,230,23);
        stayPeriod .setFont(new Font("Serif", Font.PLAIN, 23));
        stayPeriod .setForeground(Color.BLACK);
        add( stayPeriod );

        stayPeriodField = new JTextField();
        stayPeriodField.setBounds(160, 550, 230,25);
        stayPeriodField.setFont(new Font("Serif", Font.PLAIN, 20));
        stayPeriodField.setForeground(Color.DARK_GRAY);
        add(stayPeriodField);



        nameLbl = new JLabel("Name");
        nameLbl.setBounds(500,130,100,23);
        nameLbl.setFont(new Font("Serif", Font.PLAIN, 23));
        nameLbl.setForeground(Color.BLACK);
        add(nameLbl);

        namefield = new JTextField();
        namefield.setBounds(650, 130, 180,25);
        namefield.setFont(new Font("Serif", Font.PLAIN, 20));
        namefield.setForeground(Color.DARK_GRAY);
        add(namefield);

        renterIDLbl = new JLabel("Renter ID");
        renterIDLbl.setBounds(500,170,150,25);
        renterIDLbl.setFont(new Font("Serif", Font.PLAIN, 23));
        renterIDLbl.setForeground(Color.BLACK);
        add(renterIDLbl);

        renterIDfield = new JTextField();
        renterIDfield .setBounds(650, 170, 180,30);
        renterIDfield .setFont(new Font("Serif", Font.PLAIN, 20));
        renterIDfield .setForeground(Color.DARK_GRAY);
        add(renterIDfield );




        logoutIcon.addActionListener(this);
        settingIcon.addActionListener(this);



        add(panel1);



    }

    public static void main(String[] args) {
        new Renter_userprofile().setVisible(true);
    }


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
        profileIcon.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/greenProfileIcon_109x104.png")))));
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

        //    ----------------label ,image, button for upload photo
        image = new JLabel();
        image.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/130x130.png")))));
        image.setBounds(160, 130, 130, 130);

        choosePhoto= new JButton("Upload photo");
        choosePhoto.setBounds(160,230,130,40);
        choosePhoto.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/uploadphoto135x35.png")))));
        choosePhoto.setBackground(Color.decode("#9F9391"));
        choosePhoto.setOpaque(true);
        choosePhoto.setBorderPainted(false);
        choosePhoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        label = new JLabel();
        label.setBounds(160,130,120,140);

        add(choosePhoto);
        add(label);
        add(image);

        choosePhoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser file = new JFileChooser();
                file.setCurrentDirectory(new File(System.getProperty("user.home")));
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif", "png");
                file.addChoosableFileFilter(filter);
                int result = file.showSaveDialog(null);
                if (result == JFileChooser.APPROVE_OPTION){
                    File selectedFile = file.getSelectedFile();
                    String path = selectedFile.getAbsolutePath();
                    label.setIcon(ResizeImage(path));
                }
                else if(result == JFileChooser.CANCEL_OPTION){
                    System.out.println("No file is Selected");
                }
            }
        });

    }


    public  ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage  = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }






}






