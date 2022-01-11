//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//class Manisha extends JFrame {
//    JTabbedPane tabs;
//    SettingPanel Setting;
//    SelectCoursePanel selectCourse;
//
//    Manisha() {
//        super("Tabbed Pane Example");
//
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Setting the JTabbedPane Position and Layout as Wrap
//        tabs = new JTabbedPane(JTabbedPane.LEFT,JTabbedPane.WRAP_TAB_LAYOUT);
//
//        Setting = new SettingPanel();
//        // Adding user defined pannels to JTabbedPane
//        tabs.addTab("Home",new JPanel());
//        tabs.addTab("profile", selectCourse);
//        // Adding JPanels to JTabbedPane
//        tabs.addTab("user setting",Setting);
//
//        tabs.addTab("back", new JPanel());
//
//        getContentPane().add(tabs);
//    }
//}
//
///*Creating CoursePanel by extending JPanel*/
//class  SettingPanel extends JPanel {
//    JButton updateprofile,Changepassword,deleteaccount;
//
//    SettingPanel() {
//        updateprofile = new JButton("Update Profile");
//        Changepassword = new JButton("Changepassword");
//        deleteaccount = new JButton("Delete Account");
//
//        setLayout(new FlowLayout());
//        add(updateprofile);
//        add(Changepassword);
//        add(deleteaccount);
//    }
//}
///*Creating SelectCoursePanel by extending JPanel*/
//class SelectCoursePanel extends JPanel {
//    JCheckBox java, swing, hibernate;
//
//    SelectCoursePanel() {
//        java = new JCheckBox("Java");
//        swing = new JCheckBox("Spring");
//        hibernate = new JCheckBox("Hibernate");
//
//        setLayout(new FlowLayout());
//        add(java);
//        add(swing);
//        add(hibernate);
//    }
//}
//class JTabbedPaneDemo {
//    public static void main(String args[]) throws Exception {
//        Manisha frame = new Manisha();
//        frame.setSize(400, 400);
//        frame.setVisible(true);
//    }
//}