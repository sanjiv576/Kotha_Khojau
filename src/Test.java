import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Random;
class Test extends JFrame implements ActionListener {
    JButton homeBtn, profileBtn, settingBtn;
    JLabel a;
    JPanel leftPanel, rightPanel, homePanel, profilePanel, settingPanel,topPanel;
    // for every buttons
    JTabbedPane centerTabPane;

    // inside rightPanel --> settingPanel
    JButton updateAcBtn, changePasswordBtn, deleteAcBtn;

    // for only setting button -- > update profile, change password, delete account features/panels
    JTabbedPane settingTabPane;

    JComponent updateProfilePanel, changePasswordPanel, deleteAcPanel;


    public Test(){
        setTitle("Dashboard");
        setBounds(40, 50, 1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);


        leftPanel = new JPanel();
        leftPanel.setBounds(0, 0, 100, 720);
        leftPanel.setBackground(Color.darkGray);
        leftPanel.setOpaque(true);
        add(leftPanel);

        homeBtn = new JButton("Home");
        homeBtn.setBounds(20, 400, 60, 20);
        leftPanel.add(homeBtn);

        profileBtn = new JButton("profile");
        profileBtn.setBounds(20, 600, 60, 20);
        leftPanel.add(profileBtn);

        settingBtn = new JButton("setting");
        settingBtn.setBounds(20, 800, 60, 20);
        leftPanel.add(settingBtn);

        topPanel = new JPanel();
        topPanel.setBounds(100, 0, 1180, 60);
        topPanel.setBackground(Color.black);
        topPanel.setOpaque(true);
        add(topPanel);

//        rightPanel = new JPanel();
//        rightPanel.setBounds(100, 61, 1180, 660);
//        rightPanel.setBackground(Color.green);
//        rightPanel.setOpaque(true);
//        add(rightPanel);

        centerTabPane = new JTabbedPane();

        centerTabPane.setLayout(new GridLayout(1,1));
        centerTabPane.setBounds(101, 61, 1180, 660);
        centerTabPane.setLayout(new GridLayout(1,1));
        centerTabPane.addTab("Home", makePanel("tab -1 "));
        centerTabPane.addTab("profile", makePanel("tab -2 "));
        centerTabPane.addTab("Setting", makeSettingPanel());

        add(centerTabPane);

//        homePanel = new JPanel();
//        homePanel.setBounds(100, 0, 800, 650);
//        homePanel.setBackground(Color.yellow);
//        homePanel.setOpaque(true);
//        add(homePanel);
//
//        profilePanel = new JPanel();
//        profilePanel.setBounds(100, 0, 800, 650);
//        profilePanel.setBackground(Color.blue);
//        profilePanel.setOpaque(true);
//        add(profilePanel);
//
//        settingPanel = new JPanel();
//        settingPanel.setBounds(100, 0, 800, 650);
//        settingPanel.setBackground(Color.red);
//        settingPanel.setOpaque(true);
//        add(settingPanel);

        homeBtn.addActionListener(this);
        settingBtn.addActionListener(this);
        profileBtn.addActionListener(this);
        setVisible(true);
    }

    protected JComponent makeUpdateProfilePanel(){
        JPanel panel = new JPanel();
        panel.setBounds(20, 20,600, 400);

        return panel;
    }

    // methods need to be changed
    public static JPanel makePanel(String text) {
        JPanel p = new JPanel();
        p.add(new Label(text));
        p.setLayout(new GridLayout(1, 1));
        return p;
    }
    public static JPanel makeSettingPanel(){
        JPanel settingPanel = new JPanel();

        JButton updateProfile = new JButton();
        settingPanel.add(updateProfile);

        //settingPanel.setLayout(new GridLayout(1,1));
        return settingPanel;
    }

    public static void main(String[] args) {
        new Test().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(homeBtn)){
            JOptionPane.showMessageDialog(null, "home button is clicked", "Alert !!", JOptionPane.INFORMATION_MESSAGE);

            centerTabPane.setSelectedIndex(0);
        }

        if (e.getSource().equals(profileBtn)){
            JOptionPane.showMessageDialog(null, "profile button is clicked", "Alert !!", JOptionPane.INFORMATION_MESSAGE);

            centerTabPane.setSelectedIndex(1);
        }

        if (e.getSource().equals(settingBtn)){
            JOptionPane.showMessageDialog(null, "setting button is clicked", "Alert !!", JOptionPane.INFORMATION_MESSAGE);

            centerTabPane.setSelectedIndex(2);
//            JTabbedPane tabbedPane = new JTabbedPane();
//            updateProfilePanel = makeUpdateProfilePanel();
//           // tabbedPane.addTab(updateProfilePanel);
//            tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
        }

//
//        if (e.getSource().equals(updateProfile)){
//            System.out.println("hello");
//        }

    }
}
