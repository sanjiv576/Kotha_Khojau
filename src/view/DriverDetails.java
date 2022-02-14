package view;

import controller.UserController;
import database.DbConnection;
import model.Driver_Details;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Objects;

public class DriverDetails extends JFrame implements ActionListener {

    boolean insertDriverInfo = true;
    // view.Images Labeling
    JLabel vertical, horizontal, titleImg , projectLogoImg, header;

    JButton homeIcon, profileIcon, settingIcon,driverIcon, logoutIcon;

    JLabel name, contact, location, chargeStatus, shortDistance, longDistance, vehicleSize;

    Object[] columns = {"Full Name", "Contact", "Available Locations", "Service Charge Status", "Short Distance",
            "Long Distance", "Vehicle Size"};
    JTable table;
    DefaultTableModel model;
    String fetchingData[][];

    public DriverDetails() {

        detailFetch();
        // insert driver details in the database
        if (insertDriverInfo){
            DbConnection dbConnection = new DbConnection();
            insertDriverInfo = dbConnection.driverDetailsInsert();
        }

        setTitle("Driver Details window");
        setBounds(100, 80, 1280, 745);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.darkGray);
        setLayout(null);
        setResizable(false);

        // invoking user-defined method to insert and manage icons for dashboard
        insertButtonIcons();


        header = new JLabel("Driver Details,     Get 20% Off !     ");
        header.setBounds(350, 120, 604, 35);
        header.setBackground(Color.getColor("9E9B9B"));
        header.setFont(new Font("Copperplate", Font.BOLD, 34));
        header.setForeground(Color.RED);
        header.setOpaque(true);
        add(header);

        // set a timer for moving label
        Timer timer = new Timer(300, this);
        timer.start();

        name = new JLabel("Full Name");
        name.setBounds(160, 160, 104, 20);
        name.setBackground(Color.getColor("9E9B9B"));
        name.setFont(new Font("cambria", Font.BOLD, 20));
        name.setOpaque(true);
        add(name);

        contact = new JLabel("Contact");
        contact.setBounds(350, 160, 104, 20);
        contact.setBackground(Color.getColor("9E9B9B"));
        contact.setFont(new Font("cambria", Font.BOLD, 20));
        contact.setOpaque(true);
        add(contact);

        location = new JLabel("Available Locations");
        location.setBounds(495, 160, 204, 20);
        location.setBackground(Color.getColor("9E9B9B"));
        location.setFont(new Font("cambria", Font.BOLD, 20));
        location.setOpaque(true);
        add(location);

        chargeStatus = new JLabel("Status");
        chargeStatus.setBounds(730, 160, 90, 20);
        chargeStatus.setBackground(Color.getColor("9E9B9B"));
        chargeStatus.setFont(new Font("cambria", Font.BOLD, 20));
        chargeStatus.setOpaque(true);
        add(chargeStatus);

        shortDistance = new JLabel("Near place");
        shortDistance.setBounds(843, 160, 120, 20);
        shortDistance.setBackground(Color.getColor("9E9B9B"));
        shortDistance.setFont(new Font("cambria", Font.BOLD, 20));
        shortDistance.setOpaque(true);
        add(shortDistance);

        longDistance = new JLabel("Far place");
        longDistance.setBounds(980, 160, 100, 20);
        longDistance.setBackground(Color.getColor("9E9B9B"));
        longDistance.setFont(new Font("cambria", Font.BOLD, 20));
        longDistance.setOpaque(true);
        add(longDistance);

        vehicleSize = new JLabel("Vehicle Size");
        vehicleSize.setBounds(1120, 160, 130, 20);
        vehicleSize.setBackground(Color.getColor("9E9B9B"));
        vehicleSize.setFont(new Font("cambria", Font.BOLD, 20));
        vehicleSize.setOpaque(true);
        add(vehicleSize);

        table = new JTable(model);
        table.setFont(new Font("Serif", Font.BOLD, 20));
        table.setSelectionBackground(Color.blue);
        table.setBackground(Color.decode("#957373"));
        table.setBounds(120, 200, 1130, 422);
        table.getTableHeader().setBackground(Color.green);
        table.setRowHeight(30);

        for (int i = 0; i < 7; i++) {
            if (i == 0 || i == 2){
                table.getColumnModel().getColumn(i).setPreferredWidth(120);
            }
            else if (i == 1){

                table.getColumnModel().getColumn(i).setPreferredWidth(30);
            }
            else {
                table.getColumnModel().getColumn(i).setPreferredWidth(20);
            }

        }

        table.getTableHeader().setFont(new Font("Serif", Font.BOLD, 18));

        add(table);


        logoutIcon.addActionListener(this);
        settingIcon.addActionListener(this);
        homeIcon.addActionListener(this);
        profileIcon.addActionListener(this);
        setVisible(true);

    }

    // ---------------- main method ----------------

    public static void main(String[] args) {

        new DriverDetails().setVisible(true);
    }

    //  event handling
    @Override
    public void actionPerformed(ActionEvent e) {

        // for moving label
        String oldText = header.getText();
        String newText= oldText.substring(1)+ oldText.substring(0,1);
        header.setText(newText);

        if (e.getSource().equals(logoutIcon)) {
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to log out ?",
                    "Log out", JOptionPane.YES_NO_CANCEL_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                dispose();
                new Signin().setVisible(true);
            }
        }


        if (e.getSource().equals(settingIcon)){
            dispose();
            new New_updateprofile().setVisible(true);
        }

        if (e.getSource().equals(homeIcon)){
            dispose();
            new Home().setVisible(true);
        }

        if (e.getSource().equals(profileIcon)){
            dispose();
            new UserProfile().setVisible(true);
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
        homeIcon.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/homeIcon_64x64.png")))));
        homeIcon.setBounds(15, 150, 64, 64);
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
        driverIcon.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/greendriver_100x100.png")))));
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


    // ------------------- user-defined method -----------------------

    public void detailFetch(){

        UserController userController = new UserController();
        List<Driver_Details> driverList = userController.getDriverDetails();

        fetchingData = new String[driverList.size()][7];

        // conversion from list to array  , select only need columns
        for (int i = 0; i < driverList.size(); i++){
            fetchingData[i][0] = driverList.get(i).getFullName();  // converting int data into String data
            fetchingData[i][1] = driverList.get(i).getContact();
            fetchingData[i][2] = driverList.get(i).getAvailableLocation();
            fetchingData[i][3] = driverList.get(i).getServiceChargeStatus();
            fetchingData[i][4] = driverList.get(i).getShortDistance();
            fetchingData[i][5] = driverList.get(i).getLongDistance();
            fetchingData[i][6] = driverList.get(i).getVehicleSize();


        }

        model = new DefaultTableModel(fetchingData, columns);

    }

}






