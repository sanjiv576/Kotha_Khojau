package view;

import controller.UserController;
import logic.SaveData;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.util.GregorianCalendar;
import java.util.Objects;

public class UserProfile extends JFrame implements ActionListener {


    // Images Labeling
    JLabel vertical, horizontal, titleImg, projectLogoImg, image;

    JButton homeIcon, profileIcon, settingIcon, driverIcon, logoutIcon;

    //panel
    JPanel panel1;

    JButton choosePhoto;
    JLabel label;

    //label and text fields or textarea
    JLabel aboutme, nameLbl, renterIDLbl, typeLbl,
            genderLbl, contactLbl, dobLbl, emailLbl, occupationLbl;
    JTextArea aboutMeField;
    JButton saveBtn, updateBtn, advertisementBtn, historyBtn;

    JLabel backgroundImg;

    static JLabel lblMonth, lblYear;
    static JButton btnPrev, btnNext;
    static JTable tblCalendar;
    static JComboBox cmbYear;
    static JFrame frmMain;
    static Container pane;
    static DefaultTableModel mtblCalendar; //Table model
    static JScrollPane stblCalendar; //The scrollpane
    static JPanel pnlCalendar;
    static int realYear, realMonth, realDay, currentYear, currentMonth;

    UserController userController = new UserController();
    String aboutMeData = "";

    public UserProfile() {

        aboutMeData = userController.retrieveAboutMe(SaveData.myUsername, SaveData.myPassword);
        String[] userList = userController.profileDetails(SaveData.myUsername, SaveData.myPassword);
        if (userList[2].equals("Renter")) {
            setTitle("Renter Profile");
        }
        else if (userList[2].equals("Owner")){
            setTitle("Owner Profile");

            advertisementBtn = new JButton();
            advertisementBtn.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/yellowAdvertiseBtn_172x52.png")))));
            advertisementBtn.setBounds(927, 461, 172, 52);
            advertisementBtn.setBackground(Color.decode("#9E9B9B"));
            advertisementBtn.setOpaque(true);
            advertisementBtn.setBorderPainted(false);
            advertisementBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            add(advertisementBtn);

            historyBtn = new JButton();
            historyBtn.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/yellowHistoryBtn_130x52.png")))));
            historyBtn.setBounds(948, 553, 130, 52);
            historyBtn.setBackground(Color.decode("#9E9B9B"));
            historyBtn.setOpaque(true);
            historyBtn.setBorderPainted(false);
            historyBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            add(historyBtn);
        }
        setBounds(100, 80, 1280, 740);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.darkGray);
        //setUndecorated(true);
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
        panel1.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel1.setBounds(140, 126, 1098, 550);
        panel1.setBackground(Color.decode("#9F9391"));
        panel1.setOpaque(true);

        // background image
        backgroundImg = new JLabel();
        backgroundImg.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/sky1061x200.png")))));
        backgroundImg.setBounds(160, 120, 1061, 200);
        backgroundImg.setBackground(Color.decode("#9E9B9B"));
        backgroundImg.setOpaque(true);
        panel1.add(backgroundImg);

        //  -----------------label and text fields for renter profile---------------------------

        aboutme = new JLabel("About Me");
        aboutme.setBounds(217, 370, 299, 73);
        aboutme.setFont(new Font("Copperplate", Font.BOLD, 35));
        aboutme.setForeground(Color.BLACK);
        add(aboutme);

        aboutMeField = new JTextArea(aboutMeData);
        aboutMeField.setBounds(207, 445, 393, 124);
        aboutMeField.setLineWrap(true);
        aboutMeField.setWrapStyleWord(true);
        aboutMeField.setFont(new Font("Serif", Font.BOLD, 20));
        aboutMeField.setEditable(false);
        aboutMeField.setForeground(Color.DARK_GRAY);
        add(aboutMeField);

        saveBtn = new JButton();
        saveBtn.setBounds(300, 579, 170, 70);
        saveBtn.setBackground(Color.decode("#9F9391"));
        saveBtn.setOpaque(true);
        saveBtn.setBorderPainted(false);
        saveBtn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/saveButton130x65.png"))));
        // changing mouse pointer to finger
        saveBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        saveBtn.setVisible(false);
        add(saveBtn);

        updateBtn = new JButton();
        updateBtn.setBounds(300, 579, 170, 70);
        updateBtn.setBackground(Color.decode("#9F9391"));
        updateBtn.setOpaque(true);
        updateBtn.setBorderPainted(false);
        updateBtn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/editButton130x65.png"))));
        // changing mouse pointer to finger
        updateBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(updateBtn);


        nameLbl = new JLabel("Name :");
        nameLbl.setBounds(500, 160, 100, 23);
        nameLbl.setFont(new Font("Serif", Font.BOLD, 23));
        nameLbl.setForeground(Color.WHITE);
        add(nameLbl);


        renterIDLbl = new JLabel("User ID :");
        renterIDLbl.setBounds(500, 200, 150, 25);
        renterIDLbl.setFont(new Font("Serif", Font.BOLD, 23));
        renterIDLbl.setForeground(Color.WHITE);
        add(renterIDLbl);

        typeLbl = new JLabel("Member Type :");
        typeLbl.setBounds(500, 240, 160, 23);
        typeLbl.setFont(new Font("Serif", Font.BOLD, 23));
        typeLbl.setForeground(Color.WHITE);
        add(typeLbl);

        genderLbl = new JLabel("Gender :");
        genderLbl.setBounds(500, 280, 150, 25);
        genderLbl.setFont(new Font("Serif", Font.BOLD, 23));
        genderLbl.setForeground(Color.WHITE);
        add(genderLbl);

        contactLbl = new JLabel("Contact :");
        contactLbl.setBounds(900, 160, 100, 23);
        contactLbl.setFont(new Font("Serif", Font.BOLD, 23));
        contactLbl.setForeground(Color.WHITE);
        add(contactLbl);

        dobLbl = new JLabel("DOB:");
        dobLbl.setBounds(900, 200, 150, 25);
        dobLbl.setFont(new Font("Serif", Font.BOLD, 23));
        dobLbl.setForeground(Color.WHITE);
        add(dobLbl);

        occupationLbl = new JLabel("Occupation :");
        occupationLbl.setBounds(900, 240, 160, 23);
        occupationLbl.setFont(new Font("Serif", Font.BOLD, 23));
        occupationLbl.setForeground(Color.WHITE);
        add(occupationLbl);

        emailLbl = new JLabel("Email :");
        emailLbl.setBounds(900, 280, 150, 25);
        emailLbl.setFont(new Font("Serif", Font.BOLD, 23));
        emailLbl.setForeground(Color.WHITE);
        add(emailLbl);


       // String[] userList = userController.profileDetails(SaveData.myUsername, SaveData.myPassword);

        String myName = userList[1];
        String myUserId = userList[0];
        String myType = userList[2];
        String myGender = userList[3];
        String myContact = userList[4];
        String myDOB = userList[5];
        String myOccupation = userList[6];
        String myEmail = userList[7];


        String[] retrieveData = {myName, myUserId, myType, myGender, myContact, myDOB, myOccupation, myEmail};

        int x_position = 650;
        int y_position = 160;
        int counter = 0;

        int fontSize = 0;

        try {
            for (int i = 0; i < retrieveData.length; i++) {

                // controlling x position and y position
                if (counter <= 3) {
                    if (counter == 0) {
                        y_position = 160;
                    } else {
                        y_position += 40;
                    }
                }

                if (counter >= 4) {

                    if (counter == 4) {
                        x_position += 400;
                        y_position -= 120;
                    } else if (counter == retrieveData.length - 1) {

                        x_position -= 80;
                        y_position += 40;
                    } else {
                        y_position += 40;
                    }
                }

                // controlling the font size
                if (counter == 0) {
                    fontSize = 23;
                }
                // for odd counter
                else if (counter % 2 == 1) {
                    fontSize = 25;
                    if (counter == retrieveData.length - 1) {

                        fontSize = 18;
                    }
                }
                // for even counter
                else if (counter % 2 == 0) {
                    fontSize = 23;
                }

                counter += 1;
                arrangeLabels(retrieveData[i], x_position, y_position, fontSize);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }


        logoutIcon.addActionListener(this);
        settingIcon.addActionListener(this);
        driverIcon.addActionListener(this);
        saveBtn.addActionListener(this);
        updateBtn.addActionListener(this);
        homeIcon.addActionListener(this);

        add(panel1);

    }

    // ------------------- main method -------------------

    public static void main(String args[]) {
        new UserProfile().setVisible(true);


        //Look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        } catch (UnsupportedLookAndFeelException e) {
        }

        //Prepare frame
        frmMain = new JFrame("Calender"); //Create frame
        frmMain.setSize(330, 375); //Set size to 400x400 pixels
        pane = frmMain.getContentPane(); //Get content pane
        pane.setLayout(null); //Apply null layout
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Close when X is clicked
        //Make frame visible
        frmMain.setResizable(false);
        frmMain.setVisible(true);

        //Create controls
        lblMonth = new JLabel("January");
        lblYear = new JLabel("Change year:");
        cmbYear = new JComboBox();
        btnPrev = new JButton("<");
        btnNext = new JButton(">");
        mtblCalendar = new DefaultTableModel() {
            public boolean isCellEditable(int rowIndex, int mColIndex) {
                return false;
            }
        };
        tblCalendar = new JTable(mtblCalendar);
        stblCalendar = new JScrollPane(tblCalendar);
        pnlCalendar = new JPanel(null);

        //Set border
        pnlCalendar.setBorder(BorderFactory.createTitledBorder("Calendar"));

        //Register action listeners
        btnPrev.addActionListener(new btnPrev_Action());
        btnNext.addActionListener(new btnNext_Action());
        cmbYear.addActionListener(new cmbYear_Action());

        //Add controls to pane
        pane.add(pnlCalendar);
        pnlCalendar.add(lblMonth);
        pnlCalendar.add(lblYear);
        pnlCalendar.add(cmbYear);
        pnlCalendar.add(btnPrev);
        pnlCalendar.add(btnNext);
        pnlCalendar.add(stblCalendar);

        //Set bounds
        pnlCalendar.setBounds(0, 0, 320, 335);
        lblMonth.setBounds(160 - lblMonth.getPreferredSize().width / 2, 25, 100, 25);
        lblYear.setBounds(10, 305, 80, 20);
        cmbYear.setBounds(230, 305, 80, 20);
        btnPrev.setBounds(10, 25, 50, 25);
        btnNext.setBounds(260, 25, 50, 25);
        stblCalendar.setBounds(10, 50, 300, 250);


        //Get real month/year
        GregorianCalendar cal = new GregorianCalendar(); //Create calendar
        realDay = cal.get(GregorianCalendar.DAY_OF_MONTH); //Get day
        realMonth = cal.get(GregorianCalendar.MONTH); //Get month
        realYear = cal.get(GregorianCalendar.YEAR); //Get year
        currentMonth = realMonth; //Match month and year
        currentYear = realYear;

        //Add headers
        String[] headers = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; //All headers
        for (int i = 0; i < 7; i++) {
            mtblCalendar.addColumn(headers[i]);
        }

        tblCalendar.getParent().setBackground(tblCalendar.getBackground()); //Set background

        //No resize/reorder
        tblCalendar.getTableHeader().setResizingAllowed(false);
        tblCalendar.getTableHeader().setReorderingAllowed(false);

        //Single cell selection
        tblCalendar.setColumnSelectionAllowed(true);
        tblCalendar.setRowSelectionAllowed(true);
        tblCalendar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //Set row/column count
        tblCalendar.setRowHeight(38);
        mtblCalendar.setColumnCount(7);
        mtblCalendar.setRowCount(6);

        //Populate table
        for (int i = realYear - 100; i <= realYear + 100; i++) {
            cmbYear.addItem(String.valueOf(i));
        }

        //Refresh calendar
        refreshCalendar(realMonth, realYear); //Refresh calendar
    }

    public static void refreshCalendar(int month, int year) {
        //Variables
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int nod, som; //Number Of Days, Start Of Month

        //Allow/disallow buttons
        btnPrev.setEnabled(true);
        btnNext.setEnabled(true);
        if (month == 0 && year <= realYear - 10) {
            btnPrev.setEnabled(false);
        } //Too early
        if (month == 11 && year >= realYear + 100) {
            btnNext.setEnabled(false);
        } //Too late
        lblMonth.setText(months[month]); //Refresh the month label (at the top)
        lblMonth.setBounds(160 - lblMonth.getPreferredSize().width / 2, 25, 180, 25); //Re-align label with calendar
        cmbYear.setSelectedItem(String.valueOf(year)); //Select the correct year in the combo box

        //Clear table
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                mtblCalendar.setValueAt(null, i, j);
            }
        }

        //Get first day of month and number of days
        GregorianCalendar cal = new GregorianCalendar(year, month, 1);
        nod = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        som = cal.get(GregorianCalendar.DAY_OF_WEEK);

        //Draw calendar
        for (int i = 1; i <= nod; i++) {
            int row = new Integer((i + som - 2) / 7);
            int column = (i + som - 2) % 7;
            mtblCalendar.setValueAt(i, row, column);
        }

        //Apply renderers
        tblCalendar.setDefaultRenderer(tblCalendar.getColumnClass(0), new tblCalendarRenderer());
    }

    static class tblCalendarRenderer extends DefaultTableCellRenderer {
        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            if (column == 0 || column == 6) { //Week-end
                setBackground(new Color(255, 220, 220));
            } else { //Week
                setBackground(new Color(255, 255, 255));
            }
            if (value != null) {
                if (Integer.parseInt(value.toString()) == realDay && currentMonth == realMonth && currentYear == realYear) { //Today
                    setBackground(new Color(220, 220, 255));
                }
            }
            setBorder(null);
            setForeground(Color.black);
            return this;
        }
    }

    static class btnPrev_Action implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (currentMonth == 0) { //Back one year
                currentMonth = 11;
                currentYear -= 1;
            } else { //Back one month
                currentMonth -= 1;
            }
            refreshCalendar(currentMonth, currentYear);
        }
    }

    static class btnNext_Action implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (currentMonth == 11) { //Foward one year
                currentMonth = 0;
                currentYear += 1;
            } else { //Foward one month
                currentMonth += 1;
            }
            refreshCalendar(currentMonth, currentYear);
        }
    }

    static class cmbYear_Action implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (cmbYear.getSelectedItem() != null) {
                String b = cmbYear.getSelectedItem().toString();
                currentYear = Integer.parseInt(b);
                refreshCalendar(currentMonth, currentYear);
            }
        }

    }


    // ------------------ events handling --------------------------

    @Override
    public void actionPerformed(ActionEvent e) {

        String About_Me = aboutMeField.getText();

        if (e.getSource().equals(logoutIcon)) {
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to log out ?",
                    "Log out", JOptionPane.YES_NO_CANCEL_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                dispose();
                new Signin().setVisible(true);
            }
        }
        if (e.getSource().equals(settingIcon)) {
            dispose();
            new New_updateprofile().setVisible(true);
        }
        if (e.getSource().equals(homeIcon)) {
            dispose();
            new Home().setVisible(true);
        }

        if (e.getSource().equals(saveBtn)) {
            JOptionPane.showMessageDialog(null, "Saved",
                    "Save Confirmation", JOptionPane.INFORMATION_MESSAGE);
            try {
                userController.insertAboutMe(About_Me);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            System.out.println(About_Me);
            aboutMeField.setEditable(false);
            saveBtn.setVisible(false);
            updateBtn.setVisible(true);
        }

        if (e.getSource().equals(updateBtn)) {
            aboutMeField.setEditable(true);
            updateBtn.setVisible(false);
            saveBtn.setVisible(true);

        }

        if (e.getSource().equals(driverIcon)){
            dispose();
            new DriverDetails().setVisible(true);
        }

    }

    // ---------------------------- user-defined methods ------------------------------

    // this method inserts left button icons
    public void insertButtonIcons() {

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

        driverIcon = new JButton();
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

        //    ----------------label ,image, button for upload photo -------------------
        image = new JLabel();
        image.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/130x130.png")))));
        image.setBounds(180, 150, 130, 130);

        choosePhoto = new JButton("Upload photo");
        choosePhoto.setBounds(180, 300, 130, 40);
        choosePhoto.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/uploadphoto135x35.png")))));
        choosePhoto.setBackground(Color.decode("#9F9391"));
        choosePhoto.setOpaque(true);
        choosePhoto.setBorderPainted(false);
        choosePhoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        label = new JLabel();
        label.setBounds(190, 150, 120, 140);

        add(choosePhoto);
        add(label);
        add(image);

        choosePhoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser file = new JFileChooser();
                file.setCurrentDirectory(new File(System.getProperty("user.home")));
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
                file.addChoosableFileFilter(filter);
                int result = file.showSaveDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = file.getSelectedFile();
                    String path = selectedFile.getAbsolutePath();
                    image.setVisible(false);
                    label.setIcon(ResizeImage(path));
                } else if (result == JFileChooser.CANCEL_OPTION) {
                    System.out.println("No file is Selected");
                }
            }
        });

    }


    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }


    // make and arrange labels

    public void arrangeLabels(String data, int x, int y, int fontSize) {

        JLabel label = new JLabel(data);
        label.setBounds(x, y, 300, 25);
        label.setFont(new Font("Serif", Font.BOLD, fontSize));
        label.setForeground(Color.BLACK);
        add(label);
    }
}







